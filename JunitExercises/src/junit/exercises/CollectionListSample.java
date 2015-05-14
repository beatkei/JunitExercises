package junit.exercises;
import java.util.*;

public class CollectionListSample {

    public static void main(String... args) {
    //List型
    // java7以降は右辺のジェネリクス指定は省略できる
    // 左辺がArrayList型ではなくList型なのはListインタフェースを利用して汎化しているため
    List<String> list = new ArrayList<>();

    list.add("one");
    list.add("two");
    list.add("three");
    
    for (String s:list) {
        System.out.println(s);
    }

    // ArrayListの代わりにLinkedList（挿入につよい）を利用 
    list = new LinkedList<>();

    list.add("one");
    list.add("two");
    list.add("three");
    
    for (String s:list) {
        System.out.println(s);
    }
    
    }
    
}
