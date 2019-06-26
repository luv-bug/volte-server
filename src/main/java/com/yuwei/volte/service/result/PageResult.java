package com.yuwei.volte.service.result;

import lombok.Data;

/**
 * @auther: Levon
 * @version: V 0.1 2018-05-30 15:38
 */
@Data
public class PageResult {
    protected int page;
    protected int totalPage;
    protected int rows;
    protected int totalRows;
}
