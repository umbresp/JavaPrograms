import java.util.Scanner;

public class TestLoanClass {
	/** Main method */
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Enter yearly interest rate
		System.out.print("Enter yearly interest rate, for example, 8.25: ");
		double annualInterestRate = input.nextDouble();

		// Enter number of years
		System.out.print("Enter number of years as an integer: ");
		int numberOfYears = input.nextInt();

		// Enter loan amount
		System.out.print("Enter loan amount, for example, 120000.95: ");
		double loanAmount = input.nextDouble();

		// Create Loan object
		Loan loan = new Loan(annualInterestRate, numberOfYears, loanAmount);

		// Format to keep two digits after the decimal point
		double monthlyPayment = (int)(loan.getMonthlyPayment() * 100) / 100.0;
		double totalPayment = (int)(loan.getTotalPayment() * 100) / 100.0;

		// Display results
		System.out.println("The loan was created on " + loan.getLoanDate().toString() + "\nThe monthly payment is " + monthlyPayment + "\nThe total payment is " + totalPayment);
	}
}