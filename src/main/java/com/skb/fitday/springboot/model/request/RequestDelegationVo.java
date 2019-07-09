package com.skb.fitday.springboot.model.request;

import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
public class RequestDelegationVo {

    private String playServiceId;

    private Map<String, String> data;

}
