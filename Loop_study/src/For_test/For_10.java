package For_test;

//while(true){            while문 무한루프
//for(;;){                for문 무한루프

public class For_10 {
    public static void main(String[] args) {
        int total = 0;
        for (int i = 1; total < 301; i++){
            total = total + i;
            if (total > 300){
                System.out.println(total);
                System.out.println(i);
            }
        }
        //int = 1;
        //while(true){
        //      total = total + i;
        //      if(total > 300){
        //          break;}
        //      i++;}     //이것까지 실행해버리면 마지막 수 i + 1 이 되어버림
    }
}
