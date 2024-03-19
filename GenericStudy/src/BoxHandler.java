public class BoxHandler {
    // 제네릭 + 와일드카드
    // toy나 toy를 상속받은 친구들만 가지는 친구를 get 만 하겠다.
    public <T extends Toy> void test(GBox<? extends T> box){

    }

    // 첫번째 매개변수로 들어온 박스에서 장난감을 꺼낸 후
    // 두번째 매개변수로 들어온 박스에 저장
    public static void moveBox(GBox<? extends Toy> box1, GBox<? super Toy> box2){
       box2.set(box1.get());
    }

    // 상자에 들어있는 내용물을 추출하는 메소드
    public static void outBox(GBox<? extends Toy> box){
        Toy toy = box.get();
        //box.set(new Toy()); 오류 : 데이터를 넣지 못하게 하기 위함, 와일드카드 상한제한
    }

    // 상자에 들어있는 내용물을 적재하는 메소드
    public static void inBox(GBox<? super Toy> box, Toy toy){
        box.set(toy);
        //Toy t = box.get(); 오류 : 데이터를 뽑지 못하게 하기 위함, 와일드카드 하한제한
    }
}

class Toy{ }
class Robot extends Toy{ }
class Car extends Toy{ }