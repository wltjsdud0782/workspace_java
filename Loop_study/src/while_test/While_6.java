package while_test;

public class While_6 {
    public static void main(String[] args) {
        int a = 1;
        int total = 0;
        while (a < 101){
            if (a % 3 == 0){
                total++;
            }
            a++;
        }
        System.out.println(total);
    }
}
