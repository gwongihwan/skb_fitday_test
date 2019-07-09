package com.skb.fitday.springboot.model.response;

import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
public class ResponseBodyVo {

    private String version;

    private String resultCode = "OK";

    private Map<String, String> output;

    private ResponseDirectivesVo[] directives;

}
