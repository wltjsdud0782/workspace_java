package exception;

import java.util.Scanner;

//예외 전가
public class Exception_3 {
    Scanner sc = new Scanner(System.in);

    public void aaa() throws Exception {
        int a = sc.nextInt();
    }

    public void bbb() throws Exception {
        aaa();
    }
    public void ccc(){
//        bbb();
    }
}
