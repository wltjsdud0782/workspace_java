public class 연산자_2 {
    public static void main(String[] args) {
        //=  +=  -=  *=  /=  %= (대입연산자)
        int result1 = 0;
        result1 += 1;   //result 1 = result1 + 1 → 값을 1 증가

        //num -= 3; → num = num - 3
        //a *= 5; → a = a * 5


        //(증감연산자)       ★어렵고 헷갈림★
        //증감연산자는 단독으로 사용할 때와 다른 코드와 함께 사용할 때 증감하는 시기가 달라진다.
        //단독 사용 : 한 줄에 증감연산자만 사용한 경우만 바로 증감

        int num = 5;
        num++; //num = num + 1      num += 1
        System.out.println(num);
        ++num; //위와 동일
        System.out.println(num);

        int x1 = 5;
        int y1 = ++x1;
        System.out.println("x1 = " + x1);

        int x2 = 5;
        int y2 = x2++;  // = 부터 해석후 x2 에 1 증가시킴
        System.out.println("x2 = " + x2);

        System.out.println("y1 = " + y1);
        System.out.println("y2 = " + y2);

        int z = 3;
        System.out.println(z++); //출력 후 z에 1 증가
        System.out.println(z);

        // = → 제일 마지막 해석 (but, 후위 증감 연산자와 있을땐 후위 증감 연산자가 제일 마지막)
        // 10 > 3 && 3 < 1 || 5 < 3 (&&가 우선 순위)
    }
}
