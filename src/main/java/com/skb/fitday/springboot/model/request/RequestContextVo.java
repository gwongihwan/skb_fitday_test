package com.skb.fitday.springboot.model.request;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;

@Getter
@Setter
public class RequestContextVo {

    @NotEmpty
    private String text;

    @NotEmpty
    private RequestDeviceVo device;

    @NotEmpty
    private RequestSupportedInterfacesVo supportedInterfaces;

    @NotEmpty
    private RequestSessionVo session;

}
