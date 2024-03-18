package zoo;

public class ZooTest_2 {
    public static void main(String[] args) {
        Animal[] animals = new Animal[5];

        //다형성 활용
        int cnt = 0;
        animals[cnt++] = new Dog();
        animals[cnt++] = new Cat();
        animals[cnt++] = new Cow();

        //오버라이딩
        for (int i = 0 ; i < cnt; i++){
            animals[i].sound();
        }


    }
}
