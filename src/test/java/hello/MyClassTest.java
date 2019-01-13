package hello;
// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;
import org.junit.Test;



public class MyClassTest {

    @Test
    public void multiplicationOfZeroIntegersShouldReturnZero() {
        MyClass tester = new MyClass(); // MyClass is tested

        // assert statements
        assertEquals(0, tester.multiply(10, 0));
        assertEquals(0, tester.multiply(0, 10));
        assertEquals(0, tester.multiply(0, 0));
    }
}
