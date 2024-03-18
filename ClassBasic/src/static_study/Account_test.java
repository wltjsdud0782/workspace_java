package static_study;

public class Account_test {
    public static void main(String[] args) {
        Account a1 = new Account();
        Account a2 = new Account();
        Account a3 = new Account();
        Account a4 = new Account();
        Account a5 = new Account();

        System.out.println(a3.iyul); //10%

        //100만명 계좌 개설, 이율 증가로 전체 이율 20퍼로 변경을 위한 static과 값 변경
        Account.iyul = 20.0;
        System.out.println(a3.iyul); //20%

        Account a6 = new Account();
        System.out.println(a6.iyul);


        //비추천
        a1.printIyul(); //변수 변경 , 메소드 호출 둘 다 (객체명.변수 or 메소드)
        //추천
        Account.printIyul();

        Math.random(); //클래스.메소드(); random은 static
        System.out.println(); //클래스.메소드를 가진 변수(static system? out).메소드
    }
}
