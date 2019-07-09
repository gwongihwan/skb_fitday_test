package com.skb.fitday.springboot.model.request;

import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
public class RequestActionVo {

    private String actionName;

//    private RequestParametersVo parameters;
    private Map<String, Map<String, String>> parameters;

}
