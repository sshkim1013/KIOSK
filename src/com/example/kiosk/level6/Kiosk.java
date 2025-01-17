package com.example.kiosk.level6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    private final List<Menu> menus;
    Scanner sc = new Scanner(System.in);
    private final ShoppingCart shoppingCart;

    public Kiosk(Menu burger, Menu beverage, Menu dessert) {
        menus = new ArrayList<>();
        menus.add(burger);
        menus.add(beverage);
        menus.add(dessert);
        shoppingCart = new ShoppingCart();  //장바구니 생성
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
                            try {
                                int menuNo = sc.nextInt();
                                System.out.println();

                                if (menuNo == 0) {
                                    System.out.println("MAIN MENU 페이지로 이동합니다.");
                                    System.out.println();
                                    break;  //0 입력 시 무한 루프 탈출
                                } else if (menuNo > 0 && menuNo <= selectedCategory.getItems().size()) {
                                    System.out.println("선택한 메뉴: " + selectedCategory.getItems().get(menuNo - 1));
                                    System.out.println();

                                    while (true) {
                                        //장바구니 추가 여부 출력
                                        System.out.println(selectedCategory.getItems().get(menuNo - 1));
                                        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                                        System.out.println("1. 확인       2. 취소");

                                        try {
                                            int inToCart = sc.nextInt();
                                            if (inToCart == 1) {
                                                shoppingCart.addItemToCart(selectedCategory.getItems().get(menuNo - 1));
                                                System.out.println();
                                                System.out.println("장바구니에 추가: " + selectedCategory.getItems().get(menuNo - 1).getMenuName());
                                                System.out.println();

                                                while (true) {
                                                    System.out.println("[ ORDER MENU ]");
                                                    System.out.println("4. Orders       | 장바구니를 확인 후 주문합니다.");
                                                    System.out.println("5. Cancel       | 진행 중인 주문을 취소합니다.");

                                                    try {
                                                        int orderMenu = sc.nextInt();
                                                        System.out.println();

                                                        if (orderMenu == 4) {
                                                            while (true) {
                                                                System.out.println("아래와 같이 주문하시겠습니까?");
                                                                System.out.println();
                                                                System.out.println("[ Orders ]");
                                                                shoppingCart.showItemsInCart();

                                                                System.out.println("[ Total Price ]");
                                                                System.out.println(selectedCategory.getItems().get(menuNo - 1).getPrice());
                                                                System.out.println();
                                                                System.out.println("1. 주문       2. 메뉴판");

                                                                try {
                                                                    int order = sc.nextInt();
                                                                    System.out.println();

                                                                    if (order == 1) {
                                                                        System.out.println("주문이 완료되었습니다. 금액은 " + selectedCategory.getItems().get(menuNo - 1).getPrice() + " 입니다.");
                                                                        shoppingCart.emptyCart();   //주문을 마치면 카트 비우기.
                                                                        System.out.println();
                                                                        break;
                                                                    } else if (order == 2) {
                                                                        System.out.println("메뉴판으로 돌아갑니다.");
                                                                        break;
                                                                    } else {
                                                                        throw new IllegalArgumentException("번호를 다시 입력해 주세요.");
                                                                    }
                                                                } catch (IllegalArgumentException e) {
                                                                    System.out.println(e.getMessage());
                                                                    System.out.println();
                                                                }
                                                            }
                                                            break;

                                                        } else if (orderMenu == 5) {
                                                            System.out.println("진행 중인 주문을 취소합니다.");
                                                            System.out.println();
                                                            break;
                                                        } else {
                                                            throw new IllegalArgumentException("잘못된 숫자를 입력하셨습니다.");
                                                        }
                                                    } catch (IllegalArgumentException e) {
                                                        System.out.println(e.getMessage());
                                                        System.out.println();
                                                    }
                                                }
                                                break;

                                            } else if (inToCart == 2) {
                                                System.out.println("장바구니에 해당 메뉴를 추가하지 않습니다.");
                                                System.out.println();
                                                break;
                                            } else {
                                                throw new IllegalArgumentException("잘못된 입력입니다.");
                                            }
                                        } catch (IllegalArgumentException e) {
                                            System.out.println(e.getMessage());
                                            System.out.println();
                                        }
                                    }
                                    break;

                                } else {
                                    throw new IllegalArgumentException("다른 메뉴를 선택해 주세요 :)");
                                }
                            } catch (IllegalArgumentException e) {
                                System.out.println(e.getMessage());
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
