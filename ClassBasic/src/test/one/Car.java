package test.one;

import java.io.PipedInputStream;

public class Car {
    String brand;
    String carName;
    String carNumber;
    int price;
    String owner;

    //setter : 클래스가 가진 데이터 각각의 값을 매개변수로 변경하는 메소드
    //'set+데이터명'으로 메소드명이 정해져있다!!
    public void setBrand(String brand1){
        brand = brand1;
    }
    public void setCarName(String carName1){
        carName = carName1;
    }
    public void setCarNumber(String carNumber1){
        carNumber = carNumber1;
    }
    public void setPrice(int price1){
        price = price1;
    }
    public void setOwner(String owner1){
        owner = owner1;
    }

    public void setCarInfo(String brand1, String carName1, String carNumber1,
                           int price1, String owner1){
        brand = brand1;
        carName = carName1;
        carNumber = carNumber1;
        price = price1;
        owner = owner1;
    }

    public void showCarInfo(){
        System.out.println("제조사 : " + brand);
        System.out.println("차 이름 : " + carName);
        System.out.println("차량 번호 : " + carNumber);
        System.out.println("가격 : " + price);
        System.out.println("소유주 : " + owner);
    }
}
