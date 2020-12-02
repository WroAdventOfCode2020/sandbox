package day2;

import util.Utils;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Day2 {

    public static void main(String[] args) throws IOException, URISyntaxException {
        List<String> strings = Utils.readFile("day2.txt");

        long calculate1 = Day2.calculate(strings);

        System.out.println(calculate1);

        long calculate2 = Day2.calculate2(strings);

        System.out.println(calculate2);

    }

    public static long calculate(List<String> lines){
        return lines.stream().filter(Day2::matcher).count();
    }

    public static long calculate2(List<String> lines){
        return lines.stream().filter(Day2::matcher2).count();
    }

    private static boolean matcher(String a) {
        Line line = new Line(a);
        long count = line.password.chars()
                .mapToObj(e -> (char) e)
                .filter(e -> e.equals(line.criteriaChar)).count();

        return line.min <= count && count <= line.max;
    }

    private static boolean matcher2(String a) {
        Line line = new Line(a);

        return Stream.of(line.password.charAt(line.min-1) == line.criteriaChar,
                line.password.length() > (line.max-1) && line.password.charAt(line.max-1) == line.criteriaChar)
                .filter(i->i)
                .count()==1;



    }


}
