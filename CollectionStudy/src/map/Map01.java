package map;

import java.util.HashMap;
import java.util.Map;

public class Map01 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "김길동");
        map.put(2, "이길동"); //key 중복으로 제거됨
        map.put(3, "황길동");
        map.put(4, "황길동"); //value 중복은 가능
        map.put(2, "최길동"); //2 에 덮어짐

        System.out.println(map.get(2)); //최길동 value 출력
    }
}
