package phone;

public class Cake_test {
    public static void main(String[] args) {
        StrawberryCheeseCake c1 = new StrawberryCheeseCake();

        Cake c2 = new CheeseCake();//→ 가능
        c2.eatCake();

        Cake c3 = new StrawberryCheeseCake(); //→ 가능
        c3.eatCake();
        StrawberryCheeseCake c9 = (StrawberryCheeseCake)c3; //형변환
        c9.eatCake();
        c9.eatCheeseCake();
        c9.eatStrawberryCheeseCake();

        CheeseCake c4 = new StrawberryCheeseCake(); //→ 가능
        c4.eatCake();
        c4.eatCheeseCake();
        //CheeseCake c5 = new Cake(); → 불가능
        //StrawberryCheeseCake c6 = new Cake(); → 불가능
        //StrawberryCheeseCake c7 = new CheeseCake(); → 불가능




    }
}
