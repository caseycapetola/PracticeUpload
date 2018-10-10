import java.util.Scanner;

public class Practice 
{

	public static void main(String[] args) 
	{
		//printing
		System.out.print("I know how to print.\n");
		
		//printing the value of a variable
		int num = 10; //declared and initialized --> first assignment
		
		double decimal = 3.75; //declared and initialized in one line [can be done in two]
		
		String str = "Casey Capetola"; //declared and initialized in one line
		
		System.out.println(num);
		System.out.println(decimal);
		System.out.println(str);  //System.out.println(num + "\n" + under + "\n" + str); is another option
		
		//add 30 to num
		//subtract 25 from decimal
		//concatinate "more stuff" to str
		
		num += 30;
		decimal = decimal - 25.012345; //same as decimal -= 25
		str += " more stuff";
		
		System.out.println("num: " + num); //num: 40
		System.out.println("decimal: " + decimal);
		System.out.println("str: " + str + " <-- that was the content of the string");
		
		//create a scanner for input
		Scanner keyboard = new Scanner(System.in);

		//create a new string variable. prompt the user to enter favorite sport
		//print your favorite sport is ______ and mine is _____.
		String favSport;
		System.out.print("Enter your favorite sport: ");
		favSport = keyboard.nextLine();
		System.out.print("\nYour favorite sport is " + favSport + ", and mine is soccer.");
		
		
	}

}
