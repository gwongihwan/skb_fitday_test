package com.skb.fitday.springboot.model.request;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import java.util.Map;

@Getter
@Setter
public class RequestDeviceVo {

    @NotEmpty
    private String type;

    @NotEmpty
    private Map<String, Object> state;

}
