package com.inforun.controller;

import com.inforun.model.SystemLog;
import com.inforun.service.SystemLogService;
import com.inforun.service.redis.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("systemlog")
@RestController
public class SystemLogController {
    @Autowired
    SystemLogService systemLogService;

    @Autowired
    RedisService redisService;

    @RequestMapping(value = "/getById")
    public SystemLog getById(){
        SystemLog systemLog = systemLogService.byId(474351);
        return systemLog;
    }

    @RequestMapping(value = "/addRedisData")
    @ResponseBody
    public String addRedisData(){

        String key = "redisTest";
        String value = "{test:1}";
        redisService.set(key,value);
        return "Saved Success";
    }






}
