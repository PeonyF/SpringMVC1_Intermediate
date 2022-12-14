package com.springmvc1.intermediate.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;


@RestController
@Slf4j
public class LogTestController {
    //private final Logger logger = LoggerFactory.getLogger(getClass());

    @RequestMapping("/log-test")
    public String logTest() {
        String name = "Spring";

        log.info("info log={}", name);
        log.trace("trace log={}", name);
        log.info("trace log={}", name);
        log.warn("trace log={}", name);
        log.error("trace log={}", name);

        return "OK";

    }
}
