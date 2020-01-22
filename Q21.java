import java.util.ArrayList;

public class Q21 {
    public static void main(String[] args) {
        ArrayList<String> color = new ArrayList<>();
        color.add("green");
        color.add("red");
        color.add("blue");
        color.set(1,"pink");
        System.out.println(color);
    }
}
