package junit.exercises;
import java.util.*;

public class CollectionMapSample {

    public static void main(String... args) {
    //Map型
    // java7以降は右辺のジェネリクス指定は省略できる
    // 左辺がHashMap型ではなくMap型なのはMapインタフェースを利用して汎化しているため
    Map<String,Integer> map = new HashMap<>();

    map.put("zero",0);
    map.put("one",1);
    map.put("two",2);

    // Mapgの拡張forループ Map.Entry というInterfaceを利用して実現
    for (Map.Entry<String,Integer> e :map.entrySet()) {
        System.out.println(e.getKey() + ":" + e.getValue());
    }
    
    // HashMapのかわりにLinkedHashMapを利用する（挿入に強い）
    map = new LinkedHashMap<>();
    
    map.put("zero",0);
    map.put("one",1);
    map.put("two",2);

    // Mapgの拡張forループ Map.Entry というInterfaceを利用して実現
    for (Map.Entry<String,Integer> e :map.entrySet()) {
        System.out.println(e.getKey() + ":" + e.getValue());
    }

    // HashMapのかわりにTreeMapを利用する（Keyで順序がソートされている）
    map = new TreeMap<>();

    map.put("zero",0);
    map.put("one",1);
    map.put("two",2);

    // Mapgの拡張forループ Map.Entry というInterfaceを利用して実現
    for (Map.Entry<String,Integer> e :map.entrySet()) {
        System.out.println(e.getKey() + ":" + e.getValue());
    }
    
    }
    
}
