import java.util.ArrayList;
import java.util.Collections;

public class Q13 {
    public static void main(String[] args) {
        ArrayList<String> color=new ArrayList<>();
        color.add("green");
        color.add("red");
        color.add("blue");
        ArrayList<String> col=new ArrayList<>();
        col.add("A");
        col.add("B");
        col.add("C");
        col.add("green");
        ArrayList<String> c=new ArrayList<>();
        for(String a:color){
            c.add(col.contains(a)?"Yes":"No");
        }
        System.out.println(c);
    }
}
