package test.three;

import com.sun.source.tree.IfTree;

public class MemberService {
    public boolean login(String id, String password) {
        return id.equals("hong") && password.equals("12345");
        //? true : false; 생략가능
    }
    public void logout(String id){
            System.out.println("로그아웃 되었습니다.");
        }
    }
