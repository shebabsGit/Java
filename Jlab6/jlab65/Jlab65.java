class Jlab65

{
	public static void fahrToCel()
	{
		double fahrenheit;
		double celcius;
		final int FAHRENHEITTOCELCIUS = 32;

		System.out.println("Enter the temperature in degrees Fahrenheit : ");
		fahrenheit = EasyIn.getDouble();
		celcius = ((fahrenheit - FAHRENHEITTOCELCIUS)*5/9);
		System.out.println("This is the temperature in degrees Celcius : " + celcius);
	}

	public static void celToFahr()
	{
		double fahrenheit;
		double celcius;
		final int FAHRENHEITTOCELCIUS = 32;

		System.out.println("Enter the temperature in degrees Celcius : ");
		celcius = EasyIn.getDouble();
		fahrenheit = ((celcius*5/9) + FAHRENHEITTOCELCIUS);
		System.out.println("This is the temperature in degrees Fahrenheit : " + fahrenheit);
	}

	public static void inchToCenti()
	{
		double centimetre;
		double inch;
		final double INCHTOCENTI = 2.54;

		System.out.println("Enter the length in inches : ");
		inch = EasyIn.getDouble();
		centimetre = (INCHTOCENTI*inch);
		System.out.println("This is your answer in centimeters : " + centimetre);
	}

	public static void centiToInch()
	{
		double centimetre;
		double inch;
		final double INCHTOCENTI = 2.54;

		System.out.println("Enter the length in centimetres : ");
		centimetre = EasyIn.getDouble();
		inch = (centimetre/INCHTOCENTI);
		System.out.println("This is your answer in inches : " + inch);
	}

	public static void poundToKilo()
	{
		double pound;
		double kilogram;
		final double POUNDTOKILO = 2.205;

		System.out.println("Enter the weight in pounds : ");
		pound = EasyIn.getDouble();
		kilogram = pound/POUNDTOKILO;
		System.out.println("This is your answer in kilograms : " + kilogram);
	}

	public static void kiloToPound()
	{
		double pound;
		double kilogram;
		final double POUNDTOKILO = 2.205;

		System.out.println("Enter the weight in kilograms : ");
		kilogram = EasyIn.getDouble();
		pound = kilogram*POUNDTOKILO;
		System.out.println("This is your answer in pounds : " + pound);
	}
	public static void main(String[] args)
	{
		int menu;

		do
			{
				System.out.println("1. Fahrenheit to Celcius ");
				System.out.println("2. Celcius to Fahrenheit ");
				System.out.println("3. Inches to Centimetres ");
				System.out.println("4. Centimetres to Inches ");
				System.out.println("5. Pounds to Kilograms ");
				System.out.println("6. Kilograms to Pounds ");
				System.out.println("7. Exit Program ");
				menu = EasyIn.getInt();
				switch(menu)
					{
						case 1:
							fahrToCel();
							break;
						case 2:
							celToFahr();
							break;
						case 3:
							inchToCenti();
							break;
						case 4:
							centiToInch();
							break;
						case 5:
							poundToKilo();
							break;
						case 6:
							kiloToPound();
							break;
						case 7:
							System.out.println("Terminatiing program... ");
							System.out.println("Done ");
							break;
						default:
							System.out.println("Invalid input. Enter a number between 1-7 ");
							break;
					}
			}
		while(menu != 7);
	}
}