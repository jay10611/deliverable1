import java.util.Scanner;

public class VacationApp {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("What kind of trip would you like to go on, musical,\r\n" + 
				"tropical, or adventurous?");
		String VacationInPut ="";
		
		String vacationType = scnr.nextLine();
		System.out.println("How many people are in your group?");
		int groupSize = scnr.nextInt();
	
		if (vacationType.contentEquals("tropical")) {
			 VacationInPut = ("tropical beach vacation to Mexico");
		}
		else if (vacationType.contentEquals("musical")) {
			 VacationInPut = ("musical vacation to New Orleans");
		}
		else if (vacationType.contentEquals("adventurous")) {
			 VacationInPut = ("adventurous whitewater rafting in the Grand Canyon");
			}
		
		if (groupSize <= 2) {
			System.out.println("You and your group of "+ groupSize + " should take a "  + VacationInPut + " flying First class baby!");
		}
		else if (groupSize <=5 ) {
			System.out.println("get to the choppa! you and your group of  " + groupSize + " should take a helecoptor on your " + VacationInPut  );
		}
		
		else if (groupSize >=6) {
			System.out.println("You and your group of "+ groupSize + " should take a charter flight on a "  + VacationInPut );
		}
		else {System.out.println("try again");
		}
	}
}


