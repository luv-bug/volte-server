package com.yuwei.volte.service.result;
import java.util.List;

import com.yuwei.volte.model.CallDetailResp;

import lombok.Data;


	@Data
	public class CallDetailResult extends PageResult {
		List<CallDetailResp> values;
	}



