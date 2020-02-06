import java.util.Scanner;
public class Temperature {
    public static void main (String[] args){
        Scanner myValue = new Scanner(System.in);
        int temperature;
        temperature = myValue.nextInt();
        if (temperature <=30){
            System.out.println("wear your jacket");
        }
        else if (temperature>30){
            System.out.println("wear hat");

        }

    }
}

