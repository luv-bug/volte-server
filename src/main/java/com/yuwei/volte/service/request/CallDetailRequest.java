package com.yuwei.volte.service.request;

import lombok.Data;

@Data
public class CallDetailRequest extends PageRequest {
    private int callid;
    private String calltype;
}

