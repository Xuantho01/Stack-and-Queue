public class PalindomeTest {
    public static void main(String[] args) {
        Palindrome<String> palindrome  = new Palindrome<>();
        String string = "Able was I ere I saw Elba";
//        string = string.toUpperCase();
        palindrome.addStirngToStack(string);
        palindrome.addStringToQueue(string);
        System.out.println(palindrome.compareString());
    }
}
