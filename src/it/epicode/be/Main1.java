
import java.util.Scanner;
import java.util.Arrays;

public class Main1 {
	public static void main(String[] args) {
		Moltiplica();
		Concatena();
		inserisciInArray();
	};
	
	public static void Moltiplica() {
		//multiplier
		Scanner userNum = new Scanner(System.in);
		System.out.println("Inserisci un numero!");
		int a = userNum.nextInt();
		System.out.println("Inserisci un altro numero!");
		int b = userNum.nextInt();
		int result = a * b;
		System.out.println("Il risultato è: " + result);
		userNum.close();
	};
	
	public static void Concatena() {
		//concatenation
		Scanner userStringNum = new Scanner(System.in);
		System.out.println("Scrivi del testo!");
		String text = userStringNum.nextLine();
		System.out.println("Ora inserisci un numero!");
		int c = userStringNum.nextInt();
		System.out.println("Questo è il tuo testo: " + text + "; e questo è il tuo numero: " + c);
		userStringNum.close();
	};
	
	public static void inserisciInArray() {
		//array
		Scanner userArray = new Scanner(System.in);
		String[] data = {"a", "b", "c", "d", "e", ""};
		System.out.println("Scrivi del testo!");
		String strData = userArray.nextLine();
		
		for(int i = 2; i < data.length-1 ; i++) {
			data[i] = data[i+1];
		}
		
		
	
		System.out.println(Arrays.toString(data));
		userArray.close();
 	}
	
}

