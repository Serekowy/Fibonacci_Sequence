import java.util.ArrayList;
import java.util.List;

public class FibbonaciSequence {
    public static void main(String[] args) {
        List<Integer> fibonacciNumbs = new ArrayList<>();

        fibonacciNumbs.add(0);
        fibonacciNumbs.add(1);
        fibonacciNumbs.add(1);

        sequence(fibonacciNumbs, 15);
    }

    public static int[] sequence(List<Integer> firstNumbers, int size) {
        int[] fibonacci = new int[size];

        for (int i = 2; i < size; i++) {
            
        }

        return fibonacci;
    }
}