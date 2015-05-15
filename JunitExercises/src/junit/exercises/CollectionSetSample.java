package junit.exercises;
import java.util.*;

public class CollectionSetSample {

    public static void main(String... args) {
    //Map型
    // java7以降は右辺のジェネリクス指定は省略できる
    // 左辺がSetMap型ではなくSet型なのはMapインタフェースを利用して汎化しているため
    Set<String> set = new HashSet<>();

    set.add("zero");
    set.add("one");
    set.add("two");

    // Setの拡張forループ
    for (String s :set) {
        System.out.println(s);
    }
    
    // Iteratorをつかったforループ(拡張forループのほうが便利)
    for (Iterator it = set.iterator(); it.hasNext();) {
        System.out.println(it.next());        
    }      
        
    // HashSetのかわりにLinkedHashSetを利用する（挿入に強い）
    set = new LinkedHashSet<>();
    
    set.add("zero");
    set.add("one");
    set.add("two");

    // Setの拡張forループ
    for (String s :set) {
        System.out.println(s);
    }

    // HashSetのかわりにTreeSetを利用する（ソートされている）
    set = new TreeSet<>();

    set.add("zero");
    set.add("one");
    set.add("two");

    // Setの拡張forループ
    for (String s :set) {
        System.out.println(s);
    }
    
    }
    
}
