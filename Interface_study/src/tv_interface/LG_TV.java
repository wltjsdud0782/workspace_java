package tv_interface;

public class LG_TV implements TV{
    @Override
    public void powerOn() {
        System.out.println("LG tv - 전원 On");
    }

    @Override
    public void powerOff() {
        System.out.println("LG tv - 전원 Off");
    }

    public void volumeUp(){
        System.out.println("LG tv - 볼륨 Up");
    }

    public void volumeDown(){
        System.out.println("LG tv - 볼륨 Down");
    }
}
