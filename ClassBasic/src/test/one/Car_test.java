package test.one;

import test.one.Car;

public class Car_test {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car();

        //c1 - 차량 대한 정보 변경
        c1.setBrand("현대");
        c1.setCarName("아반떼");
        c1.setCarNumber("1111");
        c1.setPrice(5000);
        c1.setOwner("지선영");
        c1.showCarInfo();

        System.out.println();

        //c2 - 차량 대한 정보 변경2
        //메소드를 호출할때는 메소드명이 일치 + 매개변수의 정보 일치
        //매개변수의 정보 : 매개변수의 개수, 자료형
        c2.setCarInfo("기아", "K3", "2222", 5000, "지선영");
        c2.showCarInfo();
    }
}
