package method_study;
//매개변수로 두 정수를 전달하면 두 정수의 합을 리턴하는 메소드

//리턴타입 (원래 메소드의 'void' 자리) : "리턴되는 데이터의 자료형과 동일"하게 작성.
//※ void = 리턴 값X ※

//메소드에서 return 키워드는 반드시 "모든 내용이 끝난 후 작성." return 후 어떠한 코드 작동X
//return은 "하나의 결과값"만 돌려줄 수 있다.

public class Method_05 {
    public static void main(String[] args) {
        int a = getSum(10,20);   // 해석 : int a = 30;
        System.out.println(a);   // 30 으로 출력
        System.out.println(getSum(10,20));    //30으로 출력. 값이 같다.

        double b = getSum2(5,10);
        System.out.println(b);
        System.out.println(getSum2(5,10));
    }

    public static int getSum(int a, int b){
        return a + b;
    }

    //매개변수로 정수 두 개를 전달하면 두 정수의 나눗셈 결과를 리턴하는 메소드
    //결과는 반드시 실수로 나오게 하세요.

    public static double getSum2(int a, int b){
        int max = 0;
        int min = 0;
        if (a > b){
            max = a; min = b;
        }
        else if (b > a){
            max = b; min = a;
        }
        return (double)max / min;
    }
}
