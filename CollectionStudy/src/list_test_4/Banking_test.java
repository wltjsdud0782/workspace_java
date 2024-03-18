package list_test_4;

import java.util.Scanner;

public class Banking_test {
    public static void main(String[] args) {
        Banking banking = new Banking();
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("1.계좌개설 \t 2. 입금" +
                    "\t 3. 출금" +
                    "\t 4. 예금조회" +
                    "\t 5.계좌해지" +
                    "\t 6.전체조회 => ");
            int a = sc.nextInt();

            switch (a){
                case 1 : banking.newAcc();
                break;

                case 2 :
                case 3 :
                case 4 :
                case 5 :
                case 6 :
            }
        }
    }
}
