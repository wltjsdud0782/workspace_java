package if_test;

public class If_1_05 {
    public static void main(String[] args) {
        int a = 84;
        String grade = "";

        if (a > 90 && a <= 100){
            grade = "A";
        }
        else if(a > 80){
//            && a <= 90)
            grade = "B";
        }
        else if(a <= 80){
            grade = "C";
        }

        System.out.println("학점은 " + grade + "입니다.");
    }
}
