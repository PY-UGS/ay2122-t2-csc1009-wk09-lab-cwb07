import java.util.Random;

public class RandomCharacter {
    public static void main(String[] args) {
        RandomCharacter rc = new RandomCharacter();

        String rLower = "";
        String rUpper = "";
        String rDigit = "";
        String rChar = "";
        
        //generate 4 of 15-random characters string
        for (int i = 0 ; i < 15 ; i++ ){
            rLower +=  rc.getRandomLowerCaseLetter();
            rUpper += rc.getRandomUpperCaseLetter();
            rDigit += rc.getRandomDigitCharacter();
            rChar += rc.getRandomCharacter();
        }

        //printing string of length 15 - all lowercase letters
        System.out.println(rLower);

        //printing string of length 15 - all uppercase letters
        System.out.println(rUpper);

        //printing string of length 15 - all digits 0-9
        System.out.println(rDigit);

        //printing string of length 15 - digits 0-9/lowercase letters/uppercase letters
        System.out.println(rChar + "\n");

        //check if the above generated value from getRandomDigitCharacter() is prime
        boolean ifPrime = rc.isPrime(Long.parseLong(rDigit)); 
        System.out.println("The Value: " + rDigit + " Prime: " + ifPrime);

        //sample checking for ifPrime
        //generate a single random digit and check if its prime
        int a = rc.getRandomDigitCharacter() - '0';
        ifPrime = rc.isPrime(a); 
        System.out.println("The Value: " + a + " Prime: " + ifPrime + "\n");
    }

    //generate single lowercase character
    public char getRandomLowerCaseLetter(){
        //nextInt(upperbound) generates values from 0 to upperbound-1
        Random r = new Random();

        //generate a (97) to z (122)
        //generates 0 to 25
        //+ 97 : range becomes 97 to 122
        int lowerCaseLetter = r.nextInt(26) + 97;
        return (char) lowerCaseLetter;
    }

    //generate single uppercase character
    public char getRandomUpperCaseLetter(){
        Random r = new Random();

        //generate A (65) to Z (90)
        int upperCaseLetter = r.nextInt(26) + 65;
        return (char) upperCaseLetter;
    }

    //generate single digit character
    public char getRandomDigitCharacter(){
        Random r = new Random();

        //generate 0-10
        int randomDigit = r.nextInt(10);

        //convert 0 to ASCII 48, add to ASCII of randomDigit
        //convert sum back to char
        return (char)(randomDigit + '0');
    }

    //generate single lowercase/uppercase/digit character
    public char getRandomCharacter(){
        Random r = new Random();

        //0 to 2
        int getChoice = r.nextInt(3);

        switch (getChoice){
            case 0:
                return getRandomLowerCaseLetter();
            case 1:
                return getRandomUpperCaseLetter();
            case 2:
                return getRandomDigitCharacter();
            default:
                return ' ';
        }
    }

    //check if number is prime
    public boolean isPrime(long number) {
        long sqrt = (long) Math.sqrt(number) + 1;

        for (long i = 2; i < sqrt; i++) {
            if (number % i == 0) {
                // number is perfectly divisible - no prime
                return false;
            }
        }
        return true;
    }
}