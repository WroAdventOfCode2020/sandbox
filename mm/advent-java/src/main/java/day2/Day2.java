package day2;

import util.Utils;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Day2 {

    public static void main(String[] args) throws IOException, URISyntaxException {
        List<String> strings = Utils.readFile("day2.txt");

        long calculate = Day2.calculate(strings);

        System.out.println(calculate);

    }

    public static long calculate(List<String> lines){
        return lines.stream().filter(Day2::matcher).count();
    }

    private static boolean matcher(String a) {
        Matcher m = Pattern.compile("(\\d+)(-)(\\d+)( )(\\w)(: )(.+)").matcher(a);
        if (!m.find( )) {
            throw new IllegalStateException("cannot match regexp");
        }
        Integer min = Integer.valueOf(m.group(1));
        Integer max = Integer.valueOf(m.group(3));
        Character criteriaChar = m.group(5).charAt(0);
        String password = m.group(7);


        long count = password.chars()
                .mapToObj(e -> (char) e)
                .filter(e -> e.equals(criteriaChar)).count();



        return min <= count && count <= max;
    }

}
