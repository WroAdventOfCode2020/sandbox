package day;

import util.InputReader;

import java.util.List;
import java.util.stream.Collectors;

public class D01 {

    public static void main(String[] args) {
        InputReader inputReader = new InputReader();

        List<Integer> input = inputReader.read("input01").stream()
                .mapToInt(Integer::valueOf)
                .boxed()
                .collect(Collectors.toList());

        int partA = solveA(input);
        System.out.println(partA);

        int partB = solveB(input);
        System.out.println(partB);

    }

    private static int solveA(List<Integer> input) {
        for (int i : input) {
            int wanted = 2020 - i;
            if (input.contains(wanted)) {
                return wanted * i;
            }
        }
        return 0;
    }

    private static int solveB(List<Integer> input) {
        for (int i : input) {
            for (int j : input) {
                int wanted = 2020 - i - j;
                if (input.contains(wanted)) {
                    return wanted * i * j;
                }
            }
        }
        return 0;
    }
}
