package junit.exercises.interfacesample.strategy;

import java.util.*;
import java.io.*;

// Strategyパターン
// コンストラクタでオブジェクトをわたすことにより、if分をなくしクラスの安定性を高める
public class InterfaceNoStrategySample {

    // Strategyパターンじゃないケース（if文が登場してクラスが安定していない）
    enum Type{TYPE1,TYPE2,};
    private final Type type;

    public InterfaceNoStrategySample(Type type) {
        this.type = type;
    }

    public String execNoStrategy(String input) {
        if (type == Type.TYPE1) {
            ReplaceFilter replaceFilter =new ReplaceFilter("aaa","bbb");
            return replaceFilter.doJob(input);
        }
        if (type == Type.TYPE2) {
            CapitalizeFilter capitalizeFilter = new CapitalizeFilter();
            return capitalizeFilter.doJob(input);
        }    
    return "NotYype"; 
    }
}

