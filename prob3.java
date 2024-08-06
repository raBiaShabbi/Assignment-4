import java.util.*;
public class prob3 {
    public static void main(String[] args) {
        System.out.println("Enter a digit:");
        Scanner input = new Scanner(System.in);
        int digit = input.nextInt();
        System.out.println("Enter a number:");
        int num = input.nextInt();
        System.out.println(digit + " " + "in number" + " " + num + ":" + " " +  + countDigit(digit, num));
    }

    private static int countDigit(int digit, int num) {
        int count = 0;
        if(num == 0)
            return 0;
        else{
            if(num % 10 == digit){
                count++;

            }
        }
        return count + countDigit(digit, num/10);
    }

}


