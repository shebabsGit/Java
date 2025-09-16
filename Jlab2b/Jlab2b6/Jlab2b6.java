class Jlab2b6

// Student Name : Shehab Ahmed
// Student Id Number : C00295178
// Date : 
// Purpose : 

{
	public static void main(String[] args) 
	{
		int menu;
		double fahrenheit;
		double celcius;
		double centimetre;
		double inch;
		double pound;
		double kilogram;
		final double POUNDTOKILO = 2.205;
		final double INCHTOCENTI = 2.54;
		final int FAHRENHEITTOCELCIUS = 32;

		System.out.println("1. Fahrenheit to Celcius");
		System.out.println("2. Celcius to Fahrenheit");
		System.out.println("3. Inches to Centimetres");
		System.out.println("4. Centimetres to Inches");
		System.out.println("5. Pounds to Kilograms");
		System.out.println("6. Kilograms to Pounds");
		System.out.println("Pick a number between 1-6 : ");
		menu = EasyIn.getInt();
		switch(menu)
			{
				case 1: 
					System.out.println("Enter the temperature in degrees Fahrenheit : ");
					fahrenheit = EasyIn.getDouble();
					celcius = ((fahrenheit - FAHRENHEITTOCELCIUS)*5/9);
					System.out.println("This is the temperature in degrees Celcius : " + celcius);
					break;
				case 2:
					System.out.println("Enter the temperature in degrees Celcius : ");
					celcius = EasyIn.getDouble();
					fahrenheit = ((celcius*5/9) + FAHRENHEITTOCELCIUS);
					System.out.println("This is the temperature in degrees Fahrenheit : " + fahrenheit);
					break;
				case 3:	
					System.out.println("Enter the length in inches : ");
					inch = EasyIn.getDouble();
					centimetre = (INCHTOCENTI*inch);
					System.out.println("This is your answer in centimeters : " + centimetre);
					break;
				case 4:
					System.out.println("Enter the length in centimetres : ");
					centimetre = EasyIn.getDouble();
					inch = (centimetre/INCHTOCENTI);
					System.out.println("This is your answer in inches : " + inch);
					break;
				case 5:
					System.out.println("Enter the weight in pounds : ");
					pound = EasyIn.getDouble();
					kilogram = pound/POUNDTOKILO;
					System.out.println("This is your answer in kilograms : " + kilogram);
					break;
				case 6:
					System.out.println("Enter the weight in kilograms : ");
					kilogram = EasyIn.getDouble();
					pound = kilogram*POUNDTOKILO;
					System.out.println("This is your answer in pounds : " + pound);
					break;
				default:
					System.out.println("Invalid. Rerun program and enter a number between 1-6. ");
			}
	}
}
