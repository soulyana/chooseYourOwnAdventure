package chooseYourOwnAdventure;

import java.util.Scanner;

public class ChooseYourOwnAdventure {

	public static void main(String[] args) {
		
		// Declare variables
		String decision1;
		String decision2;
		String decision3;

		String HEADER = "WELCOME TO ANNA'S & SOUL'S MANSION OF HORRORS!";

		String ENDING1 = "The gnawing pain of your rumbling stomach drives you crazy.";
		String ENDING2 = "Well, then I guess you'll never know what was in there. "
						+ "Thanks for playing, I'm tired of making nested if statements.";

		String ENDING3 = "You die of poisioning.";
		String ENDING4 = "A smog fills the room and a seductive woman in red emerges and invites you into her lair. "
						+ "You don't remember what happened. But you are happily now floating in the abyss. "
						+ "Because she is an American god.";

		String ENDING5 = "While you are turning the pig on the spoke... you hear a loud bangning from the door! "
						+ "A group of tribesman run up on you and chop you to pieces for stealing their game.";
		String ENDING6 = "Shortly after, a group of tribesman enter the room and invite you for dinner... "
						+ "but you are on the menu too!";

		String ENDING7 = "A gargoyle snaps your neck and drinks your blood!";
		String ENDING8 = "A gargoyle charges at you and chases you down the hallway and out of the top floor window! "
						+ "Too bad you don't have wings!";
		
		// Create a scanner object
		Scanner scan = new Scanner(System.in);
		
		// Display header
		System.out.println(HEADER);

		//	Inserts a blank line for ease of reading
		System.out.println();
		
		// Display prompt and get first decision 
		System.out.println("You signed up for a social experiment at University of Maryland Mansion! "
				+ "You just entered the living room and are looking around for the scientists.  "
				+ "Would you like to go \"downstairs\" or into the \"kitchen\"? ");
		decision1 = scan.nextLine();

		if (decision1.equals("kitchen")) 
		{	
			// Display second prompt and get second decision 
			System.out.println("There is a long countertop with dirty dishes everywhere.  Off to one side there is, "
								+ "as you'd expect, a refrigerator. You may open the \"refrigerator\" or look in a \"cabinet\". ");
			decision2 = scan.nextLine();

			if (decision2.equals("refrigerator")) 
			{
				// Display third prompt and get third decision 
				System.out.println("Inside the refrigerator you see food and stuff. It looks pretty nasty. "
								+ "Would you like to eat some of the food? (\"yes\" or \"no\")");
				decision3 = scan.nextLine();
				
				// Display ending
				if (decision3.equals("yes")) 
				{
					System.out.println(ENDING3);
				} 
				else if (decision3.equals("no")) 
				{
					System.out.println(ENDING1);
				}

			} 
			else if (decision2.equals("cabinet"))
			{
				// Display third prompt and get third decision
				System.out.println("Inside the cabinet you see a pig head and a bloody machette. It looks pretty scary. "
									+ "Would you like to grill the pig? (\"yes\" or \"no\")");
				decision3 = scan.nextLine();

				// Display ending
				if (decision3.equals("yes")) 
				{
					System.out.println(ENDING5);
				} 
				else if (decision3.equals("no")) 
				{
					System.out.println(ENDING6);
				}
			}
		} 
		else if (decision1.equals("downstairs")) 
		{	
				// Display second prompt and get second decision
				System.out.println("Downtairs you see a hallway. At the end of the hallway is the master \"bedroom\"."
									+ " There is also another \"hallway\" off to the side.  Where would you like to go?");
				decision2 = scan.nextLine();

				if (decision2.equals("bedroom")) 
				{	
					// Display third prompt and get third decision
					System.out.println("You are in a plush bedroom, with expensive-looking hardwood furniture. "
										+ "The bed is unmade.  In the back of the room, the closet door is ajar.  "
										+ "Would you like to open the door? (\"yes\" or \"no\")");
					decision3 = scan.nextLine();

					// Display ending
					if (decision3.equals("yes")) {
						System.out.println(ENDING4);
					} else if (decision3.equals("no")) {
						System.out.println(ENDING2);
					}

				} 
				else if (decision2.equals("hallway")) 
				{
					// Display third prompt and get third decision
					System.out.println("You are in a creaking and dark hallway, with sharp-looking standing sculptures. "
									+ "There is a hanging chandelier on the verge of crashing down. "
									+ "In the end of the hallway, there is a protruding figure.  "
									+ "Would you like to go see it? (\"yes\" or \"no\")");
					decision3 = scan.nextLine();
					
					// Display ending
					if (decision3.equals("yes")) {
						System.out.println(ENDING7);
					} else if (decision3.equals("no")) {
						System.out.println(ENDING8);
					}
				}
		}
		
	scan.close();
	}
}