package com.skb.fitday.springboot.api;

import com.skb.fitday.springboot.domain.ApiRequestMessage;
import com.skb.fitday.springboot.domain.ApiResponseMessage;
import com.skb.fitday.springboot.domain.ReqVo;
import com.skb.fitday.springboot.domain.TestVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/test")
public class TestController {

    private static final Logger logger = LoggerFactory.getLogger(TestController.class);

    @PostMapping("/home/{param}")
    public ResponseEntity<String> home(@PathVariable String param) {
        logger.debug(this.getClass().getName() + " > " + "아몰랑 메소드명 찍고" + " > " + param);
        System.out.println(param);
        logger.error("error.......");
        return new ResponseEntity<String>("okokokok", HttpStatus.OK);
    }

    @GetMapping("/health")
    public ResponseEntity healthCheck() {
        return new ResponseEntity(HttpStatus.OK);
    }

    @PostMapping("/res.test")
    public ResponseEntity<ApiResponseMessage> nuguTest(@RequestBody @Valid ApiRequestMessage reqMsg) {
//    public ResponseEntity<ApiResponseMessage> nuguTest(@RequestBody @Valid ReqVo reqMsg) {



        ApiResponseMessage resMsg = new ApiResponseMessage();

        return new ResponseEntity<ApiResponseMessage>(resMsg, HttpStatus.OK);
    }

}
