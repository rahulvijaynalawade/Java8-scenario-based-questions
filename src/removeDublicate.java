import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class removeDublicate {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 3, 4, 4,3 ,2, 4, 4,4,6, 6,6, 9, 8);
        List<Integer> result = list
                .stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
