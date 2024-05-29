package com.entertainment;

public enum DisplayType {
    LED("LED"),
    OLED("OLED"),
    PLASMA("Plasma"),
    LCD("LCD"),
    CRT("CRT");

    private String display;

    DisplayType(String display) {
        this.display = display;
    }
    public String getDisplay() {
        return display;
    }
    public String toString() {
        return display;
    }
}

