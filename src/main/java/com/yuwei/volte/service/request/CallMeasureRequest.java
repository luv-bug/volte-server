package com.yuwei.volte.service.request;

import lombok.Data;

@Data
public class CallMeasureRequest extends PageRequest {
    private String cpn;
    private String cpdn;
}

