package array_util;

//MyArray 클래스 구현, 메소드 구현
public interface ArrayUtil {

    //매개변수로 들어온 두 배열의 모든 요소의 평균을 리턴
    double getTwoArrayAvg(int[] arr1, int[] arr2);

    //매개변수로 들어온 배열의 모든 요소의 값이 짝수일때만 true 리턴, 이외 false 리턴
    boolean isEvenArray(int[] arr);
}
