package com.yuwei.volte.common;

import lombok.Data;

/**
 * Created by IBM on 2018/4/28.
 */
@Data
public class HxrdRspData {
    private String picUrl;
    private String skipUrl;
    private String prizeId;

    @Override
    public String toString() {
        return "HxrdRspData{" +
                "picUrl='" + picUrl + '\'' +
                ", skipUrl='" + skipUrl + '\'' +
                ", prizeId='" + prizeId + '\'' +
                '}';
    }
}
