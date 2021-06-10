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
    public void FizzBuzzConvertGivenSix() {
        assertEquals("Fizz", Fizzbuzz.FizzBuzzConverter(6));
    }

    @Test
    public void FizzBuzzConvertGivenSeven() {
        assertEquals("7", Fizzbuzz.FizzBuzzConverter(7));
    }

    @Test
    public void FizzBuzzConvertGivenNegative() {
        assertEquals("Fizz", Fizzbuzz.FizzBuzzConverter(-6));
    }

    @Test
    public void FizzBuzzMassConvertGivenLength20() {
        String[] expected = {"FizzBuzz", "1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz"};
        assertArrayEquals(expected, Fizzbuzz.MassFizzBuzzConverter(10));
    }

    @Test
    public void FizzBuzzMassConvertGivenNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            Fizzbuzz.MassFizzBuzzConverter(null);
        });
    }

    @Test
    public void FizzBuzzMassConvertGiven0() {
        assertThrows(IllegalArgumentException.class, () -> {
            Fizzbuzz.MassFizzBuzzConverter(0);
        });
    }

    @Test
    public void FizzBuzzMassConvertGivenNegative() {
        assertThrows(IllegalArgumentException.class, () -> {
            Fizzbuzz.MassFizzBuzzConverter(-1);
        });
    }
}