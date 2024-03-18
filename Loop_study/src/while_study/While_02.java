package while_study;

public class While_02 {
    public static void main(String[] args) {
        //1부터 10까지 수 중 홀수만 출력하시오.
        int num = 1;
        while (num < 11){
            System.out.println(num);
            num = num + 2;         //num += 2;
        }
        /////////////// 같은 방법 ↓ ///////////////
        int j = 1;
        while (j < 11){
            if(j % 2 == 1){
                System.out.println(j);
            }
            j++;
        }
    }
}
