package man;

public class Man_test {
    public static void main(String[] args) {
        BusinessMan m = new BusinessMan();

        System.out.println(m.name);
        System.out.println(m.company);
        m.tellCompany();
        m.tellName();
    }
}
