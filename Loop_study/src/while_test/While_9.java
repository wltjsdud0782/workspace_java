package while_test;

import java.util.Scanner;
//삼항연산자
//int bbb = 0; if(10>5){bbb=1;} else{bbb=2;}
//int bbb = 10 > 5 ? 1 : 2;
public class While_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int total = 0;

        int max=0;
        int min=0;
        if (a < b){
            max = b; min = a;  //int min = a > b ? a : b
        }
        if (a > b){
            max = a; min =b; // int max = a > b ? a : b;
        }
        if (a == b){
        }

        total = total - min;
        //int i = min + 1;
        while (min < max){       // while(i < max)
            total = total + min; //total = total + i;
            min++;
        }

        System.out.println(total);
    }
}
