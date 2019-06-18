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
public class ApiResponseMessage {

    @NotEmpty
    private String version;

    @NotEmpty
    private String resultCode;

    @NotEmpty
    private Map<String, String> output;

    private Map<String, String> directives;

}
