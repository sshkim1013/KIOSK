package com.example.kiosk.level4;

//개별 음식 항목을 관리하는 클래스
//햄버거, 음료수, 디저트 모두 관리
public class MenuItem {
    String menuName;    //이름
    String price;       //가격
    String explanation; //설명

    public MenuItem(String menuName, String price, String explanation) {
        this.menuName = menuName;
        this.price = price;
        this.explanation = explanation;
    }

    @Override
    public String toString() {
        return menuName + " | " + price + " | " + explanation;
    }
}
