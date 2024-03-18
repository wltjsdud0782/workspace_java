package test;

public class test_4_B extends test_4_A{
    private int x;
    private int y;

    public test_4_B(){
        super();
        x = 1;
        y = 1;
    }

    public test_4_B(int x){
        super(x);
        this.x = 1;
        this.y = 1;
    }

    public test_4_B(int x, int y){
        super(x,y);
        this.x = 1;
        this.y = 1;
    }

    public test_4_B(int x, int y, int x1){
        super(x,y);
        this.x = x1;
        this.y = 1;
    }
    public test_4_B(int x, int y, int x1, int y1){
        super(x,y);
        this.x = x1;
        this.y = y1;
    }

    public void disp(){
        super.disp();
        System.out.println("x = " + x + ", y = " + y);
    }
}
