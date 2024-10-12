import java.util.Scanner;

//2

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Numeber: ");
        int userNum = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i < userNum; i++) {
            System.out.println(i);
        }
    }
}
