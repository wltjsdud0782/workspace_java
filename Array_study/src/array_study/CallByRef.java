package array_study;
//기본자료형과 참조자료형의 차이점

public class CallByRef {
    public static void main(String[] args) {
        //기본자료형 중 int
        int a = 10;
        int b = a;
        a = 5;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        ///////////////////////////////////////////
        //참조자료형 중 int[]
        int[] arr = {10};  //arr 은 집 주소를 알고 있고 그 주소에 10이 살고 있음.
        int[] arr2 = arr;  //arr2 는 arr 이 알고 있던 집 주소를 받음.
        arr[0] = 5;  //arr 집 주소의 주인을 5로 바뀌고 arr2 도 집 주소의 주인이 바뀐걸 인식.
        System.out.println(arr[0]);
        System.out.println(arr2[0]);

        //call by value        → 값 자체를 읽음  ex. int
        //call by reference    → 참조 값을 읽음  ex. int[]
    }
}
