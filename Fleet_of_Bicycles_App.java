package Week13;
import java.util.Scanner;
public class Fleet_of_Bicycles_App {
	static Scanner userinput = new Scanner(System.in);
	public static void main(String[] args) {
		//create array
		Bicycle[] bikes = new Bicycle[6];
		String answer = "y";
		int i = 0;
		String owner, type;
		int cadence, gear, speed;
		
		while ((answer.equals("y")) && (i <= 5)) {
			//get information
			System.out.print("Enter a name: ");
			owner = userinput.nextLine();
			System.out.print("Enter the type of bicycle that person owns: ");
			type = userinput.nextLine();
			System.out.print("Enter the cadence of the bicycle: ");
			cadence = userinput.nextInt();
			userinput.nextLine();
			System.out.print("Enter the gear of the bicycle: ");
			gear = userinput.nextInt();
			userinput.nextLine();
			System.out.print("Enter the speed of the bicycle: ");
			speed = userinput.nextInt();
			userinput.nextLine();
			//enter information for a bike
			bikes[i] = new Bicycle(cadence,speed,gear,type,owner);
			
			System.out.print("Would you like to enter another Bicycle? (y or n)");
			answer = userinput.nextLine();
			i++;
		}
		//display information
		for (int j=0; j<i; j++) {
			System.out.println("\n" + bikes[j].getInfo());
		}
		
	}
}
