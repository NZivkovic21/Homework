//Ned Zivkovic
//CS 113
//Lab 1 
	
	//Rules:
	//Print "Fizz", Multiple of 3
	//Print "Buzz", Multiple of 5
	//Both multiple 3 and 5, "FizzBuzz"
package homework;

public class FizzBuzz {

	public static void main(String[] args) {
	
		
		//Using for else to make all the possible options for the program.
		for(int i = 1; i <= 100; i++) {
			if(i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");
			}
			else if(i % 3 == 0) {
				System.out.println("Fizz");
			}
			else if(i % 5 == 0) {
				System.out.println("Buzz");
			}
			else {
				System.out.println(i);
			}
		}
	}
	
}
