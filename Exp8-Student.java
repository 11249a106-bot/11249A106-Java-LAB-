interface Student {
    void displayStudent();
}

interface Sports {
    void displaySports();
}

class Result implements Student, Sports {
    public void displayStudent() {
        System.out.println("Student Name: Arun");
        System.out.println("Roll Number: 101");
    }

    public void displaySports() {
        System.out.println("Sports Marks: 90");
    }
}

public class Main {
    public static void main(String[] args) {
        Result r = new Result();
        r.displayStudent();
        r.displaySports();
    }
}
