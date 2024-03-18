package array_test;

public class Array_19_시험 {
    public static void main(String[] args) {
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100 + 1);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (max > arr[i]) {
                max = max;
            }
            else if(max < arr[i]){
                max = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++){
            if (min > arr[i]){
                min = arr[i];
            }
            else if (min < arr[i]){
                min = min;
            }
        }
        System.out.println();
        System.out.println(max);
        System.out.println(min);
    }
}