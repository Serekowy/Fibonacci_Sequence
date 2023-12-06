import java.util.ArrayList;
import java.util.List;

public abstract class FibonacciSequence {

    public static void main(String[] args) {
        List<Integer> fibonacciNumbs = new ArrayList<>();

        fibonacciNumbs.add(Integer.valueOf(args[0]));
        fibonacciNumbs.add(Integer.valueOf(args[1]));
        fibonacciNumbs.add(Integer.valueOf(args[2]));
        int size = Integer.parseInt(args[3]);

        sequence(fibonacciNumbs, size);

        for (int oneNumber : fibonacciNumbs) {
            System.out.print(oneNumber + " ");
        }
    }

    public static void sequence(List<Integer> fibonacci, int size) {
        int lastSum = 1;
        int lastSum1 = 1;
        int finalSum;

        for (int i = 3; i < size; i++) {
            finalSum = lastSum + lastSum1;
            fibonacci.add(finalSum);
            lastSum1 = lastSum;
            lastSum = finalSum;
        }
    }
}

