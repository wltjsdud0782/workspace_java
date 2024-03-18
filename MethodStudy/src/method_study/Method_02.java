package method_study;

//메소드명은 소문자로!!
//메소드는 필요하면 여러개 정의 가능

public class Method_02 {
    public static void tellMyName(){
        System.out.println("이름은 홍길동입니다.");
        tellMyAge();   //main 메소드 외 다른 메소드 안에도 호출 가능
    }

    public static void tellMyAge(){
        System.out.println("나이는 20살입니다.");
    }

    public static void main(String[] args) {
        System.out.println("프로그램 시작");
        tellMyName();
        System.out.println("프로그램 종료");

    }
}
