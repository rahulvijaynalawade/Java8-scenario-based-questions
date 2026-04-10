import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortList {
    public static void main(String[] arg){
        //Sort a list of integers using lambda expressions.
        List<Integer> list = Arrays.asList(1, 6, 7, 8, 2, 4, 9, 4, 0, 7);
        List<Integer> result = list.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(result);
    }

}
