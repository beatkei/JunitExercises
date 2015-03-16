package junit.exercises;

import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

// Ecclosed を指定して状態別の構造化テスト（staticなサブクラスで定義）を実施する
@RunWith(Enclosed.class)
public class CounterTest {
    
    // 初期状態をサブクラスとして定義
    public static class 初期状態の場合 {
        Counter sut;
        // setUpのメソッドは初期状態からのテストが複数あっても１回だけかけばすむ
        @Before
        public void setUp() {
            sut = new Counter();
        }
        // setUpが呼ばれる
        @Test
        public void incrementで１が取得できる() {
            assertThat(sut.increment(), is(1));
        }
        // setUpがここで再利用される
        @Test
        public void incrementで２回目も1が取得できる() {
            assertThat(sut.increment(), is(1));
        }
    }
    
    // incrementが１回実行された状態をサブクラスとして定義
    public static class incrementが１回実行された場合 {
        Counter sut;
        // setUpのメソッドはincrementが１回実行された状態のテストが複数あっても１回だけかけばすむ
        @Before
        public void setUp() {
            sut = new Counter();
            sut.increment();
        }
        // setUpが呼ばれる
        @Test
        public void incrementで2が取得できる() {
            assertThat(sut.increment(), is(2));
        }
        // setUpがここで再利用される
        @Test
        public void incrementで２回目も2が取得できる() {
            assertThat(sut.increment(), is(2));
        }
    }

    // incrementが50回実行された状態をサブクラスとして定義
    public static class incrementが50回実行された場合 {
        Counter sut;
        // setUpのメソッドはincrementが50回実行された状態のテストが複数あっても１回だけかけばすむ
        @Before
        public void setUp() {
            sut = new Counter();
            for (int i = 0; i < 50; i++) sut.increment();
        }
        // setUpが呼ばれる
        @Test
        public void incrementで51が取得できる() {
            assertThat(sut.increment(), is(51));
        }
        // setUpがここで再利用される
        @Test
        public void incrementで２回目も51が取得できる() {
            assertThat(sut.increment(), is(51));
        }
    }
    
}
