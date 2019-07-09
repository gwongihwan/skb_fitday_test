package com.skb.fitday.springboot.model.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RequestBodyVo {

    private String version;

    private RequestActionVo action;

    private RequestContextVo context;

}
