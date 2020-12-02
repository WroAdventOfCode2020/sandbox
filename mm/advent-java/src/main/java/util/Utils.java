package util;

import day1.Day1;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.List;

public class Utils {
    public static List<String> readFile(String fileName) throws URISyntaxException, IOException {
        URI uri = Day1.class.getClassLoader().getResource(fileName).toURI();
        return Files.readAllLines(new File(uri).toPath(), Charset.defaultCharset());
    }
}
