package tv_interface;

//TV 제조사들에게 주는 개발 공지사항
//TV 기능을 만들 때 반드시 아래 인터페이스를 사용하여 만드세요!
public interface TV {
    //전원 On 메소드
    void powerOn();

    //전원 Off 메소드
    void powerOff();

    //볼륨
    void volumeUp();
    void volumeDown();
}
