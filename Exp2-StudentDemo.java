class Student {
    String name;
    int rollNo;
    int marks;
    Student(String n, int r, int m) {
        name = n;
        rollNo = r;
        marks = m;
    }
    void display() {
        System.out.println("Name: " + name);
        System.out.println("RollNo: " + rollNo);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade()); 
        System.out.println();
    }
    String grade() {
        if (marks >= 90)
            return "A";
        else if (marks >= 75)
            return "B";
        else if (marks >= 60)
            return "C";
        else if (marks >= 40)
            return "D";
        else
            return "F";
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        Student s1 = new Student("Teja", 101, 92);
        Student s2 = new Student("Anu", 102, 68);
        
        s1.display();
        s2.display();
    }
}
