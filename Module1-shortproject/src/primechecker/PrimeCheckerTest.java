package primechecker;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PrimeCheckerTest {

    PrimeChecker primeChecker = new PrimeChecker();

    @Test
    public void testPrimeNumbers() {
        assertTrue(primeChecker.isPrime(2));
        assertFalse(primeChecker.isPrime(4));
        assertFalse(primeChecker.isPrime(1));
        assertFalse(primeChecker.isPrime(-3));
    }
}
