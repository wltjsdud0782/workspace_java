// ←이것을 주석이라고 부른다.
//이 주석은 '한 줄'을 주석 처리한다.
//'Ctrl + /' 주석 처리 단축키

/*여러 줄 주석
여러 줄 주석                 Ctrl + Shift + /
여러 줄 주석*/

//들여쓰기 tab    내어쓰기 shift + tab

//모든 자바 코드는 반드시 클래스 안에 작성한다.
//모든 자바 코드는 반드시 main 메소드 안에 작성한다.
//main 메소드 안의 코드는 위에서부터 차례대로 한 줄씩 실행된다.
//모든 명령어가 끝난 다음에는 반드시 세미콜론(;)으로 마무리한다.

public class First {
    public static void main(String[] args){

        //System.out.println() → () 안의 내용을 출력 + 한 줄 개행
        //↑ println 을 print 로 변경 시 한 줄 개행이 되지 않음.

        System.out.println("hello~ java!");
        System.out.println("hello~");
        System.out.print("안녕~ ");
        System.out.print("자바!");
    }
}
