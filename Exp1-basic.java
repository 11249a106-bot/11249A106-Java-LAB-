class IfDemo {
    public static void main(String[] args) {
        int n = 10;

        if (n > 0) {
            System.out.println("Number is positive");
        }
    }
}

class IfElseDemo {
    public static void main(String[] args) {
        int n = 7;

        if (n % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
    }
}

class SwitchDemo {
    public static void main(String[] args) {
        int day = 2;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}

class ForDemo {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }
}

class WhileDemo {
    public static void main(String[] args) {
        int i = 1;

        while (i <= 5) {
            System.out.println(i);
            i++;
        }
    }
}

class DoWhileDemo {
    public static void main(String[] args) {
        int i = 1;

        do {
            System.out.println(i);
            i++;
        } while (i <= 5);
    }
}
