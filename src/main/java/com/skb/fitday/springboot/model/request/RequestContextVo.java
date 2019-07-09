package com.skb.fitday.springboot.model.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RequestContextVo {

    private String text;

    private RequestDeviceVo device;

    private RequestSupportedInterfacesVo supportedInterfaces;

    private RequestSessionVo session;

}
