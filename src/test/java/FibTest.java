import Lada303.Lesson1.Fibonacci;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.math.BigInteger;

public class FibTest {

    @CsvSource({
            "0, 0",
            "1, 1",
            "2, 1",
            "5, 5",
            "10, 55",
            "20, 6765",
            "30, 832040",
     })
    @ParameterizedTest
    public void testFibRecursive(int n, long result) {
        Assertions.assertEquals(result, new Fibonacci().fibRecursive(n));
    }

    @CsvSource({
            "0, 0",
            "1, 1",
            "2, 1",
            "6, 8",
            "20, 6765",
            "50, 12586269025",
            "70, 190392490709135",
            "100, -1"
    })
    @ParameterizedTest
    public void testFibMemorized(int n, long result) {
        Assertions.assertEquals(result, new Fibonacci().fibMemorized(n));
    }

    @CsvSource({
            "0, 0",
            "1, 1",
            "2, 1",
            "7, 13",
            "30, 832040",
            "50, 12586269025",
            "70, 190392490709135",
            "100, 354224848179261915075"
    })
    @ParameterizedTest
    public void testFibUnmemorized(int n, BigInteger result) {
        Assertions.assertEquals(result, new Fibonacci().fibUnmemorized(n));
    }
}
