public class 연산자_1 {
    public static void main(String[] args) {
        // + - * / %

        //%(모드연산자 mod) : 나눗셈의 나머지를 구하는 연산
        int num1 = 10 % 3;
        System.out.println("num1 = " + num1);

        //> < >= <= == !=(같지않다.) (비교연산자)
        System.out.println(10 > 5);

        //! (부정연산자) : 결과값의 반대 결과를 도출
        //참 → 거짓 , 거짓 → 참
        System.out.println(!true);
        System.out.println(!(5 == 5));

        //&&(and : 그리고) ||(or : 이거나) (논리연산자)
        System.out.println(5 > 3 && 3 > 1);  //둘 다 참 > true
        System.out.println(3 >= 2 || 10 > 11);  // 하나만 참 > true
    }
}
