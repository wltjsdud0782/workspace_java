package man;

public class Test_1 {
    public static void main(String[] args) {
        Ccc c = new Ccc();
        System.out.println(c.a);
    }
}

class Aaa{
    int a;
}

class Bbb extends Aaa{
    int b;
}

class Ccc extends Bbb{
    int c;
}
