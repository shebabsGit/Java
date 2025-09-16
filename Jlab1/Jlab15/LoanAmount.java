class LoanAmount

// Student Name : Shehab Ahmed
// Student Id Number : C00295178
// Date : 26/9/2023
// Purpose : 

{

    public static void main(String[] args)
    {

        double loanAmount;
        double interestRateAnnual;
        double yearsLoanTakeout;
        double totalAmountRepaid;
        double end;

        System.out.println("Enter the loan amount : ");
        loanAmount = EasyIn.getDouble();
        System.out.println("Enter the interest rate per annum : ");
        interestRateAnnual = EasyIn.getDouble();
        System.out.println("Enter the amount of years the loan is to be taken out for : ");
        yearsLoanTakeout = EasyIn.getDouble();
        totalAmountRepaid = (loanAmount * (interestRateAnnual * yearsLoanTakeout));
        end = loanAmount + totalAmountRepaid;
        if(end < 0)
            {  
                System.out.println("Check your inputs and re-run the program ");
            }
        else
            {
                System.out.println("This is the amount you must pay back : " + end);
            }

    }
}