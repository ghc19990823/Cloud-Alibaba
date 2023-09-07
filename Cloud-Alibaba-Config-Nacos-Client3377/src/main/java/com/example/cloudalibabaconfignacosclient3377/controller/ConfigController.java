package com.example.cloudalibabaconfignacosclient3377.controller;


import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @RefreshScope支持Nacos动态刷新Config配置
 * */
@RestController
@RefreshScope
public class ConfigController {

    @Value("${config.info}")
    private String configInfo;

    @GetMapping("/config/info")
    public String getConfigInfo(){
        return configInfo;
    }
}
