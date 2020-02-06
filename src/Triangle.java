import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value of A:");
        int A;
        int B;
        int C;
        A = scanner.nextInt();
        System.out.println("Enter value of B:");
        B = scanner.nextInt();
        System.out.println("Enter Value of C:");
        C = scanner.nextInt();
        if (A + B > C && A + C > B && B + C > A) {
            System.out.println("This is triangle");
        } else
            System.out.println("not triangle");

    }
}
