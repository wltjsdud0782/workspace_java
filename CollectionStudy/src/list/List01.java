package list;

import java.util.ArrayList;

public class List01 {
    public static void main(String[] args) {
        //<> : 리스트에 담고 싶은 자료형     뒷 부분 생략해도 가능하지만 <>는 필수
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("java");
        list1.add("python");
        list1.add("c++");
        list1.add("c++");

                                //get 뒤 숫자는 출력할 요소 순서
        System.out.println(list1.get(0)); //java
        System.out.println(list1.get(3)); //c++

        //list1 의 모든 내용 출력
        for (int i = 0; i < list1.size(); i++){
            System.out.println(list1.get(i));
        }

        //데이터 삭제
        list1.remove(1);

        for (String e : list1){    // for - each 문
            System.out.println(e);
        }
    }
}
