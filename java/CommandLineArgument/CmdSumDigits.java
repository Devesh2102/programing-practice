public class CmdSumDigits {
	public static void main(String[] args) {
		//if there is exactly one argument
		if(args.length != 1) {
			System.out.println("Not a valid input!!! Please provide one argument (integer) from command line!!!!");
			return;
		}
		try {	
			int number = Integer.parseInt(args[0]);

			if (number < 0) {
				System.out.println("Please enter a non-negative number.");
				return;
			}
			int sum = 0;
			String str = "";

			while(number > 0) {
				int lastDigit = number % 10;
				//making String to show message
				if(str.isEmpty()) {
					str = lastDigit + "";
				}else {
					str = lastDigit + " + " + str;
				}				
				
				sum += lastDigit;
				number = number / 10;
			}
			System.out.println("The sum of digits = " + str + " = " + sum);
		} catch (NumberFormatException e) {
			System.out.println("Invalid input! Please enter a valid integer.");
			//System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("An error occurred: " + e.getMessage());
		}		
	}
}
