import Lada303.Lesson1.Fibonacci;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Fibonacci().fibRecursive(20));
        System.out.println(new Fibonacci().fibRecursive(30));
        System.out.println(new Fibonacci().fibRecursive(40));
        System.out.println(new Fibonacci().fibMemorized(30));
        System.out.println(new Fibonacci().fibMemorized(50));
        System.out.println(new Fibonacci().fibMemorized(70));
        System.out.println(new Fibonacci().fibUnmemorized(40));
        System.out.println(new Fibonacci().fibUnmemorized(50));
        System.out.println(new Fibonacci().fibUnmemorized(70));
    }
}
