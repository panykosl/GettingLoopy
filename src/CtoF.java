import java.util.Scanner;
public class CtoF
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double tempC = 0;
        String trash = "";
        Boolean done = false;
        System.out.println("Enter Temperature in C: ");
        do {
            if(in.hasNextDouble())
            {
                tempC = in.nextDouble();
                double tempF = (tempC * 9/5) + 32;
                System.out.println("Temperature in F is: " + tempF);
                done = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println(trash + " is not a number. Try again.");
                System.out.println();
                System.out.println("Enter Temperature in C: ");
            }
        }while(!done);
    }
}