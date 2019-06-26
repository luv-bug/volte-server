package com.yuwei.volte.model;

import java.util.Date;

import lombok.Data;

@Data
public class CallDetailDto {
	private Integer id;
	private Integer callid;
	private String calltype;
	private String cpn;
	private String cpdn;
	private Integer calllong;
	private String recordpath;
	private long createdate;
	private String testresult;

}
