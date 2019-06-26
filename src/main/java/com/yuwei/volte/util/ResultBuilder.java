package com.yuwei.volte.util;

import com.yuwei.volte.service.result.PageResult;


/**
 * @auther: Levon
 * @version: V 0.1 2018-05-30 15:53
 */
public class ResultBuilder {

    public ResultBuilder() {
    }
    public static <T extends PageResult> T succPageResult(Class<T> clz, int page, int rows, int totalCount) {
        try {
            PageResult rs = (PageResult)clz.newInstance();
            rs.setPage(page);
            rs.setRows(rows);
            int totalPage = totalCount % rows == 0 ? totalCount / rows : totalCount / rows + 1;
            rs.setTotalPage(totalPage > 0 ? totalPage : 1);
            rs.setTotalRows(totalCount);
            return (T)rs;
        } catch (IllegalAccessException | InstantiationException var6) {
            throw new RuntimeException(var6);
        }
    }


}
