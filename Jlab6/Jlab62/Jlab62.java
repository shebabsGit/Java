class Jlab62

{
    public static boolean isAlpha(char theChar)
    {
        boolean evenTest;

        if(((theChar >= 'A') && (theChar <= 'Z')) || ((theChar >= 'a') && (theChar <= 'z')))
            {
                evenTest = true;
            }
        else
            {
                evenTest = false;
            }
        return evenTest;
    }

    public static void main(String[] args)
    {
        char currentChar;
        boolean evenOrOdd;

        System.out.println("Enter a character ");
        currentChar = EasyIn.getChar();
        evenOrOdd = isAlpha(currentChar);
        System.out.println(evenOrOdd);
    }
}