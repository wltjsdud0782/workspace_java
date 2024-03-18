package test.four;

public class Test {
    public static void main(String[] args) {
        Worker w = new Worker();
        w.setInfo("김자바", 20, "울산");
        w.setWorkInfo("삼성", "무선사업부", 1000);
        w.displayWorker();
    }
}
