package com.skb.fitday.springboot.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;

@Getter
@Setter
public class RequestSupportedInterfacesVo {

    @NotEmpty
    @JsonProperty("Delegation")
    private RequestDelegationVo delegation;

}
