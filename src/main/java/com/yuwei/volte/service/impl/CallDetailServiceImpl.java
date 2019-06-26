package com.yuwei.volte.service.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.yuwei.volte.common.GeneralConv;
import com.yuwei.volte.db.dao.CallDetailMapper;
import com.yuwei.volte.db.domain.CallDetail;
import com.yuwei.volte.db.domain.CallDetailExample;
import com.yuwei.volte.model.CallDetailDto;
import com.yuwei.volte.model.CallDetailResp;
import com.yuwei.volte.service.CallDetailService;
import com.yuwei.volte.service.request.CallDetailRequest;
import com.yuwei.volte.service.result.CallDetailResult;
//import com.yuwei.volte.util.GeoHashUtils;
import com.yuwei.volte.util.ResultBuilder;

@Service
public class CallDetailServiceImpl implements CallDetailService {
    @Resource
    private CallDetailMapper callDetailMapper;

    @Override
    public int addCallDetail(CallDetailDto callDetailDto) {
    	Date date =new Date(callDetailDto.getCreatedate());
    	CallDetail record = new CallDetail();
        BeanUtils.copyProperties(callDetailDto,record);
        record.setCreatedate(date);
        return callDetailMapper.insert(record);
    }

    @Override
    public CallDetailResult queryPage(CallDetailRequest request) {
        CallDetailExample example = new CallDetailExample();
        CallDetailExample.Criteria criteria = example.createCriteria();
        criteria.andCallidEqualTo(request.getCallid());
        if(request.getCalltype()!=null) {
            criteria.andCalltypeEqualTo(request.getCalltype());
        }

        long countByExample = callDetailMapper.countByExample(example);

        example.setOffset(request.start4Mysql());
        example.setRows(request.getRows());
        example.setOrderByClause("createdate desc");
        List<CallDetail> callMeasures = callDetailMapper.selectByExample(example);

        CallDetailResult result = ResultBuilder.succPageResult(CallDetailResult.class,
                request.getPage(), request.getRows(), Integer.parseInt(countByExample + ""));
        result.setValues(GeneralConv.convert2List(callMeasures, CallDetailResp.class));
        return result;
    }
	
}
