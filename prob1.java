import java.util.*;
public class prob1 {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        calculateFactorial(num);
    }

    private static void calculateFactorial(int n) {
        if (n < 0) {
            System.out.println("Factorial is undefined for negative numbers.");
        }
        else if (n == 0){
            System.out.println("Factorial of" + " " + n + ":" + " " + 1);
        }
        else {
            int x = 1;
            for (int i = 1; i <= n; i++) {
                x *= i;
            }
            System.out.println("Factorial of" + " " + n + ":" + " " + x);
        }
    }
}