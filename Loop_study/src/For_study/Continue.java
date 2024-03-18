package For_study;

public class Continue {
    public static void main(String[] args) {
        for(int i = 1; i < 11; i++){
            if(i == 5){
                //continue를 만나면 가장 가까운 반복문의 끝으로 이동.
                //for문 벗어나지 않고 계속 진행했기 때문에 5가 출력되지 않음.
                continue;
            }
            System.out.println(i);

        }
    }
}
