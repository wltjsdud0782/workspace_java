package switch_study;

//switch case break
public class Switch_01 {
    public static void main(String[] args) {

        int num = 2;
        //()안은 변수
        //조건이 일치하는 곳에서부터 코드를 전체 해석
        switch(num){
            case 1 : //num이 1이라면..
                System.out.println(1);
                System.out.println(1);
                break; //break 코드가 실행되면 switch문 종료

            case 2 : // ↓ 일치하는 곳부터 차례로 전체 해석
                System.out.println(2);
                break;

            case 3 :
                System.out.println(3);

            default : //else문과 동일하게 해석
                System.out.println(4);
        }

    }
}
