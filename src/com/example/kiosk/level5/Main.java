package com.example.kiosk.level5;

public class Main {
    public static void main(String[] args) {
        //햄버거 종류를 메뉴에 삽입.
        Menu burgerMenu = new Menu("Burgers");
        burgerMenu.getItems().add(new MenuItem("ShackBurger", "W 6.9","토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        burgerMenu.getItems().add(new MenuItem("SmokeShack", "W 8.9","베이컨, 체리페퍼에 쉑소스가 토핑된 치즈버거"));
        burgerMenu.getItems().add(new MenuItem("Cheeseburger", "W 6.9","포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        burgerMenu.getItems().add(new MenuItem("Hamburger", "W 5.4","비프패티를 기반으로 야채가 들어간 기본버거"));

        //음료수 종류를 메뉴에 삽입.
        Menu drinkMenu = new Menu("Drinks");
        drinkMenu.getItems().add(new MenuItem("MilkShake", "W 4.5","밀크쉐이크"));
        drinkMenu.getItems().add(new MenuItem("ChocoShake", "W 4.5","초코쉐이크"));
        drinkMenu.getItems().add(new MenuItem("Coke", "W 3.5","콜라"));

        //디저트 종류를 메뉴에 삽입.
        Menu dessertMenu = new Menu("Desserts");
        dessertMenu.getItems().add(new MenuItem("FrenchFries", "W 4.0","감자튀김"));
        dessertMenu.getItems().add(new MenuItem("CheeseBall", "W 4.5","치즈볼"));


        //Kiosk 객체 생성 및 실행
        Kiosk kiosk = new Kiosk(burgerMenu, drinkMenu, dessertMenu);
        kiosk.start();
    }
}
