public class 기본자료형_1 {
    public static void main(String[] args) {
        boolean b = true;
        System.out.println("b = " + b);

        int num1 = 10;
        long num2 = 10000000000L;    //int 로 인식한 컴퓨터에게 L을 첨부하며 long으로 인식시킨다.

        double num3 = 10.5;
        float num4 = 10.5F;

        char c1 = 'A';        //문자열이 아닌 문자는 홀따옴표('') 필수
        int c2 = 'A';
        System.out.println(c1);
        System.out.println(c2);

    }
}
