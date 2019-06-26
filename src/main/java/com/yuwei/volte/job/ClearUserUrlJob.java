package com.yuwei.volte.job;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author Willard Hu on 2017/12/17.
 */
@Component
public class ClearUserUrlJob {
    private final transient Logger logger = LoggerFactory.getLogger(getClass());

   /* @Autowired
    private IUserurlService userurlService;

    // 测试时间 0 0/10 * * * ? 10分钟一次
    // 正式时间 0 0 0 * * ? 每天凌晨执行一次
    @Scheduled(cron = "0 0/1 * * * ?")
    public void execute() {
        logger.info("Clear login data times.");
        userurlService.deleteUserurl();
    }*/
}
