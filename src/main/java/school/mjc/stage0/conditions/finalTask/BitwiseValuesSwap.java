package school.mjc.stage0.conditions.finalTask;

public class BitwiseValuesSwap {
    public void swap(int first, int second) {
        // https://en.wikipedia.org/wiki/XOR_swap_algorithm
        first = second ^ first;
        second = first ^ second;
        first = second ^ first;
        System.out.println(first);
        System.out.println(second);

    }
}
