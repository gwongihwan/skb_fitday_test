package com.skb.fitday.springboot.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RequestSupportedInterfacesVo {

    @JsonProperty("Delegation")
    private RequestDelegationVo delegation;

}
