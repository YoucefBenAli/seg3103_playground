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
        assertEquals("0", Fizzbuzz.FizzBuzzConverter(0));
    }
}