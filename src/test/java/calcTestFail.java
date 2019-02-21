import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class calcTestFail {
    @Test
    public void factorialFive() {
        Factorial f = new Factorial();
        int expected = 180;
        int actual = f.fact(5);
        assertEquals(expected, actual);
    }
}
