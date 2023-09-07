package com.example.cloudalibabasentinelservice8001.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.example.cloudapicommons.entites.CommonResult;

public class CustomerBLockHandler {

    public static CommonResult handlerException(BlockException e){
        return new CommonResult(123,"按客户自定义，global handlerException1");
    }
    public static CommonResult handlerException2(BlockException e){
        return new CommonResult(123,"按客户自定义，global handlerException2");
    }
}
