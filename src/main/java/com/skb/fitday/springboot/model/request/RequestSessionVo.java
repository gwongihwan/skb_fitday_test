package com.skb.fitday.springboot.model.request;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;

@Getter
@Setter
public class RequestSessionVo {

    @NotEmpty
    private String id;

    @NotEmpty
    private boolean isNew;
//    private String isNew;

    private String accessToken;

    private boolean playBuilderRequest;
//    private String playBuilderRequest;

}
