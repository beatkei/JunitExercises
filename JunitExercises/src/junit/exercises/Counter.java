package junit.exercises;

public class Counter {
    
    int count = 0;
    
    // 副作用（呼びたびに結果が違う）を持つプロダクトコード
    public int increment() {
        return ++count;
    }
    
}
