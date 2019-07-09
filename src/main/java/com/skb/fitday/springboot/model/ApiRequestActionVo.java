package com.skb.fitday.springboot.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class ApiRequestActionVo {

    private String actionName;

    private ApiRequestParametersVo parameters;

}
