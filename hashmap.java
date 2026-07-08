import java.util.HashMap;
import java.util.Map;

public class hashmap {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(101, "vamsi");
        map.put(102, "priya");
        map.put(103, "rohith");
        System.out.println(map);
        System.out.println(map.get(102));
        System.out.println(map.containsKey(103));
        System.out.println(map.containsValue("vamsi"));
        map.remove(101);
        System.out.println(map);
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet());
    }
}
