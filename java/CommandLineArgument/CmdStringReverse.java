public class CmdStringReverse {
	public static void main(String[] args){
		//not executing program if there is no argument received from cmd
		if(args.length == 0) {
			System.out.println("Run this program from CMD with argument!!!!");
			return;
		}
		//running loop from last index of array
		for(int i = args.length-1; i >= 0; i--) {
			String string = args[i];
			int length = string.length();			
			//running loop at string from last character
			for(int j = length-1; j >= 0; j--) {
				System.out.print(string.charAt(j));
			}
            		System.out.print(" ");
		}
		System.out.println();
	}
}