package com.yuwei.volte.service.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.yuwei.volte.common.GeneralConv;
import com.yuwei.volte.db.dao.CallMeasureMapper;
import com.yuwei.volte.db.domain.CallMeasure;
import com.yuwei.volte.db.domain.CallMeasureExample;
import com.yuwei.volte.model.CallMeasureDto;
import com.yuwei.volte.model.CallMeasureResp;
import com.yuwei.volte.service.CallService;
import com.yuwei.volte.service.request.CallMeasureRequest;
import com.yuwei.volte.service.result.CallMeasureResult;
//import com.yuwei.volte.util.GeoHashUtils;
import com.yuwei.volte.util.ResultBuilder;

@Service
public class CallServiceImpl implements CallService {
    @Resource
    private CallMeasureMapper callMeasureMapper;

    @Override
    public int addCallMeasureList(List<CallMeasureDto> callMeasureDtoList) {
        for(CallMeasureDto callMeasureDto:callMeasureDtoList){
        	Date date =new Date(callMeasureDto.getCalltime());
            CallMeasure record = new CallMeasure();
            BeanUtils.copyProperties(callMeasureDto,record);
            record.setCalltime(date);
            int result = callMeasureMapper.insert(record);
            if(result>0) {
            	CallMeasure newCall = queryLastOne(record.getCpn(), record.getCpdn());
            	if(newCall!=null) return newCall.getId();
            }
        }
        return 0;
    }

    @Override
    public CallMeasureResult queryPage(CallMeasureRequest request) {
        CallMeasureExample example = new CallMeasureExample();
        CallMeasureExample.Criteria criteria = example.createCriteria();
        if(request.getCpn()==null && request.getCpdn()==null) {
        	return ResultBuilder.succPageResult(CallMeasureResult.class, request.getPage(), request.getRows(), 0);
        }
        if(request.getCpn()!=null) {
            criteria.andCpnEqualTo(request.getCpn());
        }
        if(request.getCpdn()!=null) {
            criteria.andCpdnEqualTo(request.getCpdn());
        }

        long countByExample = callMeasureMapper.countByExample(example);

        example.setOffset(request.start4Mysql());
        example.setRows(request.getRows());
        example.setOrderByClause("calltime desc");
        List<CallMeasure> callMeasures = callMeasureMapper.selectByExample(example);

        CallMeasureResult result = ResultBuilder.succPageResult(CallMeasureResult.class,
                request.getPage(), request.getRows(), Integer.parseInt(countByExample + ""));
        result.setValues(GeneralConv.convert2List(callMeasures, CallMeasureResp.class));
        return result;
    }

    //插入被叫信息时验证
	@Override
	public int addCpdnCallMeasureList(CallMeasureDto callMeasureDto) {
    	CallMeasure callMeasureDB=queryByCpnAndCpdn(callMeasureDto.getCpn(),callMeasureDto.getCpdn());
    	if(callMeasureDB!=null) {
    		Integer id = callMeasureDB.getId();
    		long callTimeDB = callMeasureDB.getCalltime().getTime();
    		long callTime = callMeasureDto.getCalltime();
    		if(callTime-callTimeDB < 120*1000) {
    			CallMeasure record = new CallMeasure();
    			BeanUtils.copyProperties(callMeasureDto,record);
    			record.setId(id);
    			callMeasureDto.setId(id);
    			return callMeasureMapper.updateByPrimaryKeySelective(record);
    		}
    	}
        return 0;
	}
	
	//通过cpn和cpdn查询数据
	public  CallMeasure queryByCpnAndCpdn(String cpn,String cpdn) {
		CallMeasureExample example = new CallMeasureExample();
		CallMeasureExample.Criteria criteria = example.createCriteria();
		criteria.andCpnEqualTo(cpn).andCpdnEqualTo(cpdn).andUploadtypeEqualTo("0");
        example.setOrderByClause("calltime desc");
        return callMeasureMapper.selectOneByExample(example);
	}
	//通过cpn和cpdn查询数据
	public  CallMeasure queryLastOne(String cpn,String cpdn) {
		CallMeasureExample example = new CallMeasureExample();
		CallMeasureExample.Criteria criteria = example.createCriteria();
		criteria.andCpnEqualTo(cpn).andCpdnEqualTo(cpdn);
        example.setOrderByClause("id desc");
        return callMeasureMapper.selectOneByExample(example);
	}

    
 
    
    
	
}
