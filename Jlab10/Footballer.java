class Footballer
{
    private String name;
    private int goals;
    private int points;

    public Footballer()
    {

    }
    public void setName(String theName)
    {
        name = theName;
    }
    public void setGoals(int theGoals)
    {
        goals = theGoals;
    }
    public void setPoints(int thePoints)
    {
        points = thePoints;
    }
    
    public String getName()
    {
        return name;
    }
    public int getGoals()
    {
        return goals;
    }
    public int getPoints()
    {
        return points;
    }
    public int totalPoints()
	{
		return goals * 3  + points;
	}

    public String toString()
    {
        String myString;

        myString = "";
        myString += "\n Name            : " + name;
        myString += "\n Goals           : " + goals;
        myString += "\n Points          : " + points;
        myString += "\n Total Points    : " + totalPoints() + "\n";
        
        return myString;
    }
}