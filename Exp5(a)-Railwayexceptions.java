import java.util.Scanner;

public class RailwayException {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] trainCodes = { "TR101", "TR202", "TR303", "TR404" };

        System.out.print("Enter train code index: ");
        int index = sc.nextInt();

        try {
            System.out.println("Train Code: " + trainCodes[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index");
        }

        sc.close();
    }
}
