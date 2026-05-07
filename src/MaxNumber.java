import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class MaxNumber {
    public static void main(String[] args) {
        //Find the maximum number in a list using streams.
        List<Integer> list = Arrays.asList(1, 6, 7, 8, 2, 4, 9, 4, 10, 7);
//        List<Integer> result = list.stream()
//                 .max(Integer:: compare)
//                 .stream().collect(Collectors.toList());
        int max = list.stream()
                        .max(Integer::compare)
                        .get();
                System.out.println(max);
    }
}
