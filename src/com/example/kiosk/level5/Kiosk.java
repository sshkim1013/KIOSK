package com.example.kiosk.level5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    private final List<Menu> menus;

    //Scanner 선언
    Scanner sc = new Scanner(System.in);

    public Kiosk(Menu burger, Menu beverage, Menu dessert) {
        menus = new ArrayList<>();
        menus.add(burger);
        menus.add(beverage);
        menus.add(dessert);
    }

    public void start() {
            while (true) {
                System.out.println("[ MAIN MENU ]");
                for (int i = 0; i < menus.size(); i++) {
                    System.out.println((i + 1) + ". " + menus.get(i).getCategoryName());
                }
                System.out.println("0. 종료     | 종료");
                System.out.println();

                System.out.print("카테고리를 선택해 주세요: ");

                try {
                    int categoryNo = sc.nextInt();
                    System.out.println();

                    if (categoryNo == 0) {
                        System.out.println("KIOSK 프로그램을 종료합니다.");
                        break;
                    } else if (categoryNo > 0 && categoryNo <= menus.size()) {
                        while (true) {
                            System.out.println("[ " + menus.get(categoryNo - 1).getCategoryName().toUpperCase() + " MENU ]");
                            Menu selectedCategory = menus.get(categoryNo - 1);
                            selectedCategory.showMenuItems();
                            System.out.println();

                            System.out.print("메뉴를 선택해 주세요: ");
                            int menuNo = sc.nextInt();
                            System.out.println();

                            if (menuNo == 0) {
                                System.out.println("MAIN MENU 페이지로 이동합니다.");
                                System.out.println();
                                break;  //0 입력 시 무한 루프 탈출
                            } else if (menuNo > 0 && menuNo <= selectedCategory.getItems().size()) {
                                System.out.println("선택한 메뉴: " + selectedCategory.getItems().get(menuNo - 1));
                                System.out.println();
                                break;  //조건에 부합하는 숫자 입력 시 무한 루프 탈출
                            } else {
                                System.out.println("다른 메뉴를 선택해 주세요 :)");
                                System.out.println();
                            }
                        }
                    } else {
                        throw new IllegalArgumentException("다른 카테고리를 선택해 주세요 :)");
                    }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                System.out.println();
            }
        }
    }
}
