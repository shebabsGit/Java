class Multiply

// Student Name : Shehab Ahmed
// Student Id Number : C00295178
// Date : 22/9/2023
// Purpose : A simple program that multiplies three numbers the user inputs

{

    public static void main(String args[]) 
    {

        int number1;
        int number2;
        int number3;
        int answer;

        System.out.print("Enter the first number -> ");
        number1 = EasyIn.getInt();
        System.out.print("Enter the second number -> ");
        number2 = EasyIn.getInt();
        System.out.print("Enter the third number -> ");
        number3 = EasyIn.getInt();
        answer = number1 * number2 * number3;
        System.out.println("The three numbers multiplied is " + answer + "  :D");
    }
}