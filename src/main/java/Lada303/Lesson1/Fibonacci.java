package Lada303.Lesson1;

import java.math.BigInteger;

public class Fibonacci {

    public long fibRecursive(int n) {
        if (n <= 1) {
            return n;
        }
        return fibRecursive(n - 1) + fibRecursive(n - 2);
    }

    public long fibMemorized(int n) {
        if (n <= 1) {
            return n;
        }
        long[] fib = new long[n + 1];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i <= n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
            if (fib[i] < 0) {
                System.out.println("Переполнение long");
                return -1;
            }
        }
        return fib[n];
    }

    public BigInteger fibUnmemorized(int n) {
        if (n <= 1) {
            return BigInteger.valueOf(n);
        }
        BigInteger n_2 = BigInteger.ZERO;
        BigInteger n_1 = BigInteger.ONE;
        BigInteger fib = BigInteger.ZERO;
        for (int i = 2; i <= n; i++) {
            fib = n_1.add(n_2);
            n_2 = n_1;
            n_1 = fib;
        }
        return fib;
    }

}
