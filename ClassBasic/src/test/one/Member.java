package test.one;

public class Member {
    String name;
    String id;
    String password;
    int age;

public void setName(String name1){
    name = name1;
}
public void setId(String id1){
    id = id1;
}
public void setPassword(String password1){
    password = password1;
}
public void setAge(int age1){
    age = age1;
}

public void showMemberInfo(){
    System.out.println("이름 : " + name);
    System.out.println("아이디 : " + id);
    System.out.println("비밀번호 : " + password);
    System.out.println("나이 : " + age);
}

public void showName(){
    System.out.println("이름 : " + name);
}

}

