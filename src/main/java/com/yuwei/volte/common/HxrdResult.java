package com.yuwei.volte.common;

import lombok.Data;

import java.util.List;

/**
 * Created by IBM on 2018/4/28.
 */
@Data
public class HxrdResult {
    private int status = 200;
    private String msg;
    private List<HxrdRspData> data;

    @Override
    public String toString() {
        return "HxrdResult{" +
                "status=" + status +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
