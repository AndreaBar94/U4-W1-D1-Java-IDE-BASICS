
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
		
		double resultDouble = (num1+num2)*2;
		
		System.out.println("Il perimetro del rettangolo è: " + resultDouble);
		
		userCalc.close();
		
	};
	
	public static void pariDispari() {
        Scanner in = new Scanner(System.in);
        System.out.println("Inserisci un numero:");
        int numero = in.nextInt();

        if (numero % 2 == 0) {
            System.out.println(0);
        }else {
            System.out.println(1);
        }
        
        in.close();
    }
	
	public static void perimetroTriangolo() {
        Scanner in = new Scanner(System.in);
          System.out.print("primo lato del triangolo: ");
          double lato1 = in.nextDouble();
          System.out.print("secondo lato del triangolo: ");
          double lato2 = in.nextDouble();
          System.out.print("terzo lato del triangolo: ");
          double lato3 = in.nextDouble();
          double perimetro = lato1+lato2+lato3;
          double area = Math.sqrt(perimetro * (perimetro-lato1) * (perimetro-lato2) * (perimetro-lato3));
          System.out.println("l'area del triangolo è:" + area);
          in.close();
  }
	
}
