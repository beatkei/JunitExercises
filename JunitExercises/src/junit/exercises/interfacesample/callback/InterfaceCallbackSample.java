package junit.exercises.interfacesample.callback;

import java.util.*;
import java.io.*;

// メソッドを単純に呼ぶのではなくインターフェイスで隠蔽したオブジェクトを渡して
// 呼び出す（コールバック）することにより依存関係を逆転し（変化の少ない方に依存し）保守性を上げる
public class InterfaceCallbackSample {

    // インターフェース宣言
    public interface MyFilter {
        String doJob(String input);
    }

    // インターフェースを継承したReplaceFilterを作成
    public class ReplaceFilter implements MyFilter {
        private final String oldStr;
        private final String newStr;

        public ReplaceFilter(String oldStr, String newStr) {
            this.oldStr = oldStr;
            this.newStr = newStr;
        }

        @Override
        public String doJob(String input) {
            return input.replaceAll(oldStr, newStr);
        }
    }

    // インターフェースを継承したCapitalizeFilterを作成    
    public class CapitalizeFilter implements MyFilter {
       @Override
        public String doJob(String input) {
            return input.toUpperCase();
        }
    }

    // 渡されたインターフェースを利用して呼び出す（コールバック）
    public class MyEcho2 {
        private final List<MyFilter> filters;

        public MyEcho2(List<MyFilter> filters) {
            this.filters = filters;
        }

        public void exec() {
            try (BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in))) {
                while (true) {
                    System.out.println("Input any text");
                    String msg = stdin.readLine();

                    String output = msg;
                    for (MyFilter filter : filters) {
                        output = filter.doJob(output);
                    }
                    System.out.println("You said, " + output);
                }  
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    // MyEcho2クラスを呼び出すコード
//    public class Main {
        public void main(String... args) {
            // MyFilterインターフェイスを継承したフィルターの配列を渡すことによって
            // MyEcho2は具象クラスには依存せすインターフェイスのみに依存する（コールバックパターン）
            MyEcho2 echo = new MyEcho2(Arrays.asList(new ReplaceFilter("he", "she"), new CapitalizeFilter()));
            echo.exec();
        }
//    }
}

