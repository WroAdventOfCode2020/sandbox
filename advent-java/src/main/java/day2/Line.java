package day2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Line {
    public final int min;
    public final int max;
    public final Character criteriaChar;
    public final String password;

    public Line(String stringLine) {
        Matcher m = Pattern.compile("(\\d+)(-)(\\d+)( )(\\w)(: )(.+)").matcher(stringLine);
        if (!m.find( )) {
            throw new IllegalStateException("cannot match regexp");
        }
        this.min = Integer.valueOf(m.group(1));
        this.max = Integer.valueOf(m.group(3));
        this.criteriaChar = m.group(5).charAt(0);
        this.password = m.group(7);

    }
}
