
package job_pricing;
import java.util.Scanner;
public class Job_Pricing {

   
    public static void main(String[] args) {
        String description;
     double materials;
     double hoursOnJob;
     double hoursTraveling;
     double price;
     Scanner input = new Scanner(System.in);
     System.out.print("Enter job description >> ");
     description = input.nextLine();
     System.out.print("Enter cost of materials >> ");
     materials = input.nextDouble();
     System.out.print("Enter hours on the job work >> ");
     hoursOnJob = input.nextDouble();
     System.out.print("Enter hours traveling >> ");
     hoursTraveling = input.nextDouble();
     price = computePrice(materials, hoursOnJob, hoursTraveling);
     System.out.println("The price for " + description +
        " is $" + price);
    }

    private static double computePrice(double materials, double hoursOnJob, double hoursTraveling) {
         double price;
     final double RATE = 35;
     final double TRAVEL_RATE = 12;
     price = materials + hoursOnJob * RATE + hoursTraveling * TRAVEL_RATE;
     return price;
    }
    
}
