import java.util.Scanner;
public class BooksArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String books[] = new String[10];
        System.out.println("enter 10 BookTitles:");
        for (int i=0;i<10;i++)
        {
            books[i]=sc.nextLine();
        }
        System.out.println("Books starting with A:");
        for (int i=0;i<10;i++)
        {
            if (books[i].startsWith("A"))
                System.out.println(books[i]);
        }
    }
}
