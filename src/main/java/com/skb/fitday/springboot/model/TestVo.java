package com.skb.fitday.springboot.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class TestVo {

    // IntelliJ + Lombok + Junit 에서 에러가 발생함.
    // IntelliJ 설정에서 Annotaion Processors 메뉴에 Enable annotation processing 체크 해주면 동작함.
    // Lombok 쒯!

    private String param1;
    private String param2;

}
