package list_test_1;

import java.util.ArrayList;
import java.util.List;

public class List_1 {
    public static void main(String[] args) {

    List<String> list = new ArrayList<>();
     list.add("안녕");
     list.add("안녕하세요");
     list.add("하이");

     for (String e : list){
         System.out.println(e);
     }
    }
}
