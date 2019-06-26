package com.yuwei.volte.common;

import lombok.Data;

/**
 * Created by IBM on 2018/4/28.
 */
@Data
public class HxrdReqData {
    private String openid;
    private String qrcode;

    @Override
    public String toString() {
        return "HxrdReqData{" +
                "openid='" + openid + '\'' +
                ", qrcode='" + qrcode + '\'' +
                '}';
    }
}
