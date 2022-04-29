import java.util.HashMap;
import java.util.Map;

public class Palindrome {
    public static Map<String, Long> checkPalindrome(String n) {

        HashMap<String, Long> output = new HashMap<>();
        long maxLimit = 4294967295L;
        long originNum = Long.parseLong(n);

        if (originNum < maxLimit) {

            for (int i = 0; i <= 1000; i++) {
                long iteration = i + 1;
                originNum = Long.parseLong(n);
                long reversedNum = Long.parseLong(new StringBuilder(n).reverse().toString());
                long sumN = originNum + reversedNum;

                long reversedSum = Long.parseLong(new StringBuilder(Long.toString(sumN)).reverse().toString());

                if (sumN == reversedSum) {

                    output.put("iteration", iteration);
                    output.put("palindrome", sumN);
                    break;
                } else {
                    n = Long.toString(sumN);
                }
            }
        }
        return output;
    }
}




