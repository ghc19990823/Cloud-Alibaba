package com.example.cloudalibabasentinelservice8001.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FlowimitController {

    @GetMapping("/testA")
    public String testA(){
        return "TestA";
    }

    @GetMapping("/testB")
    public String testB(){
        return "TestB";
    }

    @GetMapping("/testC")
    public String testC(){
        int a = 10/0;
        return "TestB";
    }

    @GetMapping("/testHotKey")
    @SentinelResource(value = "testHotKey",blockHandler = "deal_testHotKey")
    public String testHotKey(@RequestParam(value = "p1",required = false)String p1,
                             @RequestParam(value = "p1",required = false)String p2){
     /*   try {
            int a = 10 / 0;
        }catch (Exception e){
            e.printStackTrace();
        }*/
        return "----testHotKey";
    }

    public String deal_testHotKey(String p1, String p2, BlockException e){
            return "---deal_testHotKey";
    }

}
