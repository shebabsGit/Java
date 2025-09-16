class LengthConversion

// Student Name : Shehab Ahmed
// Student Id Number : C00295178
// Date : 25/9/2023
// Purpose : To convert inches to centimetres

{
    public static void main(String[] args)
    {

        double centi;
        double inch;
        final double INCHTOCENTI = 2.54;

        System.out.println("Enter the length in inches : ");
        inch = EasyIn.getDouble();
        centi = (INCHTOCENTI*inch);
        System.out.println("This is your answer in centimeters : " + centi);
    }

}