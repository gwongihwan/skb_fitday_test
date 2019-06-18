package com.skb.fitday.springboot.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Map;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class ApiRequestParametersVo {

    private Map<String, String> request_value;

}
