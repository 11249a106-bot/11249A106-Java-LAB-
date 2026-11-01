import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            FileOutputStream fout =
                new FileOutputStream("profile.txt");

            String data = "Name: Arun\nAge: 21\nWeight: 65 kg";

            fout.write(data.getBytes());
            fout.close();

            System.out.println("Profile data written successfully.");

            FileInputStream fin =
                new FileInputStream("profile.txt");

            int ch;
            System.out.println("\nUser Profile:");

            while ((ch = fin.read()) != -1) {
                System.out.print((char) ch);
            }

            fin.close();

        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }
}
