package com.skb.fitday.springboot.model.request;

import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
public class RequestParameterVo {

    private Map<String, String> param;

}
