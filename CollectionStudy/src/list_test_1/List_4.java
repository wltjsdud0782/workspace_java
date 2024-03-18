package list_test_1;

import java.util.ArrayList;
import java.util.List;

public class List_4 {
    public static void main(String[] args) {
        List<Integer> random = new ArrayList<>();

        random.add((int)(Math.random()*99+1));
        random.add((int)(Math.random()*99+1));
        random.add((int)(Math.random()*99+1));
        random.add((int)(Math.random()*99+1));
        random.add((int)(Math.random()*99+1));
        random.add((int)(Math.random()*99+1));
        random.add((int)(Math.random()*99+1));
        random.add((int)(Math.random()*99+1));
        random.add((int)(Math.random()*99+1));
        random.add((int)(Math.random()*99+1));

        int cnt = 0;

        for (int i = 0; i < random.size(); i++){
            if (random.get(i) % 2 == 0){
                cnt++;
                System.out.println(random.get(i));
            }
        }
                System.out.println();
                System.out.println(cnt);
    }
}
