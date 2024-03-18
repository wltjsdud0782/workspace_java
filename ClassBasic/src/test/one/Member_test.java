package test.one;

import test.one.Member;

public class Member_test {
    public static void main(String[] args) {
        Member m1 = new Member();

        m1.setName("선영");

        m1.showName();
        System.out.println();

        m1.showMemberInfo();
    }
}
