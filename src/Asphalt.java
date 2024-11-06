import java.util.Scanner;

public class Asphalt {
    public static void main(String[] args) {
        // Below this comment: declare and instantiate a Scanner
        Scanner scnr = new Scanner(System.in);

        // Below this comment: declare any variables you may need
        double lengthInMiles = 0;
        int lanes = 0;
        int depthInInches = 0;
        double roadLengthInFeet = 0.0;
        double roadWidthInFeet = 0.0;
        double roadDepthInFeet = 0.0;
        double cubicFeetOfAsphalt = 0.0;
        double poundsOfAsphalt = 0.0;
        double tonsOfAsphalt = 0.0;

        int truckloads = 0;
        double cost = 0.0;

        // Below this comment: collect the required inputs
        System.out.print("Enter length of road in miles      : ");
        lengthInMiles = scnr.nextDouble();
        System.out.print("Enter the number of lanes          : ");
        lanes = scnr.nextInt();
        System.out.print("Enter depth of asphalt in inches   : ");
        depthInInches = scnr.nextInt();

        // Below this comment: write Java code to do the needed computations
        roadLengthInFeet = lengthInMiles * 5280;
        roadWidthInFeet = lanes * 12;
        roadDepthInFeet = depthInInches / 12.0;

        cubicFeetOfAsphalt = roadLengthInFeet * roadWidthInFeet * roadDepthInFeet;
        poundsOfAsphalt = cubicFeetOfAsphalt * 145;
        tonsOfAsphalt = poundsOfAsphalt / 2000;

        truckloads = (int)Math.ceil(tonsOfAsphalt / 5);
        cost = truckloads * 5 * 150;

        // Below this comment: output the correct output
        System.out.printf("Truckloads of asphalt needed is : %d\n", truckloads);
        System.out.printf("Total cost of asphalt needed is : $%.2f\n", cost);


    }
}
