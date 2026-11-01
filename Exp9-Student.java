package studentInfo;

public class Student {
    public void displayInfo() {
        System.out.println("Student Name: Arun");
        System.out.println("Roll Number: 101");
    }
}
import studentInfo.Student;

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.displayInfo();
    }
}
