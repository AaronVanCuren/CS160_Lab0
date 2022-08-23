package vancac03_lab0;

import java.util.*;

public class FirstClass {

	public static void main(String[] args)
	{
		Scanner userInput = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = userInput.nextLine();
		
		System.out.println("Hello Java!");
		System.out.println("\tHow are you? My name is " + name + ".");
		System.out.println("Java: Hello " + name + ".");
		System.out.println("\tI am doing good, how are you " + name + "?");
		
		boolean isRunning = true;
		while(isRunning)
		{
			System.out.println("Enter response: great, good, bad, sad or goodbye.");
			String response = userInput.nextLine();
			
			switch (response)
			{
			case "great":
				System.out.println("I am so happy to hear that!\n");
				break;
			case "good":
				System.out.println("That is great!\n");
				break;
			case "bad":
				System.out.println("Don't let the world drag you down!\n");
				break;
			case "sad":
				System.out.println("Let me tell you a joke!\n Two Bytes meet. The first byte asks, \"Are you ill?\"\n The second byte replies, \"No, just feeling a bit off.\" beep boop beep boop beep boop\n");
				break;
			case "goodbye":
				System.out.println("See you later " + name + "!");
				isRunning = false;
				userInput.close();
				break;
			default:
				System.out.println("I'm sorry, I did not get that. Pleaes respond with great, good, bad, sad or goodbye.\n");
				break;
			}
		}
	}
}
