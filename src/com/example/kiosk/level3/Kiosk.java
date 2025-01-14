package com.example.kiosk.level3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//키오스크 프로그램의 메뉴를 관리하고 사용자 입력을 처리
public class Kiosk {
    //MenuItem 관리하는 리스트가 필드로 존재
    List<MenuItem> menuItems = new ArrayList<>();

    MenuItem menuItem1;
    MenuItem menuItem2;
    MenuItem menuItem3;
    MenuItem menuItem4;

    public Kiosk(MenuItem menuItem1, MenuItem menuItem2, MenuItem menuItem3, MenuItem menuItem4) {
        //Kiosk 생성자를 통해 MenuItem에 값 할당
        this.menuItem1 = menuItem1;
        this.menuItem2 = menuItem2;
        this.menuItem3 = menuItem3;
        this.menuItem4 = menuItem4;

        //생성자를 통해 List에 MenuItem 값 할당
        menuItems.add(menuItem1);
        menuItems.add(menuItem2);
        menuItems.add(menuItem3);
        menuItems.add(menuItem4);
    }

    //키오스크 프로그램을 시작하는 메서드
    //입력과 반복문 로직을 관리
    public void start() {
        //메뉴 출력
        System.out.println("[ SHAKESHACK MENU ]");
        System.out.println("1. ShackBurger  | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        System.out.println("2. SmokeShack   | W 8.9 | 베이컨, 체리페퍼에 쉑소스가 토핑된 치즈버거");
        System.out.println("3. Cheeseburger | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        System.out.println("4. Hamburger    | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거");
        System.out.println("0. 종료   | 종료");
        System.out.println();

        //Scanner 선언
        Scanner sc = new Scanner(System.in);

        //주문 횟수
        int orderCount = 0;

        //반복문을 활용해 List 안에 있는 MenuItem을 하나씩 출력
        while (true) {
            if (orderCount == 0) {
                System.out.print("주문 하실 메뉴의 번호를 입력해 주세요(종료는 0 입력): ");
            } else {
                System.out.print("추가하실 메뉴의 번호를 입력해 주세요(종료는 0 입력): ");
            }

            try {
                //메뉴 번호 입력
                int menuNumber = sc.nextInt();

                System.out.println();

                //수량에 따른 메뉴 선택 및 추가 안내문 변경
                if (menuNumber > 4) {
                    throw new IllegalArgumentException("메뉴를 다시 선택해 주세요 :)");
                } else if (menuNumber != 0 && orderCount > 0) {
                    System.out.println("다음 메뉴를 추가하셨습니다.");
                    orderCount++;
                } else if (menuNumber != 0) {
                    System.out.println("다음 메뉴를 선택하셨습니다.");
                    orderCount++;
                }

                //입력된 숫자에 따른 처리
                //선택한 메뉴: 이름, 가격, 설명
                if (menuNumber == 1) {
                    System.out.println("메뉴명: " + menuItem1.menuName + " | 가격: " + menuItem1.price + " | 설명: " + menuItem1.explanation);
                } else if (menuNumber == 2) {
                    System.out.println("메뉴명: " + menuItem2.menuName + " | 가격: " + menuItem2.price + " | 설명: " + menuItem2.explanation);
                } else if (menuNumber == 3) {
                    System.out.println("메뉴명: " + menuItem3.menuName + " | 가격: " + menuItem3.price + " | 설명: " + menuItem3.explanation);
                } else if (menuNumber == 4) {
                    System.out.println("메뉴명: " + menuItem4.menuName + " | 가격: " + menuItem4.price + " | 설명: " + menuItem4.explanation);
                } else if (menuNumber == 0) {
                    //프로그램을 종료
                    System.out.println("프로그램을 종료합니다.");
                    break;
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

            //주문 총 수량 출력
            System.out.println("현재까지의 주문 수량: " + orderCount);
            System.out.println();
        }
    }
}
