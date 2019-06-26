package com.yuwei.volte.service.request;

import lombok.Data;

/**
 * @auther: Levon
 * @version: V 0.1 2018-05-30 15:46
 */
@Data
public class PageRequest {
    protected int page = 1;
    protected int rows = 10;

    public PageRequest() {
    }

    public int start4Mysql() {
        return this.page > 1 ? (this.page - 1) * this.rows : 0;
    }

    public int getPage() {
        return this.page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getRows() {
        return this.rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }
}
