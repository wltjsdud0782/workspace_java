package list;

import java.util.ArrayList;
import java.util.List;

public class List03 {
    public static void main(String[] args) {
        //Car 객체를 여러개 저장할 수 있는 리스트 변수 생성
        List<Car> carList = new ArrayList<>();

        //임의의 차 5대를 만들어서 리스트에 저장
        Car car1 = new Car("현대" , 10000, "아반떼");
        Car car2 = new Car("현대" , 8000, "소나타");
        Car car3 = new Car("기아" , 12000, "K5");
        Car car4 = new Car("BMW" , 10000, "520D");
        Car car5 = new Car("제네시스" , 17000, "G70");

        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);

        //리스트에 저장된 모든 차의 정보를 for-each 문으로 출력
        for (Car e : carList){
            System.out.println(e);
        }

        //for문으로 현대차만 출력
        for (int i = 0; i < carList.size(); i++){
            if (carList.get(i).getBrand().equals("현대")){
                System.out.println(carList.get(i).toString());
                //객체 출력은 뒤에 원래 .toString 생략되어 있음
            }
        }

    }
}
