package while_study;

public class While_03 {
    public static void main(String[] args) {
        //while문을 사용한 1~5까지의 합
        int i = 1;
        int total = 0;
        while (i < 6){
            total = total + i;     // total += i;
            i++;
        }
        System.out.println(total);
    }
}
