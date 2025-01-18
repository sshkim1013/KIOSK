package com.example.kiosk.level6;

public enum UserType {
    HERO(10),          //국가유공자
    SOLDIER(5),        //군인
    STUDENT(3),        //학생
    GENERAL_PUBLIC(0); //일반인


    public final double discountRate;

    UserType(double discountRate) {
        this.discountRate = discountRate;
    }

    //반올림 - String.format() 사용
    public String executeDiscount(double totalPrice) {
        double discountedPrice = totalPrice * (1 - (discountRate / 100.0));
        return String.format("%.1f", discountedPrice);
    }

    public static UserType fromNumber(int discountInfo) {
        switch (discountInfo) {
            case 1:
                return HERO;
            case 2:
                return SOLDIER;
            case 3:
                return STUDENT;
            case 4:
                return GENERAL_PUBLIC;
            default:
                throw new IllegalArgumentException("올바른 번호를 입력해 주세요 :)");
        }
    }
}
