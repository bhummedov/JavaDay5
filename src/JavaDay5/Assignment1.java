package JavaDay5;
import java.util.Scanner;
public class Assignment1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Please enter the year :");
        int year;
        year = scanner.nextInt();
if (year>2000){
    System.out.println("After Milenuim");
}
else{
    System.out.println("Before Milenuim");
}
    }
}
