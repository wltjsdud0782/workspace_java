package list;

import java.util.ArrayList;
import java.util.List;

public class List02 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(10);

        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
        for (int e : list){
            System.out.println(e);
        }
    }
}
