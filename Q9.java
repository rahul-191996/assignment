import java.util.ArrayList;
import java.util.Collections;

public class Q9 {
    public static void main(String[] args) {
        ArrayList<String> color=new ArrayList<>();
        color.add("green");
        color.add("red");
        color.add("blue");
        ArrayList<String> color1=new ArrayList<>();
        color1.add("A");
        color1.add("b");
        color1.add("C");
        Collections.copy(color1,color);
        System.out.println("after copying"+color1);

    }
}
