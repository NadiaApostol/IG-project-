public class CreditCard {

    public static boolean checkCard(String cardNo){
        cardNo = cardNo.replaceAll("\\s", "");
        System.out.println(cardNo);
        System.out.println(cardNo.length());
        if (!cardNo.matches("[0-9]+")) {
            return false;
        }
        int validNumberLength = 16;
        if (cardNo.length() != validNumberLength){
            return false;
        }

        int sum = 0;
        for (int i = 1; i < cardNo.length(); i++){

            int digit = Integer.parseInt(cardNo.substring(i-1, i));
            int factor = 2;
            if (i % 2 == 0) {
                factor = 1;
            }

            int product = digit * factor;
            if (product > 9) {
                product = product - 9;
            }

            sum = sum + product;
        }

        int lastDigit = 10 - sum % 10;

        return lastDigit == Integer.parseInt(cardNo.substring(cardNo.length() - 1));
    }
    }
