import java.util.Comparator;
import java.util.List;

public class SortList {

    public static List<Integer> sortList(List<Integer> ints) {
//        Ascending Order
        return ints.stream()
                .sorted()
                .toList();

//        Descending Order
//        return ints.stream()
//                .sorted(Comparator.reverseOrder())
//                .toList();

    }
}
