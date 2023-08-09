//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) throws IllegalAccessException, MyException {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Plus 1");
//        System.out.println("Minus 2");
//        System.out.println("Multiply 3");
//        System.out.println("Division 4");
//        System.out.println("Choose case  ");
//        int chose = scanner.nextInt();
//        switch (chose) {
//            case 1: {
//                System.out.println("Write numbers");
//                int a = scanner.nextInt();
//                int b = scanner.nextInt();
//                Methods m = new Methods(a, b);
//
//                System.out.println(" When a < 0 or b < 0");
//                if (a <= 0 || b <= 0) {
//                    throw new IllegalArgumentException("Numbers cannot be <0");
//                } else {
//                    System.out.println("Plus = " + a + " + " + b + " = " + m.plus());
//                }
//                System.out.println(" When a=0 or b!= 0");
//                if (a == 0 || b != 0) {
//                    throw new ArithmeticException("Error");
//                } else {
//                    System.out.println("Plus = " + a + " + " + b + " = " + m.plus());
//                }
//                System.out.println(" When a!=0 or b= 0 ");
//                if (a != 0 || b == 0) {
//                    throw new ArithmeticException("Error");
//                } else {
//                    System.out.println("Plus = " + a + " + " + b + " = " + m.plus());
//                }
//                System.out.println(" When a=0 or b= 0 ");
//                if (a == 0 || b == 0) {
//                    throw new IllegalAccessException("Error");
//                } else {
//                    System.out.println("Plus = " + a + " + " + b + " = " + m.plus());
//                }
//                System.out.println(" When a>0 or b> 0 ");
//                if (a >= 0 || b >= 0) {
//                    throw new MyException("Error");
//                } else {
//                    System.out.println("Plus = " + a + " + " + b + " = " + m.plus());
//                }
//            }
//            case 2:{
//                    System.out.println("Write numbers");
//                    int a = scanner.nextInt();
//                    int b = scanner.nextInt();
//                    Methods m = new Methods(a, b);
//
//                    System.out.println(" When a < 0 or b < 0");
//                    if (a <= 0 || b <= 0) {
//                        throw new IllegalArgumentException("Numbers cannot be <0");
//                    } else {
//                        System.out.println("Minus = " + a + " - " + b + " = " + m.minus());
//                    }
//                    System.out.println(" When a=0 and b!= 0");
//                    if (a == 0 || b != 0) {
//                        throw new ArithmeticException("Error");
//                    } else {
//                        System.out.println("Minus = " + a + " - " + b + " = " + m.minus());
//                    }
//                    System.out.println(" When a!=0 or b= 0 ");
//                    if (a != 0 || b == 0) {
//                        throw new ArithmeticException("Error");
//                    } else {
//                        System.out.println("Minus = " + a + " - " + b + " = " + m.minus());
//                    }
//                    System.out.println(" When a=0 or b= 0 ");
//                    if (a == 0 || b == 0) {
//                        throw new IllegalAccessException("Error");
//                    } else {
//                        System.out.println("Minus = " + a + " - " + b + " = " + m.minus());
//                    }
//                    System.out.println(" When a>0 or b>0 ");
//                    if (a >= 0 || b >= 0) {
//                        throw new MyException("Error");
//                    } else {
//                        System.out.println("Minus = " + a + " - " + b + " = " + m.minus());
//                    }
//
//            }
//            case 3:{
//                System.out.println("Write numbers");
//                int a = scanner.nextInt();
//                int b = scanner.nextInt();
//                Methods m = new Methods(a, b);
//
//                System.out.println(" When a < 0 or b < 0");
//                if (a <= 0 || b <= 0) {
//                    throw new IllegalArgumentException("Numbers cannot be <0");
//                } else {
//                    System.out.println("Multiply = " + a + " * " + b + " = " + m.multip());
//                }
//                System.out.println(" When a=0 or b!= 0");
//                if (a == 0 || b != 0) {
//                    throw new ArithmeticException("Error");
//                } else {
//                    System.out.println("Multiply = " + a + " * " + b + " = " + m.multip());
//                }
//                System.out.println(" When a!=0 or b= 0 ");
//                if (a != 0 || b == 0) {
//                    throw new ArithmeticException("Error");
//                } else {
//                    System.out.println("Multiply = " + a + " * " + b + " = " + m.multip());
//                }
//                System.out.println(" When a=0 or b= 0 ");
//                if (a == 0 || b == 0) {
//                    throw new IllegalAccessException("Error");
//                } else {
//                    System.out.println("Multiply = " + a + " * " + b + " = " + m.multip());
//                }
//                System.out.println(" When a>0 or b> 0 ");
//                if (a >= 0 || b >= 0) {
//                    throw new MyException("Error");
//                } else {
//                    System.out.println("Multiply = " + a + " * " + b + " = " + m.multip());
//                }
//
//                }
//            case 4:{
//                System.out.println("Write numbers");
//                int a = scanner.nextInt();
//                int b = scanner.nextInt();
//                Methods m = new Methods(a, b);
//
//                System.out.println(" When a < 0 or b < 0");
//                if (a <= 0 || b <= 0) {
//                    throw new IllegalArgumentException("Numbers cannot be <0");
//                } else {
//                    System.out.println("Division = " + a + " / " + b + " = " + m.division());
//                }
//                System.out.println(" When a=0 or b!= 0");
//                if (a == 0 || b != 0) {
//                    throw new ArithmeticException("Error");
//                } else {
//                    System.out.println("Division = " + a + " / " + b + " = " + m.division());
//                }
//                System.out.println(" When a!=0 or b= 0 ");
//                if (a != 0 || b == 0) {
//                    throw new ArithmeticException("Error");
//                } else {
//                    System.out.println("Division = " + a + " / " + b + " = " + m.division());
//                }
//                System.out.println(" When a=0 or b= 0 ");
//                if (a == 0 || b == 0) {
//                    throw new IllegalAccessException("Error");
//                } else {
//                    System.out.println("Division = " + a + " / " + b + " = " + m.division());
//                }
//                System.out.println(" When a>0 and b> 0 ");
//                if (a >= 0 || b >= 0) {
//                    throw new MyException("Error");
//                } else {
//                    System.out.println("Division = " + a + " / " + b + " = " + m.division());
//                }
//
//            }
//
//
//            }
//
//
//        }
//
//
//
//
//    }
//
//
//
//
//
