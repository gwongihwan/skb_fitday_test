package com.skb.fitday.springboot.model.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RequestSessionVo {

    private String id;

    private boolean isNew;
//    private String isNew;

    private String accessToken;

    private boolean playBuilderRequest;
//    private String playBuilderRequest;

}
