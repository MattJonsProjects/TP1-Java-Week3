import java.util.ArrayList;

public class Question4_ArrayVsArrayList {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        System.out.println("Before remove: " + fruits);

        fruits.remove("Banana");

        System.out.println("After remove: " + fruits);
    }
}
