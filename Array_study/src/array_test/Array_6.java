package array_test;

public class Array_6 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for(int i = 0; i<arr.length; i++){
            arr[i] = 3;
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for(int e : arr){
            System.out.print(e + " ");
        }
    }
}
