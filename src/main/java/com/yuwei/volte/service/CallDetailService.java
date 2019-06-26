package com.yuwei.volte.service;

import java.util.List;

import com.yuwei.volte.db.domain.CallMeasure;
import com.yuwei.volte.model.CallDetailDto;
import com.yuwei.volte.model.CallMeasureDto;
import com.yuwei.volte.service.request.CallDetailRequest;
import com.yuwei.volte.service.request.CallMeasureRequest;
import com.yuwei.volte.service.result.CallDetailResult;
import com.yuwei.volte.service.result.CallMeasureResult;

public interface CallDetailService {
	public int addCallDetail(CallDetailDto callDetail);
	CallDetailResult queryPage(CallDetailRequest request);

}
