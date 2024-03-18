package array_test;

public class Array_13 {
    public static void main(String[] args) {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++){
            arr[i] = i + 1;
        }

        for(int i = 0; i < arr.length; i++) {   //2부터 100까지 반복 for

            //cnt = 나누어 떨어지는 수 ex>4 : 1,2    cnt = 2  [cnt = 1 이 소수]
            int cnt = 0;

            for (int j = 1; j < arr[i]; j++) { //소수 물어보는 반복 for
                if (arr[i] % j == 0) { //나눠지는 수를 세는 if
                    cnt++;
                    if (cnt > 1) { //나눠지는 수가 2개이상이면 멈추는 if
                        break;
                    }
                }
            }
            if (cnt == 1){
                System.out.println(arr[i]);
            }
        }
    }
}
