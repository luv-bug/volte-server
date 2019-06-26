package com.yuwei.volte.service.result;
import java.util.List;

import com.yuwei.volte.db.domain.CallMeasure;
import com.yuwei.volte.model.CallMeasureResp;

import lombok.Data;


	@Data
	public class CallMeasureResult extends PageResult {
		List<CallMeasureResp> values;
	}



