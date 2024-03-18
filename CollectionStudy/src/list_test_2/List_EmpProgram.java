package list_test_2;

public class List_EmpProgram{
    private int num;
    private String name;
    private String team;
    private String tel;
    private int money;

    public List_EmpProgram(int num, String name, String team, String tel, int money) {
        this.num = num;
        this.name = name;
        this.team = team;
        this.tel = tel;
        this.money = money;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "List_EmpProgram{" +
                "num=" + num +
                ", name='" + name + '\'' +
                ", team='" + team + '\'' +
                ", tel='" + tel + '\'' +
                ", money=" + money +
                '}';
    }
}
