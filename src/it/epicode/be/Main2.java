
import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci stringa 1: ");
		String string1 = input.nextLine();
		System.out.println("Inserisci stringa 2: ");
		String string2 = input.nextLine();
		System.out.println("Inserisci stringa 3: ");
		String string3 = input.nextLine();
		String totalStrings = string1.concat(string2).concat(string3);
		String totalStringsReverse = string3.concat(string2).concat(string1);
		System.out.println(totalStrings);
		System.out.println(totalStringsReverse);
		input.close();
	}
}
