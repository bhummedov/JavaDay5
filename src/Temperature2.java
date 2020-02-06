import java.util.Scanner;
public class Temperature2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter tem:");
        int tem = scanner.nextInt();
        if (tem <= 20) {
            System.out.println("Winter");
        } else if (tem > 20 && tem <=40) {
            System.out.println("Fall");
        }else if (tem > 40 && tem <=60) {
            System.out.println("Fall");}
        else
            {
            System.out.println("Spring");
        }
    }
}