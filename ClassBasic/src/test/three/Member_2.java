package test.three;

public class Member_2 {
    private String name;
    private String id;
    private String password;
    private int age;

    public Member_2(){

    }

    public void setInfo(String name, String id){
        this.name = name;
        this.id = id;
    }
    public void printInfo(){
        System.out.println(name);
        System.out.println(id);
        System.out.println(password);
        System.out.println(age);
    }
}
