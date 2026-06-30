import java.util.Scanner;

public class PopcornTimer{
	
	public static void main(String[] args) {
		
		System.out.print("Welcome to IPopcorn \n" + "******************* \n" + "Please enter your name: ");
		
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		System.out.print("Hello " + input + ", how many Popcorn packs do you have for today? ");
		
		Scanner number = new Scanner(System.in);
		int pops = scan.nextInt();
		int corn = pops * 205;
		System.out.println("Please set the time to " + corn + " seconds");
		
		int time = corn / 60; 
		int timeInSec = pops % 60;
		
		System.out.println("Please set the time to " + time + " mintues and " + timeInSec + " seconds");
	}
}
