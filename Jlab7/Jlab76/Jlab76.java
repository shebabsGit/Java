class Jlab76
{
	public static void main(String[] args)
	{
		String stringsArray[] = new String[5];
        int index;
        int innerIndex;
        String reverseSentence;
        
        for(index = 0; index <= stringsArray.length -1; index ++)
            {
                reverseSentence = "";
                System.out.println("Enter string number " + index + ": ");
                stringsArray[index] = EasyIn.getString();
                for(innerIndex = stringsArray[index].length() -1; innerIndex >= 0; innerIndex --)
                    {
                        reverseSentence = reverseSentence + stringsArray[index].charAt(innerIndex);
                    }
                if(stringsArray[index].equals(reverseSentence))
                    {
                        System.out.println(stringsArray[index] + " is a palindrome ");
                    }
                else
                    {
                        System.out.println(stringsArray[index] + " is not a palindrome ");
                    }
            }
	}
}