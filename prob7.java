import java.util.*;
public class prob7 {
    public static void main(String[] args) {
        System.out.println("Enter a string:");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reverseString(str));
    }

    private static String reverseString(String str) {
        if(str.length() <= 1){
           return str;
        }
        return str.charAt(str.length()-1) + reverseString(str.substring(0,str.length()-1));
    }
}
