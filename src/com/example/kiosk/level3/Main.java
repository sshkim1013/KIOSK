package com.example.kiosk.level3;

public class Main {
    public static void main(String[] args) {
        MenuItem menuItem1 = new MenuItem("ShackBurger", "W 6.9","토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        MenuItem menuItem2 = new MenuItem("SmokeShack", "W 8.9","베이컨, 체리페퍼에 쉑소스가 토핑된 치즈버거");
        MenuItem menuItem3 = new MenuItem("Cheeseburger", "W 6.9","포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        MenuItem menuItem4 = new MenuItem("Hamburger", "W 5.4","비프패티를 기반으로 야채가 들어간 기본버거");

        //Kiosk 객체 생성
        Kiosk kiosk = new Kiosk(menuItem1, menuItem2, menuItem3, menuItem4);
        kiosk.start();
    }
}
