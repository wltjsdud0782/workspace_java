package test;

public class test_4 {
    public static void main(String[] args) {
        test_4_B bp = new test_4_B();
        test_4_B bp1 = new test_4_B(10);
        test_4_B bp2 = new test_4_B(10,20);
        test_4_B bp3 = new test_4_B(10,20,30);
        test_4_B bp4 = new test_4_B(10,20,30,40);

        bp.disp();
        bp1.disp();
        bp2.disp();
        bp3.disp();
        bp4.disp();
    }
}
