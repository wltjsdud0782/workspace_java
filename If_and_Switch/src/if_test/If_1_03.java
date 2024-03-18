package if_test;

public class If_1_03 {
    public static void main(String[] args) {
        int a, b;
        a = 10;
        b = 15;

        if (a > b) {
            System.out.println("a가 큽니다.");
        }
        else if(a < b){
            System.out.println("b가 큽니다.");
        }
        else{
            System.out.println("같습니다.");
        }
    }
}
