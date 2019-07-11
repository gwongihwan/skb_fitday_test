package com.skb.fitday.springboot.model.request;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import java.util.Map;

@Getter
@Setter
public class RequestDelegationVo {

    @NotEmpty
    private String playServiceId;

    @NotEmpty
    private Map<String, String> data;

}
