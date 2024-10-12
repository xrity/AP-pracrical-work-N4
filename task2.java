import java.util.Scanner;

//2

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Text: ");
        String userText = scanner.nextLine();

        int result = 0;
        int k = userText.length();
        int i = 0;

        while (i < k) {
            switch (userText.charAt(i)) {
                case '.':
                    result++;
                    break;
                case '!':
                    result++;
                    break;
                case '?':
                    result++;
                    break;
                default:
                    break;
            }

            i++;
        }

        System.out.println("Result: " + result);
    }
}
