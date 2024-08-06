import java.util.Scanner;

public class prob8 {
    static final long MODULO = 1000000007;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of p: ");
        int p = input.nextInt();
        System.out.println("The minimum product for p = " + p + " is: " + minProduct(p));
    }

    public static long minProduct(int p) {
        long maxNum = (1L << p) - 1;
        long remain = maxNum - 1;
        long pairs = remain / 2;
        long minProduct = modularExponentiation(remain, pairs) * (maxNum % MODULO) % MODULO;
        return minProduct;
    }

    public static long modularExponentiation(long a, long b) {
        a %= MODULO;
        long power = 1;
        while (b > 0) {
            if (b % 2 == 1)
                power = power * a % MODULO;
            a = a * a % MODULO;
            b /= 2;
        }
        return power;
    }
}