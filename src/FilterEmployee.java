import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEmployee {
    public static void main(String[] arg){
        List<Integer> list = Arrays.asList(30000, 80000, 100, 700000);
        List<Integer> result = list.
                stream()
                .filter(salary -> salary > 50000).collect(Collectors.toList());
        System.out.println(result);
    }
}
