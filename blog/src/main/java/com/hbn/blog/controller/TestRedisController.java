package com.hbn.blog.controller;

import com.hbn.blog.config.RedisClientTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestRedisController {


    @Autowired
    RedisClientTemplate redisClientTemplate;

    @GetMapping(value = "/testSet")
    @ResponseBody
    public Object testSet(){
        redisClientTemplate.setToRedis("Frank","Frank测试redis");
        System.out.println(redisClientTemplate.getRedis("Frank"));
        return "ok";
    }


}
