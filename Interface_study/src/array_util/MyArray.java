package array_util;

public class MyArray implements ArrayUtil {
    @Override
    public double getTwoArrayAvg(int[] arr1, int[] arr2) {
        int total = 0;
        double avr = 0;

        for (int i = 0; i < arr1.length; i++) {
            total = total + arr1[i];
        }
        for (int i = 0; i < arr2.length; i++){
            total = total + arr2[i];
        }
        avr = total / (double)(arr1.length + arr2.length);
        return avr;
    }

    @Override
    public boolean isEvenArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1){
                return false;
            }
        }
        return true;
    }
}
