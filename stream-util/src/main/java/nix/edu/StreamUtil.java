package nix.edu;

import java.util.List;
import java.util.stream.Collectors;

public class StreamUtil {

    public static void collectFilteredDigitsIntoString(List<String> list) {
        String stringOfNumbers = list.stream()
                .map(s -> s.replaceAll("\\D+", ""))
                .collect(Collectors.joining());

        System.out.println("Filtered digits in string: " + stringOfNumbers);

    }

    public static void collectFilteredDigitsIntoInteger(List<String> list) {
        String collectedStrings = "";
        List<String> listOfStrings = list.stream()
                .map(s -> s.replaceAll("\\D+", ""))
                .collect(Collectors.toList());

        for (String s : listOfStrings) {
            collectedStrings += s;
        }
        Integer valueOfString = Integer.valueOf(collectedStrings);
        System.out.println("Filtered digits in Integer value: " + valueOfString);

    }
}
