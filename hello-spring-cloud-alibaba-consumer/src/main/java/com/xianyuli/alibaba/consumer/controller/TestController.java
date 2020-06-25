package com.xianyuli.alibaba.consumer.controller;

import com.xianyuli.alibaba.consumer.config.EchoServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {


    //private RestTemplate restTemplate;
    private final EchoServiceFeign echoService;

    @Autowired
    public TestController(EchoServiceFeign echoService) {
        this.echoService = echoService;
    }

    @GetMapping(value = "/echo/{str}")
    public String echo(@PathVariable String str) {
        // 使用服务名请求服务提供者
        //return restTemplate.getForObject("http://service-provider/echo/" + str, String.class);
        return echoService.echo(str);
    }


}
