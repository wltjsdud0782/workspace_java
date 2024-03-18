package For_test;

public class For_12 {
    public static void main(String[] args) {
        for (int i = 1; i<10; i++){
            for (int j = 2; j<10; j++){
                System.out.print(j + " * " + i + " = " + (i*j) + "\t");
            }
            System.out.println();
        }
    }
}          // (\t)  →  칸맞추기(?)  // (\n)  →  ln 이랑 같음 한줄개행
