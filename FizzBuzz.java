import org.junit.Test;
import static org.junit.Assert.*;

public class FizzBuzzTest {

    /**
     * Java Method to solve FizzBuzz problem, which states that program
     * should print fizz if number is multiple of 3, 
     * print buzz if number is multiple
     * of 5, and print fizzbuzz if number is multiple of both 3 and 5
     * 
     * @param number
     * @return
     */
    public static String fizzBuzz(int number) {

        if (number % 3 == 0) {
            if (number % 5 == 0) {
                return "fizzbuzz";
            } else {
                return "fizz";
            }
        } else if (number % 5 == 0) {
            return "buzz";
        }
        return String.valueOf(number);
    }

    /**
     * An improved version of earlier solution, much cleaner than previous
     * version 
     */
    public static String fizzBuzz2(int number) {
        if (number % 15 == 0) {
            return "fizzbuzz";
        } else if (number % 5 == 0) {
            return "buzz";
        } else if (number % 3 == 0) {
            return "fizz";
        }
        return String.valueOf(number);
    }
    
    
    @Test
    public void testFizzBuzz(){
        assertEquals("fizz", fizzBuzz(3));
        assertEquals("buzz", fizzBuzz(5));
        assertEquals("fizzbuzz", fizzBuzz(15));
        assertEquals("2", fizzBuzz(2));
    }
    
    @Test
    public void testFizzBuzzV2(){
        assertEquals("fizz", fizzBuzzV2(3));
        assertEquals("buzz", fizzBuzzV2(5));
        assertEquals("fizzbuzz", fizzBuzzV2(15));
        assertEquals("2", fizzBuzzV2(2));
    }
}

