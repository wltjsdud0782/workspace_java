package method_test;

import javax.xml.transform.Result;
import java.sql.SQLOutput;

public class Method_test_3 {
    public static void main(String[] args) {
        test1(3);
        test2(6);
        test3();
        System.out.println(test4(6));
        test5(new int[3]);
        int[] a = {1, 10, 5, 4, 3};
        System.out.println(test6(a));
        test7(new String[4]);
        //test9 출력
        int[] result = test9(a);
        for(int e : result){
            System.out.println(e);
        }

    }
    public static void test1(int a){
        for (int i = 1; i < 10; i++){
            System.out.println(a + " * " + i + " = " + (a*i));
        }
    }
    public static void test2(int a){
        for (int i = 1; i < 101; i++){
            if(a * i > 100){
                break;
            }
            System.out.println(a*i);
        }
    }
    public static int test3(){
        int a = (int)(Math.random()*50+1);
        System.out.println(a);
        return a;
    }
    public static boolean test4(int a){
        return (a % 2 == 0 ? true : false);
        //return a % 2 == 0; 도 가능
    }
    public static void test5(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    public static int test6(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (max < arr[i]){
                max = arr[i];
            }
        }
            return max;
    }
    public static String test7(String[] arr){
        String str = "";
        for (int i = 0; i<arr.length; i++){
            str = str + arr[i];
        }
        return str;
    }

    /////////////8번 아직 안함///////////////

    public static int[] test9(int[] arr){
        int cnt = 0; //짝수 개수
        for (int i = 0; i<arr.length; i++){
            if (arr[i] % 2 == 0){
                cnt++;
            }
        }
        int[] resultArr = new int[cnt];     //짝수 개수로만 만든 길이의 배열

        int index = 0; //새로운 배열의 순서
        for (int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){  //원래 배열의 짝수만 뽑기
                resultArr[index] = arr[i]; //차례대로 넣기
                index++;

                //resultArr[index++] = arr[i] 79,80줄 합친 말
                }
            }
        return resultArr;
        }
    }