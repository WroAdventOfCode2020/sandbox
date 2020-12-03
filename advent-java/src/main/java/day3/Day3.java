package day3;

import util.Utils;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.List;

import static day3.Direction.*;

public class Day3 {

    public static void main(String[] args) throws IOException, URISyntaxException {
        List<String> input = Utils.readFile("day3.txt");

        long result = calculate(input, new Direction(3, 1));

        System.out.println(result);

        long result2 = calculate2(input);

        System.out.println(result2);
    }

    public static long calculate(List<String> input, Direction direction) {

        int positionY = 0;
        int positionX = 0;
        long numberOfTrees = 0;

        while(positionY< input.size()){
            String line=input.get(positionY);
            String newLine = adjustLine(positionX, line);

            numberOfTrees =(newLine.charAt(positionX)=='#') ? numberOfTrees+1 : numberOfTrees;

            positionX+=direction.right;
            positionY+=direction.down;
        }
        return numberOfTrees;
    }

    public static long calculate2(List<String> input) {
        List<Direction> directions = Arrays.asList(of(1, 1),
                of(3, 1),
                of(5, 1),
                of(7, 1),
                of(1, 2));

       return directions.stream()
                .map(direction -> calculate(input, direction))
                .reduce(1L, (a,b)->a*b);
    }

    private static String adjustLine(int positionX, String line) {
        String newLine = line;
        while(newLine.length() <= positionX) {
            newLine = newLine + line;
        }
        return newLine;
    }
}
