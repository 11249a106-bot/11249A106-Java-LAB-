import java.util.Scanner;

public class PredefinedException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter age: ");
            int age = Integer.parseInt(sc.nextLine());

            int result = age / 0;
            System.out.println(result);

        } catch (ArithmeticException e) {
            System.out.println("cannot divide by zero");
        } catch (NumberFormatException e) {
            System.out.println("Invalid age input");
        }

        sc.close();
    }
}
