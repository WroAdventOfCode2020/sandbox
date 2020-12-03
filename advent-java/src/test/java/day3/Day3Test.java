package day3;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Day3Test {
    private static List<String> input;

    @BeforeAll
    public static void setup() {
        input = Arrays.asList(
                "..##.......",
                "#...#...#..",
                ".#....#..#.",
                "..#.#...#.#",
                ".#...##..#.",
                "..#.##.....",
                ".#.#.#....#",
                ".#........#",
                "#.##...#...",
                "#...##....#",
                ".#..#...#.#");

    }
    @Test
        public void test(){

            long calculate = Day3.calculate(input, new Direction(3, 1));

            assertEquals(calculate, 7);
        }

    @Test
    public void test2(){

        long calculate = Day3.calculate2(input);

        assertEquals(calculate, 336);
    }

}