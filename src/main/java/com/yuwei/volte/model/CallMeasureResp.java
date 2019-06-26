package com.yuwei.volte.model;

import java.util.Date;

import lombok.Data;

@Data
public class CallMeasureResp {
	private Integer id;
	private String cpn;
	private String cpnlocation;
	private String cpnlongitude;
	private String cpnlatitude;
	private String cpnrecordpath;
	private String cpnremark;
	private String cpdn;
	private String cpdnlocation;
	private String cpdnlongitude;
	private String cpdnlatitude;
	private String cpdnrecordpath;
	private String cpdnremark;
	private Date calltime;
    private String testresult;
    private String uploadtype;
	private long calllong;

}
