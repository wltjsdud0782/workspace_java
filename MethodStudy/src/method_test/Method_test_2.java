package method_test;

import javax.xml.transform.Result;
import java.util.Scanner;

public class Method_test_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(test1(2, 5));
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(test2(a, b));
        System.out.println(test3(5, 3));
        System.out.println(test4("java", "JAVA"));
        System.out.println(test5(76));
        System.out.println(test6(8));
        System.out.println(test7(7));
        System.out.println(test8(67, 97, 88));
        System.out.println(test9(7));
    }

    public static int test1(int a, int b) {
        return a + b;
    }

    public static int test2(int a, int b) {
        return a * b;
    }

    public static int test3(int a, int b) {
        return (a > b ? a : b);
    }

    public static String test4(String a, String b) {
        return a + b;
    }

    public static String test5(int a) {
        String str = "";
        if (a >= 90) {
            str = "A";
        } else if (a >= 70) {
            str = "B";
        } else {
            str = "C";
        }
        return str;
    }

    public static String test6(int a) {
        //문자열 → 정수  로 변경
        int aa = Integer.parseInt("100");    //100
        //정수 → 문자열  로 변경
        String ab = String.valueOf(100);
        return a + "";
    }

    public static double test7(double a) {
        return a * a;
    }

    public static double test8(int a, int b, int c) {
        return (double) (a + b + c) / 3;
        //return (a+b+c) / 3.0 ;
    }

    public static int test9(int a){
        int total = 0;
        for (int i = 1; i <= a; i++) {
            if (i % 2 != 0) {
                total = total + i;
            }
        }
        return total;
    }
}

