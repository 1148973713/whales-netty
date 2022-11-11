package com.social.whales.netty.controller;

import com.social.whales.netty.service.WhalesChatGroupOnlineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//@RequestMapping("/hello")
public class HelloTestController {
    @Autowired
    WhalesChatGroupOnlineService whalesChatGroupOnlineService;

    @GetMapping("/hello/test")
    @ResponseBody
    public Boolean helloTest(){
        return whalesChatGroupOnlineService.saveWhalesChatGroupOnlineStatus("TwoTestIndex.html",null);
    }
}