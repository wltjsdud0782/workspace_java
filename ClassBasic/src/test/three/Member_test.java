package test.three;

public class Member_test {
    public static void main(String[] args) {
        Member m = new Member();

        m.setName("자바");
        m.setId("java");
        m.setPassword("1234");

        m.displayInfo();
    }
}
