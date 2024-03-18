package For_test;

public class For_7 {
    public static void main(String[] args) {
        int total = 0;
        for (int i=1; i<101; i++){
            if (i % 5 == 0){
                System.out.print(i + " ");
                total++;
            }
        }
        System.out.println(total);
    }
}
