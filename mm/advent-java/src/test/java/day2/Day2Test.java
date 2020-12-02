package day2;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Day2Test {
    private static List<String> input = Arrays.asList(
            "1-3 a: abcde",
            "1-3 b: cdefg",
            "2-9 c: ccccccccc");

    @Test
    public void test(){

        long result = Day2.calculate(input);

        assertEquals(result, 2);
    }

@Test
    public void testRegexp(  ) {

        Matcher m = Pattern.compile("(\\d+)(-)(\\d+)( )(\\w)(: )(.+)").matcher(input.get(0));
        if (m.find( )) {
            for (int i = 0; i < m.groupCount()+1;  i++){
                System.out.println(i+"\t" + m.group(i));
            }
        }else {
            System.out.println("NO MATCH");
        }
    }
}