import java.util.Scanner;

public class HiLo {

	
	public static void main(String[] args) {
		//get user input
		 Scanner scanner = new Scanner(System.in);

		 //play again string
		 String playAgain = "";
		 //game loop
		 
		 int counter = 0;
		 
		 do{ 
		
			 //create a random number from 1 to 100
			 int theNumber =(int) (Math.random() *100 + 1);
			 
			 System.out.println("Enter your guess!");
			 int guess = 0;
			 
			
			 while (guess != theNumber){
				 
						 do{ //this loop will keep going until the user enter a number from 1 to 100
							 System.out.println("Guess a number beetween 1 and 100:");
							 
		                     guess = scanner.nextInt(); //get the users guess

						          if(guess < 1 || guess > 100){
						        	  System.out.println("Invalid input! Try again.");
						          }
						 }
						 while (guess< 1 || guess> 100);
				 
				 counter++; // Increment in each loop start

				
				 
				 if (guess < theNumber){ //check if number is too low compared to the random number
					 System.out.println( guess + " is too low. Try again.");
				 }
				 else if (guess > theNumber){ //check if number is too high compared to the random number
					 System.out.println(guess + " is too high, Try again.");
				 }
				 else{ //if the number is right, a message will appear with congratulations and number of tries
					 System.out.println(guess + " is correct! You win!");
					 if(counter == 1){
						 System.out.println("You did it on first try! did you hack the game!?");
					 }
					   else if(counter > 1 && counter<=4){
						 System.out.println("It only took you " + counter + " tries! You're awesome!");
					 } else if(counter>5 && counter <8){
						 System.out.println("It took you " + counter + "tries! Good work!");
					 } else {
						 System.out.println("It took you " + counter + " tries! Keep playing to improve!");
					 }
				
				 } //end of while loop for guessing
				 
			}
			 // ask for "y" to play again
           
			    System.out.println("Would you like to play again (y/n)?");
			    playAgain = scanner.next();
          
			  } while (playAgain.equalsIgnoreCase("y"));
		 
		 //Thanks user for playing
		 System.out.println("Thank you for playing! Goodbye.");
		 
		 
		 
  
		
		
	}

}
