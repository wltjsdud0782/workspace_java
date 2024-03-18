package test.four;

public class PersonInfo {
    private String name;
    private int age;
    private String addr;

    public void setInfo(String name, int age, String addr){
        this.name = name;
        this.age = age;
        this.addr = addr;
    }

    public void displayPersonInfo(){
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("주소 : " + addr);
    }
}
