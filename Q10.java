import java.util.ArrayList;
import java.util.Collections;

public class Q10 {
    public static void main(String[] args) {
        ArrayList<String> color=new ArrayList<>();
        color.add("green");
        color.add("red");
        color.add("blue");
        Collections.shuffle(color);
        System.out.println(color);
    }
}
