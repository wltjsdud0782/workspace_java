package zoo;

import test.C;

public class ZooTest {
    public static void main(String[] args) {
        //강아지 케이지 3, 고양이 케이지 3, 소 케이지 3
        Dog[] dogs = new Dog[3];
        Cat[] cats = new Cat[3];
        Cow[] cows = new Cow[3];

        int dogCnt = 0;
        dogs[dogCnt++] = new Dog(); // → 후위연산자
        dogs[dogCnt++] = new Dog();

        int catCnt = 0;
        cats[catCnt++] = new Cat(); // → 후위연산자
        cats[catCnt++] = new Cat();

        int cowCnt = 0;
        cows[cowCnt++] = new Cow(); // → 후위연산자
        cows[cowCnt++] = new Cow();

        for (int i = 0; i < dogCnt; i++){
//            dogs[i].dogSound();
        }
        for (int i = 0; i < catCnt; i++){
//            cats[i].catSound();
        }
        for (int i = 0; i < cowCnt; i++){
//            cows[i].cowSound();
        }
    }
}
