package object;

public class Person {
    String name;
    int age;

    //'@'어노테이션 : 개발자의 실수를 줄이기 위해 사용
    @Override
    public boolean equals(Object obj) {
        Person person = (Person)obj;
        if (name.equals(person.name) && age == person.age) {
         return true;
        }
        else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
