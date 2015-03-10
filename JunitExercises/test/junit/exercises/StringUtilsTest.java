package junit.exercises;

import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;
import static org.junit.Assert.*;

public class StringUtilsTest {
    
    public StringUtilsTest() {
    }

    @Test
    public void testToSnakeCaseはスネークケースを返す_aaaの場合() {
        assertThat(StringUtils.toSnakeCase("aaa"), is("aaa"));
    }

    @Test
    public void testToSnakeCaseはスネークケースを返す_HelloWorldの場合() {
        assertThat(StringUtils.toSnakeCase("HelloWorld"), is("hello_world"));
    }

    @Test
    public void testToSnakeCaseはスネークケースを返す_practiceJunitの場合() {
        assertThat(StringUtils.toSnakeCase("practiceJunit"), is("practice_junit"));
    }
    
}
