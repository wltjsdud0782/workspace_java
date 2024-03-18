package math;

public class MyMath implements MathUtil{
    public static void main(String[] args) {

    }

    @Override
    public int getMin(int a, int b) {
        return a > b ? b : a;
    }

    @Override
    public double getCircleArea(int radius) {
        return radius < 0 ? 0 : 2 * Math.PI;
    }

    @Override
    public int getMultipul(int num1, int num2) {
        return num1^num2;
        }
    }

