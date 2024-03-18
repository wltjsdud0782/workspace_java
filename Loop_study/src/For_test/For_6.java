package For_test;

public class For_6 {
    public static void main(String[] args) {
        int total = 0;
        for(int i=1; i<101; i++){
            if (i % 3 == 0){
                total++;
            }
        }
        System.out.println(total);
    }
}
