package com.example.kiosk.level1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Scanner 객체 생성
        Scanner sc = new Scanner(System.in);

        //메뉴 출력
        System.out.println("[ SHAKESHACK MENU ]");
        System.out.println("1. ShackBurger  | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        System.out.println("2. SmokeShack   | W 8.9 | 베이컨, 체리페퍼에 쉑소스가 토핑된 치즈버거");
        System.out.println("3. Cheeseburger | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        System.out.println("4. Hamburger    | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거");
        System.out.println("0. 종료   | 종료");
        System.out.println();

        //주문 횟수
        int orderCount = 0;

        //메뉴 선택을 위한 반복문 구현
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

                //메뉴 선택 조건문
                if (menuNumber == 1) {
                    System.out.println("1. ShackBurger  | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
                } else if (menuNumber == 2) {
                    System.out.println("2. SmokeShack   | W 8.9 | 베이컨, 체리페퍼에 쉑소스가 토핑된 치즈버거");
                } else if (menuNumber == 3) {
                    System.out.println("3. Cheeseburger | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
                } else if (menuNumber == 4) {
                    System.out.println("4. Hamburger    | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거");
                } else if (menuNumber == 0) {
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
