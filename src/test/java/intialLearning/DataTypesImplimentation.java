package intialLearning;

public class DataTypesImplimentation {

    public static void main(String[] args) {
        String s = "qw1ertyytrewq";
        String s2 = "";

        boolean isPalindrome = false;

        // Reverse the string s and store it in s2
        for (int i = 0; i <s.length(); i=i+1) {
            s2 = s2 + s.charAt(s.length()-1-i);
            System.out.println(s2);
        }

        
       // i--      i++
        //i=i-1		i=i+1
        // Check if the original string is equal to the reversed string
        if (s.equals(s2)) {
            isPalindrome = true;
        }

        // Output the result
        if (isPalindrome) {
            System.out.println("The given string is a palindrome.");
        } else {
            System.out.println("The given string is not a palindrome.");
        }
    }
}
