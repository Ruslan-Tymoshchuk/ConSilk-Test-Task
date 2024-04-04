package pl.com.consilk;

import static java.lang.System.lineSeparator;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Stream.generate;

public class Formatter {

    public static final String STAR_MARK = "*";

    public String format(int limit) {
        StringBuilder result = new StringBuilder();
        if (limit <= 20) {
            for (int i = 1, j = 3; j <= limit; i++, j++) {
                result.append(repeatChar(i));
                result.append(lineSeparator());
                result.append(repeatChar(j));
                result.append(lineSeparator());
            }
        }
        return result.toString();
    }

    private String repeatChar(int times) {
        return generate(() -> STAR_MARK).limit(times).collect(joining());
    }
}