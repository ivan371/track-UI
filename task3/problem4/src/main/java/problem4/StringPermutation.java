package problem4;

import java.util.List;
import java.util.stream.Collectors;

public class StringPermutation {
    public static List<Character> stringToCharList(String string) {
        return string.chars().mapToObj(c -> (char) c).sorted().collect(Collectors.toList());
    }
}
