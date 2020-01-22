import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q16 {
    public static void main(String[] args) {
        List<String> name = Arrays.asList("rahul","dev","abc");
        List<String> clone=new ArrayList<String>(name);
        System.out.println(clone);

    }
}
