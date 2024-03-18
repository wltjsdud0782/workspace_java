package list_test_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class List_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> num = new ArrayList<>();

        num.add(sc.nextInt());
        num.add(sc.nextInt());
        num.add(sc.nextInt());
        num.add(sc.nextInt());
        num.add(sc.nextInt());

        for (Integer e : num){
            System.out.println(e);
        }

    }
}
