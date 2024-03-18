package array_study;

public class Random {
    public static void main(String[] args) {
        //Mate.random()     →     0.0 <= x < 1.0 의 실수 랜덤 뽑기
        double rand = Math.random();
        System.out.println(Math.random());

        //1~20 포함하는 숫자 중 랜덤한 정수를 뽑아주세요.
        int i = (int)(Math.random() * 20 + 1);
        System.out.println(i);
    }
}
