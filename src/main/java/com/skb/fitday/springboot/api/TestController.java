package com.skb.fitday.springboot.api;

import com.skb.fitday.springboot.domain.ApiRequestMessage;
import com.skb.fitday.springboot.domain.ApiResponseMessage;
import com.skb.fitday.springboot.domain.ReqVo;
import com.skb.fitday.springboot.domain.TestVo;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/test")
@Slf4j
public class TestController {

    // Logger 객체 생성은 위의 롬복Slf4j 애노테이션으로 생략됨. 멤버변수 log.debug() 형태로 사용.
//    private static final Logger logger = LoggerFactory.getLogger(TestController.class);

    @Autowired
    private Environment environment;

    @Value("${server.port:9999}")
    private String serverPort;

    @PostMapping("/home/{param}")
    public ResponseEntity<String> home(@PathVariable String param) {
        log.debug(this.getClass().getName() + " > " + "아몰랑 메소드명 찍고" + " > " + param);
        System.out.println(param);
        log.error("error.......");
        return new ResponseEntity<String>("okokokok", HttpStatus.OK);
    }

    @GetMapping("/health")
    public ResponseEntity healthCheck() {
        return new ResponseEntity(HttpStatus.OK);
    }

    @PostMapping("/res.test")
    public ResponseEntity<ApiResponseMessage> nuguTest(@RequestBody @Valid ApiRequestMessage reqMsg) {
//    public ResponseEntity<ApiResponseMessage> nuguTest(@RequestBody @Valid ReqVo reqMsg) {

        String[] profiles = environment.getActiveProfiles();
        for (String profile : profiles) {
            System.out.println(profile);
        }

        System.out.println(serverPort);

        ApiResponseMessage resMsg = new ApiResponseMessage();

        log.debug("lombok.auto.debug.....");
        log.error("lombok.auto.error.....");

        return new ResponseEntity<ApiResponseMessage>(resMsg, HttpStatus.OK);
    }

}
