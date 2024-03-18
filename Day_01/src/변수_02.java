//-변수명 작성법-
//하나의 파일에서 자료형이 달라도 변수명은 중복 불가능.
//자바에서는 대소문자를 구분한다.
//변수명은 소문자로 작성한다. (관례)
//변수명은 직관적으로 작성한다. (관례)  ex)폰번호 String phonenumber;
//변수명이 복합어(합성어)라면 CaemlCase 기법으로 표기 (관례) ex)phoneNumber
//변수는 원하는만큼 개수 제한없이 선언 및 사용 가능
//자료형이 동일한 변수는 동시에 다수를 선언할 수 있다.

public class 변수_02 {
    public static void main(String[] args) {
        int a, b, c, d, e;  //다수 선언

        //정수 : int
        //실수 : double
        //문자열 : String

        double num1;    //실수를 저장할 num1 상자 생성
        num1 = 5.5;
        System.out.println("num1 = " + num1);

        String str;     //문자열을 저장할 str 상자 생성
        str = "hong";
        System.out.println("str = " + str);

        //변수 선언 + 할당(저장)
        int num2 = 50;
        double num3 = 10.5;
        String str2 = "java";
    }
}
