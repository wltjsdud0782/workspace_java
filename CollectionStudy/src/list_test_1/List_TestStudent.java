package list_test_1;

import list_test_3.Student;

import java.util.ArrayList;
import java.util.List;

public class List_TestStudent {
    public static void main(String[] args) {
        List<List_Student> students = new ArrayList<>();

        students.add(new List_Student("김자바", 90, 100));
        students.add(new List_Student("지선영", 100, 100));
        students.add(new List_Student("홍당무", 70, 80));

        //1)
        for (List_Student e : students){
            System.out.println(e);
        }
        System.out.println();
        //2)
        for (int i = 0; i < students.size(); i++){
            if (150 <= students.get(i).getTotalScore()){
                System.out.println(students.get(i));
            }
        }
        System.out.println();
        //3)
        int total = 0;
        for (List_Student e : students){
            total = total + e.getTotalScore();
        }
        double avg = (double)total / students.size();

        System.out.println("평균 = " + avg);

        System.out.println();
        //4)
        List_Student maxScoreStu = students.get(0);

        for (int i = 1 ; i < students.size(); i++){
            if (maxScoreStu.getTotalScore() < students.get(i).getTotalScore()){
                maxScoreStu = students.get(i);
            }
        }
            System.out.println(maxScoreStu);
    }
}
