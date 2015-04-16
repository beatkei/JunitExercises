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
    
    @Test
    public void testCompareStringBuilderはtrueを返す_25の場合() {
        assertThat(StringUtils.compareStringBuilder("25"), is(true));
    }
    
    @Test
    public void testConvertIntegerToStringはString型を返す_25の場合() {
        assertThat(StringUtils.comvertIntegerToString(25), is("25"));
    }

    @Test
    public void testConvertStringToIntegerはint型を返す_25の場合() {
        assertThat(StringUtils.comvertStringToInteger("25"), is(25));
    }
}
