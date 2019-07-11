package com.skb.fitday.springboot.model.request;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;

@Getter
@Setter
public class RequestBodyVo {

    @NotEmpty
    private String version;

    @NotEmpty
    private RequestActionVo action;

    @NotEmpty
    private RequestContextVo context;

}
