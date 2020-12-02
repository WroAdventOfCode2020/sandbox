package day1;


import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Day1Test {

    @Test
    public void test(){
        List<Integer> input = Arrays.asList(1721,
                979,
                366,
                299,
                675,
                1456);
        int result = new Day1().calculate(input);

        assertEquals(result, 514579);
    }

}
