package account;

public class Account_test {
    public static void main(String[] args) {

        //객체 생성시 생성자가 반드시 호출 되어야 한다! (new 뒤가 생성자)
        //만약 클래스에 생성자가 없다면 기본 생성자를 자동으로 만들어 준다.
        //＠Account acc = new Account(500000); 가능
        Account acc = new Account(10);
        Account acc1 = new Account();

//        acc.deposit(10000);
//        acc.withdraw(5000);

        acc.showAcc();
    }
}
