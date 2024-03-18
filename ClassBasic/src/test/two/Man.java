package test.two;

public class Man {
    String name;
    int age;
    String addr;

    //생성자 : 클래스가 가진 변수의 값을 초기화하는 용도
    //생성자는 리턴 타입이 없고 반드시 클래스명과 동일해야한다.
    //생성자는 메소드의 일종이지만 문법이 다를뿐.
    //↓ 메소드 아님. 생성자임.
    public Man(){
        name = "이름을 입력하세요.";
        age = 0;
        addr = "주소를 입력하세요.";

    }

    //모든 멤버 초기화 메소드
    public void initMan(String name, int age, String addr){
        this.name = name;
        this.age = age;
        this.addr = addr;
    }
    //(1)_3,4
    //this. → '이 클래스에서 정의된' 으로 해석
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public void printInfo(){
        System.out.println("이름 : " + this.name);
        System.out.println("나이 : " + age);
        System.out.println("주소 : " + addr);
    }
}
