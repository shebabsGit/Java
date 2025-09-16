class Temperature

// Student Name : Shehab Ahmed
// Student Id Number : C00295178
// Date : 22/9/2023
// Purpose : To convert degrees Fahrenheit to degrees Centigrade

{
	public static void main(String[] args) 
	{

		double f;
		double c;

		System.out.println("Enter the temperature in degrees Fahrenheit : ");
		f = EasyIn.getDouble();
		c = ((f-32)*5/9);
		System.out.println("This is the temperature in Centigrades : " + c);

	}
}
