package man_2;

public class BusinessMan extends Man{
    String company;

    public BusinessMan(){
//        super(); //부모클래스의 생성자 실행 //생성자의 가장 위에 위치
        super("홍길동");
        company = "미지정";
    }
}
