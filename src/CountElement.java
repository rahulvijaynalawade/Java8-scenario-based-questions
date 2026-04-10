import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountElement {
    public static void main(String[] args) {
        //Count total elements in a list using streams.
        List<Integer> list = Arrays.asList(1, 6, 7, 8, 2, 4, 9, 4, 0, 7);
        long result= list
                .stream()
                .count();
        System.out.println(result);
    }
}
