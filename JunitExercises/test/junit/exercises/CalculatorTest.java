package junit.exercises;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    
    // 例外のテストコードはアノテーションで指定する
    @Test(expected = IllegalArgumentException.class)
    public void divideの第二引数に0を指定すると例外が発生する() throws Exception {
        Calculator sut = new Calculator();
        sut.divide(1, 0);
    }
    
}
