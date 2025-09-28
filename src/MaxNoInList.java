import java.util.List;

public class MaxNoInList {

    public static Integer maxNumFromList(List<Integer> ints) {
        return ints.stream()
                .mapToInt(Integer::intValue)
                .max()
                .orElseThrow();
    }
}
