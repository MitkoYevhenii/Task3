package ua.goit;

public class SumCalculator {

    // This method sums the elements from 1 to n
    public int sum(int n) {
        if(n < 0) {
            throw new IllegalArgumentException("Input should be a non-negative integer");
        }

        return n * (n + 1) / 2;
    }
}
