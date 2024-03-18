package test.four;

public class Worker { //소문자 변수 대문자 클래스
    private PersonInfo personInfo;
    private WorkInfo workInfo;

    public Worker(){ //초기화값은 생성자에서
        personInfo = new PersonInfo();
        workInfo = new WorkInfo();
    }

    //회사원의 정보를 저장하는 메소드
    public void setInfo(String name, int age, String addr){
        personInfo.setInfo(name, age, addr);
    }
    public void setWorkInfo(String company,String dept, int salary){
        workInfo.setWorkInfo(company, dept, salary);
    }


    //저장된 정보를 출력하는 메소드
    public void displayWorker(){
        personInfo.displayPersonInfo();
        workInfo.displayWorkInfo();
    }
}
