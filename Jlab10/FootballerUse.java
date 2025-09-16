class FootballerUse
{
    public static int addOne(Footballer theArray[], int place, Footballer theObject, int noOfValues)	
        {
            int step;
                
            if (noOfValues == 0)
                {
                    theArray [0] = theObject;
                    noOfValues ++;	
                }
            else
                {					
                    for (step = noOfValues - 1 ; step >= place; step --)
                        {
                            theArray[step + 1] = theArray[step] ;
                        }
                    theArray[place] = theObject;
                    noOfValues ++	;
                }

            return noOfValues;
        }

    public static int findPlace(Footballer theArray[], int thePoints, int noOfValues)	
        {
            int step; 
            int place;

            step = 0 ;
            while ((step < noOfValues) && (thePoints - (theArray[step].totalPoints()) < 0))
                {
                    step ++;
                }
            place = step;
            return place;
        }
    public static int highestNumberOfGoals(Footballer footArray[])
        {
            int index;
            int indexOfMax;
            int maxGoals;

            indexOfMax = 0;
            maxGoals = 0;
            for(index = 0; index <= footArray.length -1; index ++)
                {
                    if(index == 0)
                        {
                            maxGoals = footArray[index].getGoals();
                            indexOfMax = index;
                        }
                    else
                        {
                            if(footArray[index].getGoals() >= maxGoals)
                                {
                                    maxGoals = footArray[index].getGoals();
                                    indexOfMax = index;
                                }
                        }
                }
            return indexOfMax;
        }

    public static void main(String[] args)
        {
            Footballer footArray[] = new Footballer[4];
            int index;
            int place;
            int noOfElements;
            String name;
            int goals;
            int points;
            int highestNoOfGoals;

            noOfElements = 0;
            for(index = 0; index <= footArray.length -1; index ++)
                {
                    System.out.print("Enter name : ");
                    name = EasyIn.getString();
                    System.out.print("Enter goals : ");
                    goals = EasyIn.getInt();
                    System.out.print("Enter points : ");
                    points = EasyIn.getInt();
                    footArray[index] = new Footballer();
                    footArray[index].setName(name);
                    footArray[index].setGoals(goals);
                    footArray[index].setPoints(points);
                    place = findPlace(footArray, footArray[index].totalPoints(), noOfElements);
                    noOfElements = addOne(footArray, place, footArray[index], noOfElements);
                }
            for(index = 0; index <= footArray.length -1; index ++)
                {
                    System.out.println(footArray[index].toString());
                }
            highestNoOfGoals = highestNumberOfGoals(footArray);
            System.out.println("The player with the highest number of goals in the array were : " + footArray[highestNoOfGoals].getName());
        }
}