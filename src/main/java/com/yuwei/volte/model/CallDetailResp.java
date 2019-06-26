package com.yuwei.volte.model;

import java.util.Date;

import lombok.Data;

@Data
public class CallDetailResp {
	private Integer id;
	private Integer callid;
	private String calltype;
	private long calllong;
	private String recordpath;
	private Date createdate;
	private String testresult;

}
