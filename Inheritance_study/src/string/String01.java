package string;

public class String01 {
    public static void main(String[] args) {
        //String(imutable) : 값이 한 번 저장되면 변경 불가 변수
        String str1 = "java";
        String str2 = "java";
        String str3 = new String("java");
        String str4 = new String("java");

        // 참조자료형에서의 == : 두 객체가 같은 '주소'에 저장된 데이터

        if (str1 == str2){
            System.out.println("str1 과 str2 는 같음");
        }
        if (str2 == str3){
            System.out.println("str2 과 str3 는 같음");
        }
        if (str3 == str4){
            System.out.println("str3 과 str4 는 같음");
        }
    }
}
