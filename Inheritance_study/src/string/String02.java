package string;

public class String02 {
    public static void main(String[] args) {
        String s1 = "java";
        String s2 = "hello";

        //문자열 나열 메소드
        String s3 = s1.concat(s2);
        System.out.println(s3);

        //일부 문자열 추출
        String s4 = "abcdefg";
        String s5 = s4.substring(3); //3번째부터 시작 (0,1,2)잘림
        System.out.println(s5);
        String s6 = s4.substring(1,4); //1번째 시작 4번째전까지 (0,4,5,6,7)잘림
        System.out.println(s6);

        //문자 변경 추출
        System.out.println(s4.toLowerCase()); //전체 소문자 출력
        System.out.println(s4.toUpperCase()); //전체 대문자 출력

        //문자열을 숫자로 변경
        String s7 = String.valueOf(10);
        System.out.println(s7); //문자열의 10이 나옴

        //문자열 자르기(조각내기)
        String s8 = "a,b,c,d";
        String[] result = s8.split(",");
        for (int i = 0; i < result.length; i++){
            System.out.print(result[i] + " ");
        }
    }
}
