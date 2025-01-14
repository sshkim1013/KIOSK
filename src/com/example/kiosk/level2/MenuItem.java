package com.example.kiosk.level2;

//개별 음식 항목을 관리하는 클래스
//현재는 햄버거만 관리
public class MenuItem {
    String menuName;    //이름
    String price;       //가격
    String explanation; //설명

    public MenuItem(String menuName, String price, String explanation) {
        this.menuName = menuName;
        this.price = price;
        this.explanation = explanation;
    }
}
