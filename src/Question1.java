import java.util.Scanner;
public class Question1 {
    public static void main (String[] args){
        Scanner myValue = new Scanner(System.in);
        System.out.println("Enter your number:");
        int number;
        number = myValue.nextInt();
        if (number%2 == 1){
            System.out.println("It's odd number");
        }
        else
            System.out.println("Number is even");

        }
    }

