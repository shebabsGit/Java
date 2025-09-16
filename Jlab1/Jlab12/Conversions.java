class Conversions

// Student Name : Shehab Ahmed
// Student Id Number : C00295178
// Date : 25/9/2023
// Purpose : To calculate miles per hour and miles per gallon in a trip

{

    public static void main(String[] args)
    {

        double tripMiles;
        double tripHours;
        double petrolGallons;
        double avgMpH;
        double avgMpG;

        System.out.println("Enter the trip length in miles : ");
        tripMiles = EasyIn.getDouble();
        System.out.println("Enter how long the trip took in hours : ");
        tripHours = EasyIn.getDouble();
        System.out.println("Enter the amount of petrol used during the trip in gallons : ");
        petrolGallons = EasyIn.getDouble();

        avgMpH = tripMiles/tripHours;
        avgMpG = tripMiles/petrolGallons;
        
        System.out.println("The average miles per hour in the trip is " + avgMpH);
        System.out.println("The average miles per gallon in the trip is " + avgMpG);

    }
}