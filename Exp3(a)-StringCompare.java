import java.util.Scanner;

public class StringCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter First Employee Name: ");
        String name1 = sc.nextLine();
        
        System.out.print("Enter Second Employee Name: ");
        String name2 = sc.nextLine();
        
        if (name1.equalsIgnoreCase(name2)) {
            System.out.println("Both employee names are the same");
        } else {
            System.out.println("Employee names are different");
        }
        
        sc.close();
    }
}
