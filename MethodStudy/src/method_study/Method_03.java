package method_study;

//메소드를 호출 할때는 메소드명과 매개변수 정보가 일치해야 한다.

public class Method_03 {
    public static void main(String[] args) {
        tellMyName("java");     //String name = "java";
        tellMyName("임꺽정");
        //tellMyName(5); → 불가능

        tellMyAge(20);
    }

    public static void tellMyName(String name){ //String = 자료형 name = 변수명
        //여기서 괄호 안 'String name' 이라는 변수를 매개변수(parameter) 라고 칭한다.
        System.out.println("이름은 " + name +"입니다.");
    }

    public static void tellMyAge(int age){
        System.out.println("나이는 " + age + "입니다.");
    }
}
