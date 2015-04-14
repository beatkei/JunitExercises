package junit.exercises;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtils {
    
    public static String toSnakeCase(String text) {
        String snake = text;
        // javaで正規表現を使う場合はPatternクラスとMatcherクラスを使う
        Pattern p = Pattern.compile("([A-Z])");
        // for(;;)は無限ループ
        for(;;) {
            Matcher m = p.matcher(snake);
            if (!m.find()) break;
            // MatcherクラスのreplaceFirst
            snake = m.replaceFirst("_" + m.group(1).toLowerCase());
        }
        // こっちはStringクラスのreplaceFirstで１個目に正規表現を指定
        return snake.replaceFirst("^_", "");
    }

    public static boolean compareStringBuilder(String text) {
        String stringText = text;
        StringBuilder stringBuilderText1 = new StringBuilder(text);
        StringBuilder stringBuilderText2 = new StringBuilder(text);
        // StringとStringBuilderの比較はStringクラスのcontentEqualsを使う
        Boolean result1 = stringText.contentEquals(stringBuilderText1);
        // StringBuilder同士の比較はStringオブジェクトに変換してからontentEqualsを使う
        Boolean result2 = stringBuilderText1.toString().contentEquals(stringBuilderText2);
        if (result1 != true | result2 != true) return false;
        return true;
    }
    
    public static String comvertIntegerToString(int i) {
        // その１　String.valueOf()を使ってStringに変換する
        String convertText1 = String.valueOf(i);
        // その２　Integer.toString()を使ってStringに変換する
        String convertText2 = Integer.toString(i);
        return convertText1;
    }
    
}
