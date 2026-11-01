import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("data.txt");
            fw.write("Welcome to Java File Handling!");
            fw.close();

            System.out.println("Data written successfully.");

            FileReader fr = new FileReader("data.txt");
            int ch;

            System.out.println("File Content:");

            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }

            fr.close();

        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }
}
