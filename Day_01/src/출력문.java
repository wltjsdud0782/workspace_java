public class 출력문 {
    public static void main(String[] args) {
        //숫자 출력 시 쌍따옴표("") 필요 X
        System.out.println(5);  //숫자 5 출력
        System.out.println("5"); //문자 5 출력

        //문자 출력 시 쌍따옴표("") 무조건 필요
        //System.out.println(java); → 오류 발생     <쌍따옴표 필요>

        //숫자 출력
        //숫자끼리의 연산은 연산 결과를 출력한다.
        System.out.println(5 + 5);
        System.out.println(1 + 3 * 3);

        //문자끼리의 합은 문자를 나열하여 출력한다.
        //문자끼리의 차, 곱, 나눗셈은 존재하지 않는다.
        System.out.println("5" + "5");   //55
        System.out.println("10" + "10.5" + "3");   //1010.53

        System.out.println(5 + "5");    //55
        System.out.println(5 + 5 + "5" + 5);    //1055
    }
}
