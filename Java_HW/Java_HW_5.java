import java.util.HashMap;
import java.util.Random;
import java.util.TreeMap;

public class Java_HW_5 {
    public static void main(String[] args) {
        // 1
        HashMap<Integer, String> map = new HashMap<>();

        // 2
        map.putIfAbsent(0, "red");
        map.putIfAbsent(1, "green");
        map.putIfAbsent(2, "blue");

        // 3
        map.forEach((k, v) -> map.put(k, v + "!!!"));
        //System.out.println(map);

        // 4
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.putIfAbsent(0, "red");
        treeMap.putIfAbsent(1, "green");
        treeMap.putIfAbsent(2, "blue");

        // 5
        for (int i = 0; i < 997; i++) {
            Random rand = new Random();
            if (treeMap.putIfAbsent(rand.nextInt(10000), "string") !=null) {
                i--;
            }
        }

        //System.out.println(treeMap.size());  // Проверка количества элементов

        // 6
        System.out.println(map);


    }
}
