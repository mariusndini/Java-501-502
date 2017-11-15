import java.util.Scanner;

public class Interest{
	public static double calculateSavings(double initial_deposit, 
                                         double yearly_interest_rate,
                                         int num_years){
     // Base case -- if num_years = 0, then we just get the amount of
	  // the initial deposit
	  if (num_years == 0){
        return initial_deposit;
     }

     //System.out.printf(initial_deposit+" "+yearly_interest_rate+" "+num_years);
     System.out.printf("|  %.2f  |  %.2f  |  %d  |\n", initial_deposit, yearly_interest_rate, num_years);

   
	  // If num_years > 0, then for the first year we make
	  // (interest_rate * initial) + initial.    Feed this into the
	  // same function, but now for one fewer year since we have accounted
	  // for the value after this year.
	  
     //Variables
     double initValue = (initial_deposit * yearly_interest_rate) + initial_deposit;
     double answer = calculateSavings(initValue, yearly_interest_rate, num_years - 1);
     return answer;
	}//end calculate savings method

	// ======================
	//     main method
	// ======================
	public static void main(String[] args)
	{
	  // Input variables
	  double initial_amount;
	  double interest_rate; // banks right now if your lucky 0.3
	  int num_years;
	  double future_value;
	  Scanner scan = new Scanner(System.in);

	  System.out.println("Enter initial amount to save:");
	  initial_amount  = scan.nextDouble();
	  
	  System.out.println("Enter yearly interest rate (e.g. 0.10 for 10%)");
	  interest_rate = scan.nextDouble();
	  
	  System.out.println("Enter number of years of compounded interest. ");
	  num_years = scan.nextInt();

	  future_value = calculateSavings(initial_amount, interest_rate, num_years);

	  System.out.println("$" + initial_amount + " after " + num_years + " years, at " +
		  interest_rate + " would amount to $" + future_value);
	}
} // Question1Interest
