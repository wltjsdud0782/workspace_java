package zoo;

//동물병원에 케이지가 5개 있다.
//강아지, 고양이, 소
//케이지에 동물들을 저장할 수 있는 프로그램 생성

class Animal{
    public void sound(){
        System.out.println("동물이 웁니다.");
    }
}

public class Dog extends Animal{
    public void sound(){
        System.out.println("강아지가 웁니다.");
    }
}

class Cat extends Animal{
    public void sound(){
        System.out.println("고양이가 웁니다.");
    }
}

class Cow extends Animal{
    public void sound(){
        System.out.println("소가 웁니다.");
    }
}
