public class 변수문제_4 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("현재 두 수가 가진 수");
        System.out.println("a = " + a + " / " + "b = " + b);
        System.out.println();

        int c = b;
        b = a;
        a = c;

        System.out.println("두 변수에 들어 있는 값을 스위칭한 결과");
        System.out.println("a = " + a + " / " + "b = " + b);
    }
}
