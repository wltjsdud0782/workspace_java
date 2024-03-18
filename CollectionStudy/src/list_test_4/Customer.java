package list_test_4;

import java.util.List;

public class Customer {
    private String name;
    private int number;
    private String tel;
    private List<Account> acc;

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", tel='" + tel + '\'' +
                ", acc=" + acc +
                '}';
    }
}