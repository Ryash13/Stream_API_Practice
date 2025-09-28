import java.util.List;

public class FilterEvenNumbers {

    public static List<Integer> filterEvenNumberFromList(List<Integer> ints) {
        return ints.stream()
                .filter(num -> num % 2 == 0)
                .toList();
    }
}
