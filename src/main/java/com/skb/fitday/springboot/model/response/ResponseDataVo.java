package com.skb.fitday.springboot.model.response;

import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
public class ResponseDataVo {

    private String sceneId;

    private String ctrlType;

    private String ctrlValue;

    private Map<String, Object> analysis;

}
