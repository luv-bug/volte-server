package com.yuwei.volte.entity;

import java.util.Date;

public class MaterielDO {
    private Integer id;

    private String name;

    private String partner;

    private Date starttime;

    private Date endtime;

    private String prcurl;

    private String homeurl;

    private String moment;

    private Integer delflag;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPartner() {
        return partner;
    }

    public void setPartner(String partner) {
        this.partner = partner == null ? null : partner.trim();
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public String getPrcurl() {
        return prcurl;
    }

    public void setPrcurl(String prcurl) {
        this.prcurl = prcurl == null ? null : prcurl.trim();
    }

    public String getHomeurl() {
        return homeurl;
    }

    public void setHomeurl(String homeurl) {
        this.homeurl = homeurl == null ? null : homeurl.trim();
    }

    public String getMoment() {
        return moment;
    }

    public void setMoment(String moment) {
        this.moment = moment == null ? null : moment.trim();
    }

    public Integer getDelflag() {
        return delflag;
    }

    public void setDelflag(Integer delflag) {
        this.delflag = delflag;
    }
}