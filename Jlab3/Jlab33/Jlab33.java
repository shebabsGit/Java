class Jlab33

// Student Name : Shehab Ahmed
// Student Id Number : C00295178
// Date : 
// Purpose : 

{
	public static void main(String[] args) 
	{
		int index;
		int numberInput = 0;
		int firstIndex = 0;
		int lastIndex = 0;

		for(index = 0; index <= 9; index ++)
			{
				System.out.println("Enter an integer : ");
				numberInput = EasyIn.getInt();
				if(numberInput == 12)
					{
						if(firstIndex == 0)
							{
								firstIndex = index + 1;
							}
						lastIndex = index + 1;
					}
			}
			if((firstIndex == 0)	&&	(lastIndex == 0))
				{
					System.out.println("The first and last occurence of the number 12 is in the data number 0 ");
				}
			else
				{
					System.out.println("The first occurence of the number 12 is in data item number " + firstIndex);
					System.out.println("The last occurence of the number 12 is in data item number " + lastIndex);
				}
	}
}