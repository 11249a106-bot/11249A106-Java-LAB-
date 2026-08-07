import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        
        System.out.println("Original String: " + str);
        System.out.println("Length: " + str.length());
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("First Character: " + str.charAt(0));
        System.out.println("Substring (0 to 3): " + str.substring(0, 3));
        System.out.println("Contains 'Java': " + str.contains("Java"));
        System.out.println("Replace 'a' with '@': " + str.replace('a', '@'));
        System.out.println("Starts with 'J': " + str.startsWith("J"));
        System.out.println("Ends with 'a': " + str.endsWith("a"));

        sc.close();
    }
}