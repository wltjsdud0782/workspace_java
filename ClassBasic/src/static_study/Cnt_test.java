package static_study;

public class Cnt_test {
    public static void main(String[] args) {
        InstCnt cnt1 = new InstCnt();
        InstCnt cnt2 = new InstCnt();
        InstCnt cnt3 = new InstCnt();

        //비추천 방식
        System.out.println(cnt1.num);  //3출력

        //추천 방식
        System.out.println(InstCnt.num); //모두 num 공유하고있어서 객체 이용
    }
}
