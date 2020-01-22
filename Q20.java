import java.util.ArrayList;

public class Q20 {
    public static void main(String[] args) {
        ArrayList<String> color = new ArrayList<>();
        color.add("green");
        color.add("red");
        color.add("blue");
        color.ensureCapacity(5);
        color.add("pink");
        color.add("white");
        System.out.println(color);
    }
}
