package com.yuwei.volte.model;

import lombok.Data;

@Data
public class CallMeasureDto {
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
	private long calltime;
    private String testresult;
    private String uploadtype;
	private long calllong;

}
