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
    
}
