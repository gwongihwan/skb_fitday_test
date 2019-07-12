package com.skb.fitday.springboot.constants;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Getter
public enum EnumTest {
    NM1000125958_0001("NM1000125958", "생활습관동화", "", "SelectSubmenu", "NM1000125968"),
    NM1000125958_0002("NM1000125958", "세계명작동화", "", "SelectSubmenu", "NM1000126022"),
    NM1000125958_0003("NM1000125958", "세계명작동화", "첫번째", "엔티티두개타입", "엔티티두개밸류");

    private final String sceneId;
    private final String key1;
    private final String key2;
    private final String ctrlType;
    private final String ctrlValue;

    EnumTest(String sceneId, String key1, String key2, String type, String value) {
        this.sceneId = sceneId;
        this.key1 = key1;
        this.key2 = key2;
        this.ctrlType = type;
        this.ctrlValue = value;
    }

    public static Map<String, String> getTypeAndValue(String sceneId, String entity1, String entity2) {
        String ctrlType = null;
        String ctrlValue = null;

        for(EnumTest c : EnumTest.values()) {
            String constName = c.name().substring(0, c.name().lastIndexOf("_"));

            if (constName.equals(sceneId)) {
                if (c.sceneId.equals(sceneId) && c.key1.equals(entity1) && c.key2.equals(entity2)) {
                    ctrlType = c.ctrlType;
                    ctrlValue = c.ctrlValue;
                }
            }
        }

        Map<String, String> ctrlMap = new HashMap<>();
        ctrlMap.put("ctrlType", ctrlType);
        ctrlMap.put("ctrlValue", ctrlValue);

        return ctrlMap;
    }

    public static void main(String[] args) {
        String sceneId = "NM1000125958";
        String entity1 = "세계명작동화";
//        String entity2 = "";
        String entity2 = "첫번째";

        Map<String, String> resultMap = EnumTest.getTypeAndValue(sceneId, entity1, entity2);
        System.out.println(resultMap.get("ctrlType"));
        System.out.println(resultMap.get("ctrlValue"));
    }

}
