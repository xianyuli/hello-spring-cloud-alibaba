package com.xianyuli.alibaba.consumer.config;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "service-provider")
public interface EchoServiceFeign {
    
    @GetMapping(value = "/echo/{string}")
    public String echo(@PathVariable String string);

}
