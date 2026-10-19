import java.util.Scanner;

public class Calcu {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter 1st number: ");
        int firstInt = in.nextInt();
        System.out.println("Please enter 2nd number: ");
        int secondInt = in.nextInt();

        System.out.println("The Sum is: " + (firstInt + secondInt));
        System.out.println("The Difference is: " + (firstInt - secondInt));
        System.out.println("The Product is: " + (firstInt * secondInt));
        System.out.println("The Quotient is: " +(double) (firstInt / secondInt));
        System.out.println("The Remainder is: " + (firstInt % secondInt));

        in.close();
    }
}
