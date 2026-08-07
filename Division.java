import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        if (b != 0) {
            int result = a / b;
            System.out.println("Division = " + result);
        } else {
            System.out.println("Cannot divide by zero");
        }

        sc.close();
    }
}