public class 형변환 {
    public static void main(String[] args) {
        //(자료)형변환 (정수 → 실수 , 실수 → 정수)

        //자동 형 변환 (promotion)
        int num1 = 10;
        double num2 = num1;
        System.out.println("num2 = " + num2);

        //명시적 형 변환 (casting)
        double num3 = 10.9;
        int num4 = (int)num3;   //바꾸고 싶은 자료형을 앞 소괄호에 첨부. 소수점을 잘라버린다.
        System.out.println("num4 = " + num4);
    }
}
