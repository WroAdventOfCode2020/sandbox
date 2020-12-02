package day1;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

import static java.util.stream.Collectors.toList;
import static util.Utils.readFile;

public class Day1 {

    public  static void main(String[] args) throws URISyntaxException, IOException {
        List<Integer> collect = readFile("day1.txt").stream().map(Integer::valueOf).collect(toList());

        Integer result = calculate(collect);

        System.out.println(result);
    }


    public static int calculate(List<Integer> list){
        int criteria = 2020;

        for(Integer i : list) {
            for(Integer j : list) {
                if(i +j== criteria) {
                    return i *j;
                }
            }
        }
        throw new IllegalArgumentException("wrong args");
    }



}
