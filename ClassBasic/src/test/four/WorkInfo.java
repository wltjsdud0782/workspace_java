package test.four;

public class WorkInfo {
    private String company;
    public String dept; //부서명
    public int salary; //급여

    public void setWorkInfo(String company, String dept, int salary){
        this.company = company;
        this.dept = dept;
        this.salary = salary;
    }

    public void displayWorkInfo(){
        System.out.println("회사명 : " + company);
        System.out.println("부서명 : " + dept);
        System.out.println("급여 : " + salary);
    }
}
