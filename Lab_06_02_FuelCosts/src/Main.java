import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        double tankGallons = 0;
        double mpG = 0;
        double gasPrice = 0;
        double mpgTotal = 0;
        double farGo = 0;
        String trash = "";

        System.out.print("How many gallons of gas are in your tank? ");

        if(in.hasNextDouble())
        {
            tankGallons = in.nextDouble();
            in.nextLine();
            System.out.println("You have " + tankGallons + " gallons");
        }
        else
        {
            trash = in.nextLine();
            System.out.println(trash + " is not a valid number!");
        }

        System.out.print("What is the MPG in your car? ");

        if(in.hasNextDouble())
        {
            mpG = in.nextDouble();
            in.nextLine();
            System.out.println("You have " + mpG + " MPG");
        }
        else
        {
            trash = in.nextLine();
            System.out.println(trash + " is not a valid number!");
        }

        System.out.print("What is the gas price? ");

        if(in.hasNextDouble())
        {
            gasPrice = in.nextDouble();
            in.nextLine();
            System.out.println("The gas price is " + gasPrice);
        }
        else
        {
            trash = in.nextLine();
            System.out.println(trash + " is not a valid number!");
        }

        mpgTotal = 100 / mpG;

        System.out.println("The cost to go 100 miles is " + mpgTotal);

        farGo = tankGallons * mpG;

        System.out.println("You can drive " + farGo + " miles");

    }
}