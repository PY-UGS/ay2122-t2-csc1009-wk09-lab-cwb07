import static org.junit.Assert.*;
import java.util.regex.Pattern;
import org.junit.Test;

public class RandomCharacterTest {

    @Test
    public void testGetRandomLowerCaseLetter() {
        //check if function to generate lower character actually matches a-z
        RandomCharacter rc = new RandomCharacter();
        assertTrue(Pattern.matches("[a-z]", Character.toString(rc.getRandomLowerCaseLetter())));
    }

    @Test
    public void testGetRandomUpperCaseLetter() {
        //check if function to generate lower character actually matches A-Z
        RandomCharacter rc = new RandomCharacter();
        assertTrue(Pattern.matches("[A-Z]", Character.toString(rc.getRandomUpperCaseLetter())));
    }

    @Test
    public void testGetRandomDigitCharacter() {
        //check if function to generate lower character actually matches 0-9
        RandomCharacter rc = new RandomCharacter();
        assertTrue(Pattern.matches("[0-9]", Character.toString(rc.getRandomDigitCharacter())));
    }

    @Test
    public void testGetRandomCharacter() {
        //check if function to generate lower character actually matches 0-9, a-z, A-Z
        RandomCharacter rc = new RandomCharacter();
        assertTrue(Pattern.matches("[0-9a-zA-Z]", Character.toString(rc.getRandomCharacter())));
    }

    @Test
    public void testIsPrime() {
        //check if function to check if number is prime returns correct values

        RandomCharacter rc = new RandomCharacter();

        //number 4 is not a prime and check if function actually returns false
        boolean ifPrime = rc.isPrime(4); 

        assertEquals(false, ifPrime);

        //do a second checking
        //number 7 is a prime and check if function actually returns true
        ifPrime = rc.isPrime(7); 
        assertEquals(true, ifPrime);
    }
}
