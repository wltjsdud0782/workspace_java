public class BeforeGeneric {
    public static void main(String[] args) {

        // 상자 하나 생성
        Box b1 = new Box();
        b1.set(new Apple());

        Box b2 = new Box();
        b2.set(new Orange());

        // b1 에서 데이터 리턴받기
        Object o1 = b1.get();
        System.out.println(o1);
        // 1. 객체 출력 - 해당 객체의 toString() 메소드 호출 (o1.toString())
        // 2. 다형성을 통해 객체가 만들어지면 부모 클래스의 메소드만 실행 가능
            // ▶ Object o1 = b1.get(); 을 하면 Object 클래스의 메소드만 실행 가능
        // 3. But, 메소드 오버라이딩 개념을 통해 메소드를 만들면 자식 클래스의 메소드 실행!


        // 실체는 apple 이지만 return 값이 object 였기 때문에 형변환 필수 [단점]
        Apple o2 = (Apple) b1.get();
    }
}
