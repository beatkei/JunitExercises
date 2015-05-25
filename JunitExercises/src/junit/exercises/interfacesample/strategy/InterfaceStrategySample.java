package junit.exercises.interfacesample.strategy;

import java.util.*;
import java.io.*;

// Strategyパターン
// コンストラクタでオブジェクトをわたすことにより、if分をなくしクラスの安定性を高める
public class InterfaceStrategySample {

    // Strategyパターン（if文が消えてクラスが安定している）
    private final MyFilter filter;

    public InterfaceStrategySample(MyFilter filter) {
        this.filter = filter;
    }

    public String execStrategy(String input) {
        return filter.doJob(input);
    }
}

