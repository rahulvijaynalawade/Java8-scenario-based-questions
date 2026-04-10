import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ToUppercase {
    public static void main(String[] str){
        //Convert a list of strings to uppercase using streams.
        List<Character> list = Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g',
                'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
                'u', 'v', 'w', 'x', 'y', 'z');


        List<Character> result = list.stream()
                .map(x -> (char)(x - 32))
                .collect(Collectors.toList());//Collectors collect
        System.out.println(result);
    }
}
