package junit.exercises;

public class Calculator {
    
    public int divide(int x, int y) {
        // 例外を検出するためのサンプル
        if (y == 0) throw  new IllegalArgumentException("y is zero");
        return x / y; 
    }
}
