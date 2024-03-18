package phone;

//스마트폰은 모바일폰이다. o
//모바일폰은 스마트폰이다. x

public class SmartPhone extends MobilePhone{
    private String os;

    public void playApp(){
        System.out.println("어플을 실행합니다.");
    }
}
