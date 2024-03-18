package array_test;

public class Array_17_시험 {
    public static void main(String[] args) {
        int[] arr = new int[6];

        for (int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random()*45+1);
        }
        for (int i = 0; i < arr.length; i++){       //for(int e : arr){
            System.out.print(arr[i] + " ");         //sout(e + " ")}
        }
    }
}
