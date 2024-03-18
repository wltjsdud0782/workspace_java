package set_X;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set01 {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        set.add("자바");
        set.add("파이썬");
        set.add("C++");
        set.add("C++"); //오류는 안뜨지만 추가되지도, 출력되지도 않는다.

        for (String e : set){
            System.out.println(e); //c++ 하나 출력, 순서가 없어서 순서 랜덤으로 출력
        }
        //treeset 은 오름차순 출력
    }
}
