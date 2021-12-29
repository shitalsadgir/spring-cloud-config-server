package com.in28minutes.microservices.springcloudconfigserver.controller;

import com.in28minutes.microservices.springcloudconfigserver.bean.LimitsConfiguration;
import com.in28minutes.microservices.springcloudconfigserver.service.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {
    @Autowired
    public Configuration configuration;

    @GetMapping("/limits")
    public LimitsConfiguration retriveLimitsConfiguration(){
        return new LimitsConfiguration(configuration.getMinimum(),configuration.getMaximum());
    }
}
