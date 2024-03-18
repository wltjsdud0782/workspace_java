package method_test;

import javax.naming.Name;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Method_test_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        test1();
        test2(); test2_2();
        test3(5);
        test4("java");
        test5(5,3);
        test6(4, 7, 10);
        test7(5,10);
        test8("java", "Java");
        test9_name("김형진"); test9_age(33); test9_add("울산");
        test10("김형진", 33, "울산");

        int num = sc.nextInt();
        test11(num);

        String name = sc.next(); int age = sc.nextInt(); String add = sc.next();
        test12(name, age, add);

        int num1 = sc.nextInt(); int num2 = sc.nextInt();
        test13(num1, num2);

        test14(14);
        test15(4,7);
        test16(6);
        test17(10,3);
        test18(10,3);
        test19("java", 4);
    }

    public static void test1(){
        System.out.println("안녕하세요");
    }
    public static void test2(){
        System.out.println("반갑습니다.");
    }
    public static void test2_2(){
        System.out.println("어서오세요.");
    }
    public static void test3(int i){
        System.out.println(i);
    }
    public static void test4(String a){
        System.out.println(a);
    }
    public static void test5(int a, int b){
        System.out.println(a + b);
    }
    public static void test6(int a, int b, int c){
        System.out.println(a * b * c);
    }
    public static void test7(int a, int b){
        int max = a > b ? a : b;
        int min = a > b ? b : a;

        System.out.println(max / min);
        System.out.println(max % min);
    }

    public static void test8(String a, String b){
        System.out.println(a + " " + b);
    }
    public static void test9_name(String a){
        System.out.println("이름은 " + a + "입니다.");
    }
    public static void test9_age(int a){
        System.out.println("나이는 " + a + "살입니다.");
    }
    public static void test9_add(String a){
        System.out.println("주소는 " + a + "입니다.");
    }
    public static void test10(String name, int age, String add){ //위에서 입력되도록
        test9_name(name);
        test9_age(age);
        test9_add(add);
    }
    public static void test11(int num){
        System.out.println(num);
    }
    public static void test12(String name, int age, String add){
        System.out.println("이름은 " + name + "입니다.");
        System.out.println("나이는 " + age + "살입니다.");
        System.out.println("주소는 " + add + "입니다.");
    }
    public static void test13(int num1, int num2){
        System.out.print("두 수의 합 : ");
        System.out.println(num1 + num2);
    }
    public static void test14(int a){
        if (a % 2 == 0){ // sout(num % 2 == 0 ? "짝수" : "홀수")
        System.out.println("짝수입니다.");
        }
        else {
            System.out.println("홀수입니다.");
        }
    }
    public static void test15(int a, int b){
        if (a % 2 == 0 && b % 2 == 0){
            System.out.println("두 수는 짝수입니다.");
        }
        else if (a % 2 != 0 && b % 2 != 0){
            System.out.println("두 수는 홀수입니다.");
        }
        else{
            System.out.println("한 수만 짝수입니다.");
        }
    }
    public static void test16(int a){
        for (int i = 0; i <= a; i++){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void test17(int a , int b){
        int max = a > b ? a : b;
        int min = a > b ? b : a;

        for (int i = min+1; i < max; i++){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void test18(int a, int b){
        int max = a > b ? a : b;
        int min = a > b ? b : a;
        int cnt = 0;

        for (int i = min+1; i < max; i++){
            if (i % 5 == 0){
                cnt++;
            }
        }
                System.out.println(cnt);
    }
    public static void test19(String a, int b){
        for (int i = 0; i < b; i++){
            System.out.println(a);
        }
    }
}
