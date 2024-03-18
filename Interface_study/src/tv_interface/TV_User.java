package tv_interface;

public class TV_User {
    public static void main(String[] args) {
        LG_TV tv1 = new LG_TV();

        //인터페이스 객체명 = new 생성자();
        //인터페이스를 구현한 클래스의 생성자로 인터페이스 객체를 만들 수 있다.
        TV tv = new LG_TV();

//        TV tv2 = new TV(); > 불가능
        tv.powerOn();
        tv.volumeUp();
        tv.volumeDown();
        tv.powerOff();

    }
}
