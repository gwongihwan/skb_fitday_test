package com.skb.fitday.springboot.model.request;

import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
public class RequestDeviceVo {

    private String type;

    private Map<String, Object> state;

}
