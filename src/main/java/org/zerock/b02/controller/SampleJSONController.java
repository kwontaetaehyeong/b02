package org.zerock.b02.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//Rest 는 화면(View)없이 바로 제이슨 문자열로 전달
@RestController
@Log4j2
public class SampleJSONController {

    @GetMapping("/helloArr")
    public String[] helloArr() {
        log.info("helloArr...");
        return new String[]{"AAA", "BBB", "CCC", "DDD"};
    }
}
