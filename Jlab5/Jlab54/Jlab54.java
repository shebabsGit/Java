class Jlab54
{
	public static void main(String[] args)

		{
			String sentence1;
			String sentence2;
			int result;
			int menu;
			boolean sentEqual;

			System.out.println("Enter a sentence ");
			sentence1 = EasyIn.getString();
			System.out.println("Enter another sentence ");
			sentence2 = EasyIn.getString();
			sentEqual = sentence1.equals(sentence2);
			
			do
				{
					System.out.println("1. Compare first string to second string ");
					System.out.println("2. Compare second string to first string ");
					menu = EasyIn.getInt();
					switch(menu)
						{
							case 1:
								result = sentence1.compareTo(sentence2);
								if(result == 0)
									{
										System.out.println("The sentences are the same ");
									}
								else
									{
										System.out.println("The sentences are not the same ");
									}
								break;
							case 2:
								result = sentence2.compareTo(sentence1);
								if(result == 0)
									{
										System.out.println("The sentences are the same ");
									}
								else
									{
										System.out.println("The sentences are not the same ");
									}
								break;
							default:
								System.out.println("Incorrect input. Re-run the prgoram and input a number between 1-2 ");
								break;
						}
				}
			while((menu != 1) && (menu != 2));
			if(sentEqual == true)
				{
					System.out.println("Are they the same? " + sentEqual);
				}
			else
				{
					System.out.println("Are they the same? " + sentEqual);
				}
		}
}