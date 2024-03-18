package static_study;

public class InstCnt {
    static int num = 0; //static 으로 num 모두 공유

    public InstCnt(){
        num++;
        System.out.println("num = " + num);
    }
}
