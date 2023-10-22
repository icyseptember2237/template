package com.example.template;

import cn.hutool.extra.spring.SpringUtil;
import com.example.template.config.ThreadAndAsync.AsyncExecutor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.annotation.PreDestroy;

@Slf4j
@SpringBootApplication
@EnableAsync
@EnableScheduling
@EnableTransactionManagement
//@EnableServletRequestLog
public class TemplateApplication {

    public static void main(String[] args) {
        SpringApplication.run(TemplateApplication.class, args);
        Environment environment = SpringUtil.getBean(Environment.class);
        log.info("启动成功，位于端口" + environment.getProperty("server.port"));
    }

    @PreDestroy
    public void shutdown(){
        try
        {
            log.info("====关闭异步任务线程池====");
            AsyncExecutor.executor().shutdown();
        }
        catch (Exception e)
        {
            log.error(e.getMessage(), e);
        }
    }

}
