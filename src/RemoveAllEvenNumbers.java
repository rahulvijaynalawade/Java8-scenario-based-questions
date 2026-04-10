import java.util.*;
import java.util.stream.Collectors;

public class RemoveAllEvenNumbers {
    public static void main(String[] str){
        List<Integer> list = Arrays.asList(10, 15, 20, 25, 30, 35, 40);
        List<Integer> result = list.stream()
                .filter(x -> x % 2 != 0)
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
