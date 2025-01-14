package com.example.kiosk.level5;

//개별 음식 항목 관리 클래스
//햄버거, 음료수, 디저트 모두 관리
public class MenuItem {
    private final String menuName;    //이름
    private final String price;       //가격
    private final String explanation; //설명

    public MenuItem(String menuName, String price, String explanation) {
        this.menuName = menuName;
        this.price = price;
        this.explanation = explanation;
    }

    public String getMenuName() {
        return menuName;
    }

    public String getPrice() {
        return price;
    }

    public String getExplanation() {
        return explanation;
    }

    @Override
    public String toString() {
        return menuName + " | " + price + " | " + explanation;
    }
}
