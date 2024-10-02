import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to our calculator!");

        menu();

    }
    public static void menu(){
        Operators operators = new Operators();

        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Exit");

        System.out.println("Enter your choice: ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch(choice) {
            case 1:
                System.out.println("Enter first number: ");
                int num1 = scanner.nextInt();
                System.out.println("Enter second number: ");
                int num2 = scanner.nextInt();
                System.out.println("El resultado de la suma es: " + operators.add(num1,num2));
                menu();
                break;
            case 2:
                System.out.println("Enter first number: ");
                int num3 = scanner.nextInt();
                System.out.println("Enter second number: ");
                int num4 = scanner.nextInt();
                System.out.println("El resultado de la resta es: " + operators.subtract(num3,num4));
                menu();
                break;
            case 0:
                System.out.println("Goodbye!");
                break;
        }
    }
}