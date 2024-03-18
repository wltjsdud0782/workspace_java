package array_study;

public class Array_04 {
    public static void main(String[] args) {
        //특정값으로 초기화된 배열을 생성
        int[] arr = {1, 2, 3, 4, 5};

        //단, 특정값으로 초기화 된 배열 생성 시 주의사항!!
        //선언 및 생성을 무조건 같이해야함. 별도 시행 불가
        //int[] arr1;   arr1 = {1, 2, 3};   →  불가능

        //배열 요소의 값 변경
        arr[2] = 5; //두번째 요소에 5를 대입   >   1 2 5 4 5
        //arr = 5; 불가능

        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
