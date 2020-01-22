import java.util.ArrayList;

public class Q7 {
    public static void main(String[] args) {
        ArrayList<String> color=new ArrayList<>();
        color.add("green");
        color.add("red");
        color.add("blue");
        if(color.contains("green")) {
            System.out.println("element found");
        }
        else{
            System.out.println("not found");
        }
    }
}
