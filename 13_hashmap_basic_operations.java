import java.util.*;

class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Java");
        map.put(2, "Python");
        map.put(3, "C");

        System.out.println(map);

        System.out.println(map.get(2));
        System.out.println(map.containsKey(1));
        System.out.println(map.containsValue("Java"));

        map.remove(3);

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
