package demo.horoscope;
import java.util.Scanner;

public class Horoscope {

	public static void main(String[] args) {
	
		welcome();
	
		returnUserSign();
		
	}
	
	// welcome message for application
	private static void welcome() {
		System.out.println("==============");
		System.out.println("  Horoscope");
		System.out.println("==============");
	}
	
	
	
	// iterate through the Signs and returns an instance of the users sign
	// private static Sign returnUserSign() {}
	private static void  returnUserSign(){
		// returns void for now because i don't have a method to feed my Sign to
		// this method gets the input the command line in order to choose the right sign
		
		Scanner userInput = new Scanner( System.in );
		System.out.println("Hey babe what's your sign?");
		String userResponse = userInput.next();
		
		// instances of all the Signs
		Virgo virgo = new Virgo();
		Gemini gemini = new Gemini();
		
		// Array of all the instances of the signs
		Sign[] signArr = {virgo, gemini};
		boolean signFound = false;	
		
		// iterates through the sign instances in order to retrieve the one with the goods
		// right now im not returning an object; im just calling that objects methods ---for later
		for (int i = 0; i < signArr.length; i++) {
			if (userResponse.equals(signArr[i].getClass().getSimpleName())) {
				System.out.println("this method works! Here's today's 'scope." 
									+ signArr[i].currentHoroscope());
				signFound = true;
			}
		}
		
		userInput.close();
		
		if(!signFound){
			System.out.println("I don't know that sign.");
			returnUserSign();
		}
		

		
		// end of Scanner method
		System.out.println(arrayOSigns().length); 
		// flesh out array method and treat it like any other array
		// arrayOSigns()[i]
	}
	
	private static Sign[] arrayOSigns(){
		
		Virgo virgo = new Virgo();
		Gemini gemini = new Gemini();
		Sign[] signArr = {virgo, gemini};
		return signArr;
	}
}
