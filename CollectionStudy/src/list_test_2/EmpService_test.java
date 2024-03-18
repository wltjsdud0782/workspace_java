package list_test_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmpService_test {
    public static void main(String[] args) {
        EmpService service = new EmpService();
        //1)
        service.login();
        System.out.println();

        //2)
        service.moneyInfo();
        System.out.println();

        //3)
        service.moneyUp();
        System.out.println();

        //4)
        service.allInfo();
    }
}
