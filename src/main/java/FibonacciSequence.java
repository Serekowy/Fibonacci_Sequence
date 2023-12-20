import java.util.ArrayList;
import java.util.List;

public abstract class FibonacciSequence {

    public static void main(String[] args) {
        List<Integer> fibonacciNumbs = new ArrayList<>();

        for (int i = 0 ; i < 3; i++) {
            fibonacciNumbs.add(Integer.valueOf(args[i]));
        }

        int size = Integer.parseInt(args[3]);

        sequence(fibonacciNumbs, size);

        for (int oneNumber : fibonacciNumbs) {
            System.out.print(oneNumber + " ");
        }
    }

    public static void sequence(List<Integer> fibonacci, int size) {
        int result = 0;

        for (int i = 3; i < size; i++) {
            result = fibonacci.get(i-2) + fibonacci.get(i-1);
            fibonacci.add(result);
        }
    }
}

