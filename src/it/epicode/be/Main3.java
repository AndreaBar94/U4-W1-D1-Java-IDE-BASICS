
import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) {
		perimetroRettangolo();
		//pariDispari();
		//perimetroTriangolo();
		
	};
	
	public static void perimetroRettangolo() {
		Scanner userCalc = new Scanner(System.in);
		System.out.println("Inserisci un numero!");
		double num1 = userCalc.nextDouble();
		System.out.println("Inserisci un altro numero!");
		double num2 = userCalc.nextDouble();
		double result = (num1+num2)*2;
		System.out.println("Il perimetro del rettangolo è: " + result);
		userCalc.close();
		
	};

}
