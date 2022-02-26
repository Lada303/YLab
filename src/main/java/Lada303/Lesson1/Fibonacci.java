package Lada303.Lesson1;

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
        }
        return fib[n];
    }

    public long fibUnmemorized(int n) {
        if (n <= 1) {
            return n;
        }
        long n_2 = 0;
        long n_1 = 1;
        long fib = 0;
        for (int i = 2; i <= n; i++) {
            fib = n_1 + n_2;
            n_2 = n_1;
            n_1 = fib;
        }
        return fib;
    }

}
