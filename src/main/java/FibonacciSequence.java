import java.util.ArrayList;
import java.util.List;

public class FibonacciSequence {
    public static void main(String[] args) {
        List<Integer> firsFibonacciNumbs = new ArrayList<>();
        int[] fibonacciNumbs;

        firsFibonacciNumbs.add(0);
        firsFibonacciNumbs.add(1);
        firsFibonacciNumbs.add(1);

        fibonacciNumbs = sequence(firsFibonacciNumbs, 15);

        for (int oneNumber : fibonacciNumbs) {
            System.out.print(oneNumber + " ");
        }
    }

    public static int[] sequence(List<Integer> firstNumbers, int size) {
        int[] fibonacci = new int[size];
        int lastSum = 1;
        int lastSum1 = 1;
        int finalSum;

        for (int i = 0; i < size; i++) {
            if (i <= 2) {
                fibonacci[i] = firstNumbers.get(i);
            }
            else {
                finalSum = lastSum + lastSum1;
                fibonacci[i] = finalSum;
                lastSum1 = lastSum;
                lastSum = finalSum;
            }
        }
        return fibonacci;
    }
}