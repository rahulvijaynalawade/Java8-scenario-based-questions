import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntToChar {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(30000, 80000, 100, 700000);
        List<String> result = list
                .stream()
                .map(String::valueOf)
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
