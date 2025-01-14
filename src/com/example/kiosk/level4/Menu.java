package com.example.kiosk.level4;

import java.util.ArrayList;
import java.util.List;

//MenuItem 관리 클래스
public class Menu {
    List<MenuItem> items = new ArrayList<>();
    private final String categoryName;    //상위 카테고리 이름

    public Menu(String categoryName) {
        this.categoryName = categoryName;
    }

    //카테고리명 반환 메서드
    public String getCategoryName() {
        return categoryName;
    }

    public void showMenuItems() {
        for (int i = 0; i < items.size(); i++) {
            System.out.println((i+1) + ". " + items.get(i).menuName + " | " + items.get(i).price + " | " + items.get(i).explanation);
        }
        System.out.println("0. 뒤로 가기");
    }
}
