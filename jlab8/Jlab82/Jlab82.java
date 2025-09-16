class Jlab82
{
    public static int findHighest(int[] myInts)
	{
		int myIndex;
		int highestIndex;
		int highestNo;

		highestNo = 0;
		highestIndex = 0;
		for(myIndex = 0; myIndex <= myInts.length -1; myIndex ++)
			{
				if(highestNo == 0)
					{
						highestIndex = myIndex;
						highestNo = myInts[myIndex];
					}
				else if(myInts[myIndex] > highestNo)
						{
							highestIndex = myIndex;
							highestNo = myInts[myIndex];
						}
			}
		return highestIndex;
	}
    public static int highestNoApp(int intArray[])
    {
        int theHighest;
        int index;

        theHighest = 0;
        for(index = 0; index <= intArray.length -1; index ++)
            {
                if(intArray[index] == intArray[index -1])
                    {
                        theHighest ++;
                    }
                else
                    {
                        theHighest = 1;
                    }
            }

        return theHighest;
    }
	public static void main(String[] args)
	{
		int intArray[] = new int[4];
        int index;
        int appearanceHigh;
        
        for(index = 0; index <= intArray.length -1; index ++)
            {
                System.out.println("Enter number " + index);
                intArray[index] = EasyIn.getInt();
            }
        appearanceHigh = highestNoApp(intArray);
        System.out.println("The highest number appeared "  + appearanceHigh + " times ");
	}
}