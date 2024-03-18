package test.two;

public class Calculator {
    int num1;
    int num2;

    //num1 과 num2 를 변경하는 메소드
    public void setNumber(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getPlus(){
        return num1 + num2;
    }
    public int getMinus(){
        return num1 - num2;
    }
    public double getDivision(){
        return (double)num1 / num2;
    }
    public int getMultiply(){
        return num1 * num2;
    }
}
