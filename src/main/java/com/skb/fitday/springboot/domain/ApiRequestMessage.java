package com.skb.fitday.springboot.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotEmpty;
import java.util.Map;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class ApiRequestMessage {

    private String version;

    private ApiRequestActionVo action;

//    @NotEmpty
//    private Map<String, String> context;

}
