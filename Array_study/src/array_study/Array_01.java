package array_study;
        //배열 : 같은 자료형 데이터를 여러개 저장할 수 있는 공간
        //배열은 하나의 자료형이다.
public class Array_01 {
    public static void main(String[] args) {
        //배열을 선언하는 방법
        //정수를 여러개 저장할 수 있는 배열 arr1 선언
        int[] arr1;

        //선언 된 배열을 생성 (변수에서 값 초기화 단계)
        //배열 생성 시 몇 개의 데이터를 저장할 지 결정함
        //arr1 으로 선언 된 배열을 3개의 정수를 저장할 배열로 생성
        arr1= new int[3];   //각 칸에는 0으로 초기화

        //배열의 선언과 생성을 동시에 진행
        //정수를 5개 저장할 수 있는 배열 arr2를 생성.
        int[] arr2 = new int[5];
        //자료형이 다르면 값을 못 넣기 때문에 int arr2 = 10; 불가능

        //실수 6개를 저장할 수 있는 배열 arr3을 생성.
        double[] arr3 = new double[6]; //각 칸에는 0.0으로 초기화

        //문자열 3개를 저장할 수 있는 배열 arr4를 생성.
        String[] arr4 = new String[3]; //각 칸에는 null로 초기화
    }
}
