import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StartingWithA {
    public static void main(String[] args) {
// Find all names starting with "A" from a list.
        List<String> list = Arrays.asList("rahul", "akasha", "Aarambh", "surah", "ajay");
        List<String> result = list.stream()
                .filter(x -> x.charAt(0) == 'a')
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
