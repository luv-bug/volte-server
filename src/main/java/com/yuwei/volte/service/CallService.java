package com.yuwei.volte.service;

import java.util.List;

import com.yuwei.volte.db.domain.CallMeasure;
import com.yuwei.volte.model.CallMeasureDto;
import com.yuwei.volte.service.request.CallMeasureRequest;
import com.yuwei.volte.service.result.CallMeasureResult;

public interface CallService {
	public int addCallMeasureList(List<CallMeasureDto> callMeasureList);
	CallMeasureResult queryPage(CallMeasureRequest request);
	//插入被叫信息时验证
	public int addCpdnCallMeasureList(CallMeasureDto callMeasureList);
	//通过cdn和cpdn查询数据
	public  CallMeasure queryByCpnAndCpdn(String cpn,String cpdn);

}
