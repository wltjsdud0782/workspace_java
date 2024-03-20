// 내부 클래스(Inner)
// 클래스의 맴버 : 맴버 변수(private String name;), 생성자, 메소드의 정의, 클래스
//                 로컬(지역) 변수는 클래스가 아닌 메소드 안에 있음.

// 이너 클래스의 종류
// 1) 맴버 클래스 - 클래스 안 클래스
// 2) 로컬 클래스 - 메소드 안 클래스
// 3) 익명 클래스 ◆ - 이름이 없는 클래스
// 4) 네스티드(Nested) 클래스 - static이 붙은 클래스
public class InnerClass {
    class Member{ // 클래스 안 클래스 생성 (맴버 이너 클래스)
        int a; // 변수 생성 가능

        public void aaa(){ // 메소드 정의 가능
        }
    }

    public void method1(){
        class Item{ // 메소드 안 클래스 생성 (로컬 이너 클래스)

        }
    }

}
