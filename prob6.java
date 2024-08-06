import java.util.*;
public class prob6 {
    public static void main(String[] args) {
        System.out.println("Enter base:");
        Scanner input = new Scanner(System.in);
        double base = input.nextInt();
        System.out.println("Enter exponent:");
        int exp = input.nextInt();
        System.out.println("Power is:" + " " + calculatePower(base,exp));
    }

    private static double calculatePower(double base, int exp) {
        if(exp == 1){
            return base;
        }
        return base * calculatePower(base,exp-1);
    }
}