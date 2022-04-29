import java.util.Map;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter P if you want to use Palindrome or C if you want to validate the card number");
        String input = userInput.next();

        if (input.equals("P")){
            System.out.println("Enter your number for palindrome");
            String number = userInput.next();
            Map<String, Long> result = Palindrome.checkPalindrome(number);
            System.out.println(result.get("iteration") + " " + result.get("palindrome") );
        }
        else if (input.equals("C")){
            System.out.println("Enter Credit Card number");
            String cardNumber = userInput.nextLine();
            cardNumber += userInput.nextLine();
            boolean isValid = CreditCard.checkCard(cardNumber);
            System.out.println("Card Number is valid: " + isValid);

        }
        else {
            System.out.println("We don't have such a program. End.");

        }
    }
}
