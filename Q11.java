import java.util.ArrayList;
import java.util.Collections;

public class Q11 {
    public static void main(String[] args) {
        ArrayList<String> color = new ArrayList<>();
        color.add("green");
        color.add("red");
        color.add("blue");
        Collections.reverse(color);
        System.out.println(color);
    }
}

