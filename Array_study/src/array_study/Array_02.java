package array_study;

public class Array_02 {
    public static void main(String[] args) {
        //정수를 3개 저장할 수 있는 배열 arr1을 생성
        int[] arr1 = new int[3];

        //배열에 저장된 값 읽기
        //배열은 출력하면 이상한 값이 나온다.
        System.out.println(arr1);

        //배열 출력은 출력의 각 요소를 출력해야 한다.
        //배열의 첫번째 요소 출력
        System.out.println(arr1[1]);
        //System.out.println(arr1[3]); // 세번째 요소는 없기 때문에 오류가 뜬다.

        //실수를 100개 저장할 수 있는 배열 arr2 생성
        double[] arr2 = new double[100];

        //배열의 모든 요소 출력
        for (int i = 0; i<100; i++){
            System.out.println(arr2[i]);

        }
    }
}
