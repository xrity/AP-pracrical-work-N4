import java.util.Scanner;

//4

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("First number: ");
        int firstNum = Integer.parseInt(scanner.nextLine());

        System.out.println("Second number: ");
        int secondNum = Integer.parseInt(scanner.nextLine());

        System.out.println("Operator (+, -, *, /): ");
        String operator = scanner.nextLine();

        int result;

        switch (operator) {
            case '+':
                result = firstNum + secondNum;
                break;
            case '-':
                result = firstNum - secondNum;
                break;
            case '*':
                result = firstNum * secondNum;
                break;
            case '/':
                if (secondNum != 0) {
                    result = firstNum / secondNum;
                } else {
                    System.out.println("Cannot divide by zero.");
                    return;
                }
                break;
            default:
                System.out.println("Operator cannot be processed");
                break;
        }

        System.out.println("Result: " + result);
    }
}
