package while_test;

public class While_7 {
    public static void main(String[] args) {
        int a = 1;
        int total = 0;
        while (a < 101){
            if (a % 5 == 0){
                System.out.println(a);
                total++;
            }
            a++;
        }
        System.out.println(total);
    }
}
