import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import static org.junit.jupiter.api.Assertions.*;


import java.util.*;

@RunWith(Parameterized.class)
public class DateNextDateOkTest {
    
    private Date input;
    private Date output;
    
    public DateNextDateOkTest(Date input, Date output) {
        this.input = input;
        this.output = output;
    }

    @Parameterized.Parameters(name="{index}: testDate_NextDate({0})={1}")
    public static List<Date []> data() {
        //List<Date [][]> inputAndOutputs = new ArrayList<Date [][]> ();
        
        return Arrays.asList(new Date[][] {
                {new Date(1565, 2, 22), new Date(1565, 2, 23)},
                {new Date(888, 8, 8), new Date(888, 8, 9)},
                {new Date(888, 4, 30), new Date(888, 5, 1)},
                {new Date(999, 5, 31), new Date(999, 6, 1)},
                {new Date(1700, 06, 20), new Date(1700, 06, 21)},
                {new Date(2005, 04, 15), new Date(2005, 04, 16)},
                {new Date(1901, 07, 20), new Date(1901, 07, 21)},
                {new Date(3456, 3, 27), new Date(3456, 3, 28)},
                {new Date(1500, 2, 17), new Date(1500, 2, 18)},
                {new Date(1700, 6, 29), new Date(1700, 6, 30)},
                {new Date(1800, 11, 29), new Date(1800, 11, 30)},
                {new Date(3453, 1, 29), new Date(3453, 1, 30)},
                {new Date(444, 2, 29), new Date(444, 3, 1)},
                {new Date(2005, 4, 30), new Date(2005, 5, 1)},
                {new Date(3453, 1, 30), new Date(3453, 1, 31)},
                {new Date(3456, 3, 30), new Date(3456, 3, 31)},
                {new Date(1901, 7, 31), new Date(1901, 8, 1)},
                {new Date(3453, 1, 31), new Date(3453, 2, 1)},
                {new Date(3456, 12, 31), new Date(3457, 1, 1)}
        });
    }

    @Test
    public void testNextDateCorrect() {
        assertEquals(input.nextDate(), output);
    }
}