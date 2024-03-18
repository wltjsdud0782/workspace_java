package static_study;
//static = 공용
public class Account {
    String accNumber;
    int balance;
    static double iyul; //(이율)

    public Account(){
//        iyul = 10.0; //static 변수는 생성자안에서 변경하지 않는다.
    }
    static {
        iyul = 10.0;
    }

    public static void printIyul(){
        System.out.println("이율 : " + iyul);
    }
}
