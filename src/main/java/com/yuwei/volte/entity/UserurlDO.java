package com.yuwei.volte.entity;

import java.util.Date;

public class UserurlDO {
    private Long id;

    private String openid;

    private Integer meterielid;

    private Date addtime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    public Integer getMeterielid() {
        return meterielid;
    }

    public void setMeterielid(Integer meterielid) {
        this.meterielid = meterielid;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }
}