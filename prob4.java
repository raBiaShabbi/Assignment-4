import java.util.*;
public class prob4 {
    public static void main(String[] args) {
        System.out.println("Enter number of people:");
        Scanner input = new Scanner(System.in);
        int people = input.nextInt();
        System.out.println(calculateHandshakes(people));
    }

    private static int calculateHandshakes(int people) {
        int count;
        if(people <= 1){
            return 0;
        }
        else {
         return calculateHandshakes(people - 1) + (people - 1);
        }
    }
    }