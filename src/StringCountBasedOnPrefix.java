import java.util.List;

public class StringCountBasedOnPrefix {

    public static long stringCountBasedOnPrefix(String prefix, List<String> words) {
        return words
                .stream()
                .filter(word -> word.startsWith(prefix))
                .count();
    }
}
