import java.util.Scanner;
public class Age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Age:");
        int Age = scanner.nextInt();
        if (Age <= 0) {
            System.out.println("Cannot be negative");
        } else if (Age > 120) {
            System.out.println("Cannot be larger than 120");
        } else {
            System.out.println("Ok");
        }
    }
}
