package com.example.monitoring.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class BitController {
    Logger log = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/")
    public String index() {
        return "Bitcoin Lion";
    }

    @GetMapping("/bit")
    public String bit() {
        return "hello Lion";
    }

    @GetMapping("/log-test")
    public String logTest() {
        log.info("INFO 로그입니다.  평소에도 잘 보여요^^");
        log.debug("DEBUG 로그입니다. 평소에는 안보이겠죠??  (이것을 보이게 해볼까요???)");
        return "log test";
    }
    @GetMapping("/sleep")
    public String sleep() throws InterruptedException {
        log.info("INFO 로그입니다.  평소에도 잘 보여요^^");
        Thread.sleep(1000);
        return "wake up";
    }
}