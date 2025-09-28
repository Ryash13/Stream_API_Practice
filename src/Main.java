import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {


//        ============ Filter Even number from a list =======================
//        List<Integer> integers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
//        List<Integer> evenList = FilterEvenNumbers.filterEvenNumberFromList(integers);
//        System.out.println(evenList);


//        ============= Find Maximum Number in a list ======================
//        List<Integer> integers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
//        Integer maxNo = MaxNoInList.maxNumFromList(integers);
//        System.out.println(maxNo);

//        =========== Sort a list ======================
//        List<Integer> integers = Arrays.asList(43,12,445,2,1,23,44,66);
//        List<Integer> sortedList = SortList.sortList(integers);
//        System.out.println(sortedList);

//        ============ Count String with specific Prefix
        String prefix = "API";
        List<String> words = Arrays.asList("API_POST", "API_GET", "API", "BPI");
        long count = StringCountBasedOnPrefix.stringCountBasedOnPrefix(prefix, words);
        System.out.println(count);
    }
}