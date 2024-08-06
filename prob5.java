import java.util.*;
public class prob5 {
    public static void main(String[] args) {
        System.out.println("Enter the value of a:");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        System.out.println("Enter the value of b:");
        int num2 = input.nextInt();
        System.out.println("GCD of"+ " " + "(" + num1 + "," + num2 + "):" + " " + calculateGCD(num1,num2));
    }

    private static int calculateGCD(int num1, int num2) {
        if(num2 == 0){
            return num1;
        }
        return calculateGCD(num2,num1%num2);
    }
}