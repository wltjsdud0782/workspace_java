package test.two;

public class Student {
    String name;
    int age;
    String addr;
    String gradeNum;
    String stuNum;

public void setName(String name){
    this. name = name;
}
public String getName(){
    return name;
}
public void age(int age){
    this. age = age;
}
public int age (){
    return age;
}
public void setAddr(String addr){
    this. addr = addr;
}
public String getAddr(){
    return addr;
}
public void setGradeNum(String gradeNum){
    this. gradeNum = gradeNum;
}
public String getGradeNum(){
    return gradeNum;
}
public void setStuNum(String stuNum){
    this. stuNum = stuNum;
}
public String getStuNum(){
    return stuNum;
}

public void studentInfo(){
    System.out.println("이름 : " + name);
    System.out.println("나이 : " + age);
    System.out.println("주소 : " + addr);
    System.out.println("학번 : " + gradeNum);
    System.out.println("연락처 : " + stuNum);
}


}
