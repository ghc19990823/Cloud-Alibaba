package com.example.cloudalibabasentinelservice8001.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;

import com.example.cloudalibabasentinelservice8001.myhandler.CustomerBLockHandler;
import com.example.cloudapicommons.entites.CommonResult;
import com.example.cloudapicommons.entites.Payment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RateLimitController {

    @GetMapping("/byResource")
    @SentinelResource(value = "byResource",blockHandler = "handleException")
    public CommonResult byResource(){
        return new CommonResult(200,"按资源名称限流测试OK",new Payment(2020L,"serial001"));
    }
    public CommonResult handleException(BlockException e){
        return new CommonResult(111,e.getClass().getCanonicalName()+"\t"+"服务不可用");
    }

   /*CustomerBLockHandler*/
    @GetMapping("/rateLimit/customerBlockHandler")
    @SentinelResource(value = "customerBlockHandler",blockHandlerClass = CustomerBLockHandler.class,blockHandler = "handlerException2")
    public CommonResult customerBlockHandler(){
        return new CommonResult(200,"按用户自定义",new Payment(2020L,"serial003"));
    }

}
