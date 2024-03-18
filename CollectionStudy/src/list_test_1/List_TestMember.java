package list_test_1;

import java.util.ArrayList;
import java.util.List;

public class List_TestMember {
    public static void main(String[] args) {
        List<List_Member> members = new ArrayList<>();

        members.add(new List_Member("abc", "abc", "회원1", 10));
        members.add(new List_Member("def", "def", "java", 20));
        members.add(new List_Member("ghi", "ghi", "회원3", 30));

        for (List_Member e : members){
            System.out.println(e);
        }

        //1_7번
        int total = 0;

        for (int i = 0 ; i < members.size(); i++){
            total = total + members.get(i).getAge();
        }
        System.out.println(total);

        //1-8번
        for (int i = 0; i < members.size(); i++){
            if (members.get(i).getName().equals("java")) {
                members.remove(i);
            }
        }
    }
}
