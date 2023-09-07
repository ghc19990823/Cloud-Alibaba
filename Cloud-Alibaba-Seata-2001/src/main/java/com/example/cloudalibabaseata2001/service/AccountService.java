package com.example.cloudalibabaseata2001.service;

import com.example.cloudapicommons.entites.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

@FeignClient(value = "seata-account-service")
public interface AccountService {

    @PostMapping("/account/decrease")
    CommonResult decrease(@RequestParam("userId") Long userId,@RequestParam("money") BigDecimal money);
}
