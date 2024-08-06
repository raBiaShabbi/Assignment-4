import java.util.*;
public class prob2 {
    public static void main(String[] args) {
        System.out.println("Enter a string:");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        if(checkPalindrome(str , str.length()) == true){
            System.out.println("This is palindrome.");
        }
        else {
            System.out.println("This is not a palindrome.");
        }
    }

    private static boolean checkPalindrome(String str, int length) {
        str = str.toLowerCase();
        if(length == 0 || length == 1){
           return true;
        }
        else{
            if(str.charAt(0) == str.charAt(length-1)){
                return true;
            }
            checkPalindrome(str.substring(1,length-1) , length-2);
        }
        return false;
    }
}
