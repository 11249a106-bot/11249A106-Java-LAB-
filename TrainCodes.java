import java.util.Scanner;

public class TrainCodes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] trains = {"TN01", "TN02", "TN03", "TN04"};

        System.out.print("Enter index (0-3): ");
        int index = sc.nextInt();

        try {
            System.out.println("Train Code: " + trains[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid array index.");
        }

        sc.close();
    }
}