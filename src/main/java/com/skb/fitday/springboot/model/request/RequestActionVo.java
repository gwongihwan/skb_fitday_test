package com.skb.fitday.springboot.model.request;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import java.util.Map;

@Getter
@Setter
public class RequestActionVo {

    @NotEmpty
    private String actionName;

    @NotEmpty
    private Map<String, Map<String, String>> parameters;

}
