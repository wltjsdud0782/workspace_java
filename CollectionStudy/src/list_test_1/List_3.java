package list_test_1;

import java.util.ArrayList;
import java.util.List;

public class List_3 {
    public static void main(String[] args) {
        List<String> name = new ArrayList<>();

        name.add("홍길동");
        name.add("김자바");
        name.add("지선영");

        for (int i = 0 ; i < name.size(); i++){
            if (name.get(i).equals("홍길동")){
                System.out.println("해당 이름이 존재합니다.");
            }
        }
    }
}
