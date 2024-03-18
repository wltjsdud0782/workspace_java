package monitor;

public class Monitor_test {
    public static void main(String[] args) {
        //Monitor 객체 5개를 저장할 수 있는 배열 생성
        Monitor[] monitors = new Monitor[5]; //참조자료형은 모두 null로 초기화

        //배열 각 요소에 모니터 객체 저장
        monitors[0] = new Monitor("삼성", 10000, "black");
        monitors[1] = new Monitor("LG", 20000, "white");
        monitors[2] = new Monitor("삼성", 25000, "white");
        monitors[3] = new Monitor("LG", 10000, "black");
        monitors[4] = new Monitor("삼성", 13000, "white");

        //모니터의 모든 정보 출력
        for (int i = 0; i < monitors.length; i++){
            monitors[i].showInfo();
        }

        //모니터 중 제조사가 삼성인 모니터들의 정보 출력
        for (int i = 0; i < monitors.length; i++){
            if (monitors[i].getBrand().equals("삼성")){
                monitors[i].showInfo();
            }
        }

        //같은 문제의 for-each문
        for (Monitor e : monitors){  //반복돌릴자료형 e : 반복돌릴변수명
            if(e.getBrand().equals("삼성"));{
                e.showInfo();
            }

        }

        //모니터의 모든 가격의 총합을 출력
        int total = 0;
        for (int i = 0; i < monitors.length; i++){
            total = total + monitors[i].getPrice();
        }

        //가격이 20000원인 모니터의 색상을 레드로 변경
        for (int i = 0; i < monitors.length; i++){
            if (monitors[i].getPrice() == 20000){
                monitors[i].setColor("레드");
            }
        }


    }
}
