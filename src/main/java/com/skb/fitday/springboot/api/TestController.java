package com.skb.fitday.springboot.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

//    private static final Logger logger = LoggerFactory.getLogger("Application");

    @PostMapping("/home/{param}")
    public ResponseEntity<String> home(@PathVariable String param) {
//        logger.debug(this.getClass().getName() + " > " + "아몰랑 메소드명 찍고" + " > " + param);
        System.out.println(param);
        return new ResponseEntity<String>("okokokok", HttpStatus.OK);
    }

    @RequestMapping("/hello")
    public String hello(@PathVariable String name) {
        return "Hello, " + name + "!";
    }

}
