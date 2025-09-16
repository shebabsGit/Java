class Addition 
{

	// Student Name : Shehab Ahmed
	// Student Id Number : C00295178
	// Date : 22/9/2023
	// Purpose : A simple program that adds two numbers the user inputs
	
    public static void main(String[] args) 
	{
    	
    	int number1;
    	int number2;
    	int answer;

    	System.out.print("Enter the first number -> ");
    	number1 = EasyIn.getInt();
    	
    	System.out.print("Enter the second number -> ");
    	number2 = EasyIn.getInt();
    	
    	answer = number1 + number2;
    	System.out.println("The sum of the two numbers is " + answer);

    	
    }
    
    
}