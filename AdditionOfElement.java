import java.util.ArrayList;

public class AdditionOfElement {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        int x = numbers.get(0)+numbers.get(1)+numbers.get(2);
        System.out.println("Before addition: " + numbers);

       numbers.add(x);
       System.out.println("After addition: " + numbers);
    }
}