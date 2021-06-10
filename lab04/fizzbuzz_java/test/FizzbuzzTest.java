import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;
//import org.junit.jupiter.api.Test;

public class FizzbuzzTest {
    @Test
    public void FizzBuzzConvertGivenNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            Fizzbuzz.FizzBuzzConverter(null);
        });
    }
    @Test
    public void FizzBuzzConvertGivenZero() {
        assertEquals("FizzBuzz", Fizzbuzz.FizzBuzzConverter(0));
    }

    @Test
    public void FizzBuzzConvertGivenNegative() {
        assertEquals("Fizz", Fizzbuzz.FizzBuzzConverter(6));
    }
}