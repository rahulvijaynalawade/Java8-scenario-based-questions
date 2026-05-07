import java.util.Arrays;
import java.util.List;

public class ForEach {
    public static void main(String[] arg){
        List<String> list = Arrays.asList("Java", "Python", "C++", "React");
        list.forEach(x -> System.out.println(x));
    }
}
