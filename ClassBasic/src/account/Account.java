package account;

//계좌정보
public class Account {
    String owner;
    int balance; //예금액
    String accNumber; //계좌번호

    //생성자 : 변수값 초기화 용도
    public Account(){           //＠public Account(int money){
        balance = 10000;        //＠balance = money; }
    }
    public Account(int money){
        balance = money;
    }


//    public void initAcc(){
//        owner = "지정 안됨";
//        balance = 10000;
//        accNumber = "할당 안됨";          /필요없음
//    }

    //입금 : 매개변수로 입금액이 들어오면 입금!
    public void deposit(int money){
        balance += money;
    }
    //출금
    public void withdraw(int money){
        if (balance - money < 0){
            System.out.println("잔액이 부족합니다.");
        }
        else{
            balance -= money;
        }
    }
    //계좌정보 확인 (출력)
    public void showAcc(){
        System.out.println("계좌주 : " + owner);
        System.out.println("예금액 : " + balance);
        System.out.println("계좌번호 : " + accNumber);
    }

    //매개변수의 정보가 다르면 메소드명이 동일해도 허용.
    public void aaa(){
    }
    public void aaa(int a){
        System.out.println(12);
        System.out.println("안녕");  //보이지 않은 println 메소드를 만들어줌
    }
}

