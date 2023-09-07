package com.example.cloudalibabaconfignacosclient3377;

import com.alibaba.nacos.api.annotation.NacosProperties;
import com.alibaba.nacos.api.config.ConfigType;
import com.alibaba.nacos.api.config.annotation.NacosConfigurationProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableDiscoveryClient
/*
@NacosConfigurationProperties(dataId = "nacos-config-client-dev.yaml",autoRefreshed = true,type = ConfigType.YAML)
*/
public class CloudAlibabaConfigNacosClient3377Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudAlibabaConfigNacosClient3377Application.class, args);
    }

}
