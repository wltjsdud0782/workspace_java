package phone;

public class Cake {
    public void eatCake(){
        System.out.println("맛있는 케이크를 먹는다.");
    }
}

class CheeseCake extends Cake{
    public void eatCheeseCake(){
        System.out.println("맛있는 치즈케이크를 먹는다.");
    }
}

class StrawberryCheeseCake extends CheeseCake{
    public void eatStrawberryCheeseCake(){
        System.out.println("맛있는 딸기치즈케이크를 먹는다.");
    }
}
