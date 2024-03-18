package For_study;

public class Break {
    public static void main(String[] args) {
        for(int i = 1; i < 11; i++){
            if(i == 5){
                //break를 만나는 순간 "가장 가까운 반복문"을 벗어난다.
                break;
            }
            System.out.println(i);
        }
    }
}
