class Numbers

// Student Name : Shehab Ahmed
// Student Id Number : C00295178
// Date : 25/9/2023
// Purpose : To find the sum, product and average of three numbers

{

    public static void main(String[] args)
    {

        int number1;
        int number2;
        int number3;
        int sum;
        int product;
        double average;

        System.out.println("Enter the first number : ");
        number1 = EasyIn.getInt();
        System.out.println("Enter the second number : ");
        number2 = EasyIn.getInt();
        System.out.println("Enter the thrid number : ");
        number3 = EasyIn.getInt();
        sum = number1 + number2 + number3;
        product = number1 * number2 * number3;
        average = (double) sum/3;
        System.out.println("The sum of the three numbers is " + sum);
        System.out.println("The product of the three numbers is " + product);
        System.out.println("The average of the three numbers is " + average);
        

    }
}