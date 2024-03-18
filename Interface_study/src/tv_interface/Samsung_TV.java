package tv_interface;

public class Samsung_TV implements TV{
    public void powerOn(){
        System.out.println("삼성 tv - 전원 On");
    }

    public void powerOff(){
        System.out.println("삼성 tv - 전원 Off");
    }

    @Override
    public void volumeUp() {
        System.out.println("삼성 tv - 볼륨 Up");
    }

    @Override
    public void volumeDown() {
        System.out.println("삼성 tv - 볼륨 Down");
    }
}
