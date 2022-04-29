import org.junit.jupiter.api.Assertions;

public class CreditCardTest {
    void testValidCardNumber(){
        boolean isValid = CreditCard.checkCard("4246710174499376");
        Assertions.assertTrue(isValid);
    }

    void testInvalidCardNumber(){
//        change the control digit
        boolean isValid = CreditCard.checkCard("4246710174499377");
        Assertions.assertFalse(isValid);
    }

    void testValidCardNumberWithSpaces(){
        boolean isValid = CreditCard.checkCard("42467  1017449 9376");
        Assertions.assertTrue(isValid);
    }

    void testWrongLengthCardNumber(){
        boolean isValid = CreditCard.checkCard("424671017449937611");
        Assertions.assertFalse(isValid);
    }

    void testCardNumberWithLetters(){
        boolean isValid = CreditCard.checkCard("424671017449937A");
        Assertions.assertFalse(isValid);
    }

    void testCardNumberWithSpecialCharacters(){
        boolean isValid = CreditCard.checkCard("424671017449937*");
        Assertions.assertFalse(isValid);
    }
}
