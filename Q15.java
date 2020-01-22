import java.util.ArrayList;
import java.util.Collections;

public class Q15 {
    public static void main(String[] args) {
        ArrayList<String> col=new ArrayList<>();
        col.add("A");
        col.add("B");
        col.add("C");
        col.add("green");
        ArrayList<String> color = new ArrayList<>();
        color.add("green");
        color.add("red");
        color.add("blue");
        for(String a:col){
            color.add(a);
        }
        System.out.println(color);
        color.addAll(col);
        System.out.println(color);
    }
}
