package if_study;

public class If_03 {
    public static void main(String[] args) {
        //실수를 저장할 수 있는 변수 num을 선언하고 임의의 실수를 저장
        //해당 변수에 저장된 값이 10.0 보다 크면 1을 출력하고
        //그렇지 않으면 0을 출력하는 코드
        double num = 5.5;

        if(num > 10.0){
            System.out.println(1);
        }
        //그렇지 않으면
        else{
            System.out.println(0);
        }
    }
}
