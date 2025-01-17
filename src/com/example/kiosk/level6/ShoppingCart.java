package com.example.kiosk.level6;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private final List<MenuItem> cartList = new ArrayList<>();

    //장바구니에 메뉴 추가
    public void addItemToCart(MenuItem item) {
        cartList.add(item);
    }

    //장바구니 리스트 조회
    public void showItemsInCart() {
        for (int i=0; i < cartList.size(); i++) {
            System.out.println((i+1) + ". " + cartList.get(i));
        }
        System.out.println();
    }

    public void emptyCart() {
        cartList.clear();
    }
}
