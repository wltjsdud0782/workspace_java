package array_test;

public class Array_8 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 7};
        int total = 0;

        for (int i=0; i<arr.length; i++){
            total = total + arr[i];
        }
        System.out.println(total);
    }
}
