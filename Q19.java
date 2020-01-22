import java.util.ArrayList;

public class Q19 {
    public static void main(String[] args) {
        ArrayList<String> color = new ArrayList<>();
        color.add("green");
        color.add("red");
        color.add("blue");
        color.trimToSize();
        System.out.println(color);
    }
}
