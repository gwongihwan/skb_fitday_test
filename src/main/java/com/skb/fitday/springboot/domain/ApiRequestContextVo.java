package com.skb.fitday.springboot.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class ApiRequestContextVo {

    private Object session;

    private Object device;

    private Object supportedInterfaces;

    private Object profile;

}
