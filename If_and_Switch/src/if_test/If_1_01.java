package if_test;

public class If_1_01 {
    public static void main(String[] args) {
        int a, b;
        a = 10;
        b = 15;

        if (a + b > 50){
            System.out.println("두 수의 합이 50보다 큽니다.");
        }
        else if(a + b <= 50){
            System.out.println("두 수의 합이 50이하 입니다.");
        }
    }
}
