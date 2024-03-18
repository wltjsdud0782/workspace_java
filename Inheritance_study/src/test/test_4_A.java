package test;

public class test_4_A {
    private int x;
    private int y;

    public test_4_A(){
        this.x = 1;
        this.y = 1;
    }
    public test_4_A(int x){
        this.x = x;
        y = 1;
    }
    public test_4_A(int x, int y){
        this. x = x;
        this. y = y;
    }

    public void disp(){
        System.out.print("x = " + x + ", y = " + y + ", ");
    }
}
