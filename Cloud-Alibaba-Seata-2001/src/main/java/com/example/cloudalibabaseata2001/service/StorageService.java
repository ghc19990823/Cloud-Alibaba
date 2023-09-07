package com.example.cloudalibabaseata2001.service;

import com.example.cloudapicommons.entites.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "seata-storage-service")
public interface StorageService {
    @PostMapping("/storage/decrease")
    CommonResult decrease(@RequestParam("productId") Long productId,@RequestParam("count") Integer count);
}
