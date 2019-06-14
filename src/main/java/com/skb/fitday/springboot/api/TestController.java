package com.skb.fitday.springboot.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    private static final Logger logger = LoggerFactory.getLogger("Application");

    @PostMapping("/{param1}")
    public ResponseEntity<String> home(String param) {
        logger.debug(this.getClass().getName() + " > " + "아몰랑 메소드명 찍고" + " > " + param);
        return new ResponseEntity<String>("okokokok", HttpStatus.OK);
    }

}
