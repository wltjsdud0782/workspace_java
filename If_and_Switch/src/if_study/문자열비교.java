package if_study;

public class 문자열비교 {
    public static void main(String[] args) {
        // == 숫자만 비교 가능
        // A.equals(B) : 문자 비교 (A문자가 B와 같습니까?)
        // if(a.equals(c)) == if("자바".equals("자바")) ==  if(a.equals("자바"))
        String a = "java";
        String b = "java";
        String c = "JAVA";

        System.out.println(a.equals(b));
        System.out.println(a.equals(c));

        boolean result = b.equals(c); //예 아니오의 자료형 boolean사용해서 저장
        if(result){
            System.out.println(111);  //false 라서 실행 안됨
        }
        // ↑ 줄여보기
        if(b.equals(c)){
            System.out.println(111);
        }
    }
}
