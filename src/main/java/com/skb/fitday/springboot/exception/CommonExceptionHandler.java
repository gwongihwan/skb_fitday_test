package com.skb.fitday.springboot.exception;

import com.skb.fitday.springboot.model.response.ResponseBodyVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@ControllerAdvice
public class CommonExceptionHandler {

    @ExceptionHandler(NuguException.class)
    @ResponseBody
    public ResponseEntity<ResponseBodyVo> handleException(NuguException e) {
        ResponseBodyVo resVo = new ResponseBodyVo();



        log.error("에러 로그....");

        return new ResponseEntity<>(resVo, HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
