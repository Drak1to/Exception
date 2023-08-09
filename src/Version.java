import java.util.Scanner;

public class Version {
    public static void main(String[] args) throws IllegalAccessException, MyException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("(1) When a < 0 or b < 0");
        System.out.println("(2) When a=0 or b!= 0");
        System.out.println("(3) When a!=0 or b= 0");
        System.out.println("(4) When a=0 or b= 0 ");
        System.out.println("(5) When a>0 or b> 0");
        System.out.println("Choose case  ");
        int chose = scanner.nextInt();
        switch (chose) {
            case 1: {
                System.out.println("Write numbers");
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                Methods m = new Methods(a, b);
                if (a <= 0 || b <= 0) {
                    throw new IllegalArgumentException("Numbers cannot be <0");
                } else {
                    System.out.println("Plus = " + a + " + " + b + " = " + m.plus());
                    System.out.println("Minus = " + a + " - " + b + " = " + m.minus());
                    System.out.println("Multiply = " + a + " * " + b + " = " + m.multip());
                    System.out.println("Division = " + a + " / " + b + " = " + m.division());
                }
                break;
            }
            case 2: {
                System.out.println("Write numbers");
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                Methods m = new Methods(a, b);
                if (a == 0 || b != 0) {
                    throw new ArithmeticException("Error");
                } else {
                    System.out.println("Plus = " + a + " + " + b + " = " + m.plus());
                    System.out.println("Minus = " + a + " - " + b + " = " + m.minus());
                    System.out.println("Multiply = " + a + " * " + b + " = " + m.multip());
                    System.out.println("Division = " + a + " / " + b + " = " + m.division());
                }
                break;

            }
            case 3: {
                System.out.println("Write numbers");
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                Methods m = new Methods(a, b);
                if (a != 0 || b == 0) {
                    throw new IllegalAccessException("Error");
                } else {
                    System.out.println("Plus = " + a + " + " + b + " = " + m.plus());
                    System.out.println("Minus = " + a + " - " + b + " = " + m.minus());
                    System.out.println("Multiply = " + a + " * " + b + " = " + m.multip());
                    System.out.println("Division = " + a + " / " + b + " = " + m.division());
                }
                break;
            }
            case 4: {
                System.out.println("Write numbers");
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                Methods m = new Methods(a, b);
                if (a == 0 || b == 0) {
                    throw new IllegalArgumentException("Error");
                } else {
                    System.out.println("Plus = " + a + " + " + b + " = " + m.plus());
                    System.out.println("Minus = " + a + " - " + b + " = " + m.minus());
                    System.out.println("Multiply = " + a + " * " + b + " = " + m.multip());
                    System.out.println("Division = " + a + " / " + b + " = " + m.division());
                }
                break;
            }
            case 5: {
                System.out.println("Write numbers");
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                Methods m = new Methods(a, b);
                if (a >= 0 || b >= 0) {
                    throw new IllegalArgumentException("Error");
                } else {
                    System.out.println("Plus = " + a + " + " + b + " = " + m.plus());
                    System.out.println("Minus = " + a + " - " + b + " = " + m.minus());
                    System.out.println("Multiply = " + a + " * " + b + " = " + m.multip());
                    System.out.println("Division = " + a + " / " + b + " = " + m.division());

                }
            }
        }
    }
}

    