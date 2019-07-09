package com.skb.fitday.springboot.model.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResponseDirectivesVo {

    private String type = "Delegation.Delegate";

    private ResponseDataVo data;

    private String appId;

}
