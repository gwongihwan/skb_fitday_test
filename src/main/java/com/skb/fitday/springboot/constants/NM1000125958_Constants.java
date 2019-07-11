package com.skb.fitday.springboot.constants;

public enum NM1000125958_Constants {
//    CtrlType("SelectSubmenu"),
    CtrlValue("NM1000125968");

//    private final String ctrlType;
    private final String ctrlValue;

    private NM1000125958_Constants(String ctrlValue) {
        this.ctrlValue = ctrlValue;
    }

    public String getCtrlValue() {
        return this.ctrlValue;
    }

    public static void main(String[] args) {
        System.out.println(NM1000125958_Constants.CtrlValue.getCtrlValue());
        System.out.println(NM1000125958_Constants.valueOf("CtrlValue"));
    }

}
