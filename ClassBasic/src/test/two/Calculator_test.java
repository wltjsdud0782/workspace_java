package test.two;

import java.util.Scanner;

public class Calculator_test {
    public static void main(String[] args) {
        Calculator c = new Calculator();

        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 수 : ");
        int num1 = sc.nextInt();
        System.out.print("두 번째 수 : ");
        int num2 = sc.nextInt();
        System.out.print("연산자 : ");
        String oper = sc.next();

        c.setNumber(num1, num2);

        switch(oper){
            case "+" :
                System.out.println(num1 + " " + oper + " " + num2 + " = " + c.getPlus());
                break;
            case "-" :
                System.out.println(num1 + " " + oper + " " + num2 + " = " + c.getMinus());
                break;
            case "/" :
                System.out.println(num1 + " " + oper + " " + num2 + " = " + c.getDivision());
                break;
            case "*" :
                System.out.println(num1 + " " + oper + " " + num2 + " = " + c.getMultiply());
                break;
            default :
                System.out.println("잘못 입력했습니다.");
                break;
        }
    }
}
