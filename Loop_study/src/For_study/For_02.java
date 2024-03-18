package For_study;

public class For_02 {
    public static void main(String[] args) {
        //1부터 10까지의 수 중에서 홀수만 출력
        for(int i = 1; i<11; i++){
            if (i % 2 == 1){
                System.out.println(i);
            }
        }
        ////////////////////////////
        for(int i = 1; i<11; i = i + 2){
            System.out.println(i);
        }
    }
}
