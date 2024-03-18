package array_test;

public class Array_5 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        //for-each문
        //배열의 모든 요소 출력할 때
        //for (반복을 돌릴 자료형 e : 반복을 돌릴 변수){}
        for(int e : arr){
            System.out.println(e);
        }

        double [] array2 = {1.1 , 2.2 , 3.3};
        for(double e : array2){
            System.out.println(e);
        }

        String [] array3 = {"java" , "python", "c++"};
        for(String e : array3){
            System.out.println(e);
        }
    }
}

