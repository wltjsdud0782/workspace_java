package overloading;

public class School {
    String schoolName;
    Stu stu; //★ 앞의 Stu는 클래스명 → 클래스도 자료형이다. ★

    public void printSchoolInfo(){
        System.out.println("학교명 : " + schoolName);
        stu.printInfo();
    }
}
