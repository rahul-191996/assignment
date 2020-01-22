import java.util.ArrayList;

public class Q22 {
    public static void main(String[] args) {
        ArrayList<String> color = new ArrayList<>();
        color.add("green");
        color.add("red");
        color.add("blue");
        int elements = color.size();
        for (int index = 0; index < elements; index++)
            System.out.println(color.get(index));

    }
}
