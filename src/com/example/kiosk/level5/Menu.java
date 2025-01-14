package com.example.kiosk.level5;

import java.util.ArrayList;
import java.util.List;

//MenuItem 관리 클래스
public class Menu {
    private final List<MenuItem> items ;
    private final String categoryName;    //상위 카테고리 이름

    public Menu(String categoryName) {
        items = new ArrayList<>();
        this.categoryName = categoryName;
    }

    //카테고리명 반환 메서드
    public String getCategoryName() {
        return categoryName;
    }

    //리스트 반환 메서드
    public List<MenuItem> getItems() {
        return items;
    }

    public void showMenuItems() {
        for (int i = 0; i < items.size(); i++) {
            System.out.println((i+1) + ". " + items.get(i).getMenuName() + " | " + items.get(i).getPrice() + " | " + items.get(i).getExplanation());
        }
        System.out.println("0. 뒤로 가기");
    }
}
