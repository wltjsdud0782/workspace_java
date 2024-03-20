import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

interface Predict{ // 예측하다
        boolean test(int num);
    }

//interface Predicate <T>{ // 제네릭과 동시에 사용
//    boolean test(T num);
//}

    // 매개 변수로 들어온 수가 짝수일 때만 true 리턴
    // 매개 변수로 들어온 수가 10보다 작으면 true 리턴
    // 매개 변수로 들어온 수가 10이면 true 리턴
public class ExampleLambda {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5,6,7,8,9,10};
        // 배열을 리스트로 만들 때는 리스트 안 내용이 수정이 불가능하게 된다.
        List<Integer> list = Arrays.asList(arr);
        List<Integer> list1 = new ArrayList<>(list);


        Predicate<Integer> p = num -> num < 5;
        // list.removeIf() : 리스트에서 조건이 참인 것을 지우겠다.
        list1.removeIf(p);
        list1.forEach(num -> System.out.println(num));
        System.out.println();


        // 리스트에 저장되어 있는 수 중 짝수만의 합을 출력
        Predict p1 = num -> num % 2 == 0;
        lambda(list, p1);
        // 한 줄로 줄이기
        lambda(list, num -> num % 2 == 0);
        // 홀수만
        lambda(list, num -> num % 2 != 0);
        // 5보다 크면
        lambda(list, num -> num > 5);

    }

    public static void lambda(List<Integer> list, Predict p){
        int sum = 0;

        for (int e : list){
            if (p.test(e)){
                sum = sum + e;
            }
        }
        System.out.println(sum);
    }
}
