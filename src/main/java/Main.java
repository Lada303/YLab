import Lada303.Lesson1.Fibonacci;

public class Main {
    public static void main(String[] args) {

        Fibonacci fib = new Fibonacci();
        for (int i = 0; i <= 40; i++) {
            long startTime = System.currentTimeMillis();
            System.out.print(i + " " + fib.fibRecursive(i));
            long finishTime = System.currentTimeMillis();
            System.out.println(" " + (finishTime - startTime) + " ms");
        }
        System.out.println();
        for (int i = 20; i <= 95; i++) {
            long startTime = System.currentTimeMillis();
            System.out.print(i + " " + fib.fibMemorized(i));
            long finishTime = System.currentTimeMillis();
            System.out.println(" " + (finishTime - startTime) + " ms");
        }
        System.out.println();
        for (int i = 80; i <= 150; i++) {
            long startTime = System.currentTimeMillis();
            System.out.print(i + " " + fib.fibUnmemorized(i));
            long finishTime = System.currentTimeMillis();
            System.out.println(" " + (finishTime - startTime) + " ms");
        }
    }
}
