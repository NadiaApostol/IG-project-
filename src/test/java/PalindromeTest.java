import java.util.Map;

public class PalindromeTest {
   void testSimplePositiveCase(){
      Map<String, Long> result = Palindrome.checkPalindrome("102");
      assert result.get("iteration") == 1;
      assert result.get("palindrome") == 303;
  }

    void testSimpleNegativeCase(){
        Map<String, Long> result = Palindrome.checkPalindrome("196");
        assert result.get("iteration") == null;
        assert result.get("palindrome") == null;
    }

    void testTooLargeNumber(){
        Map<String, Long> result = Palindrome.checkPalindrome("429496729522");
        assert result.get("iteration") == null;
        assert result.get("palindrome") == null;
    }

//    potentially the scope of feature and relevant tests can be extended to handling inappropriate input such as:
//    negative numbers, numbers with floating point and non-numeric characters (letters, special characters and alfa-numeric strings)
}
