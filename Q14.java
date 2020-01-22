import java.util.ArrayList;
import java.util.Collections;

public class Q14 {
    public static void main(String[] args) {
        ArrayList<String> col=new ArrayList<>();
        col.add("A");
        col.add("B");
        col.add("C");
        col.add("green");
        Collections.swap(col,0,2);
        System.out.println(col);
    }
}
