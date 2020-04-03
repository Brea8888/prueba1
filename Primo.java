
package tema1;


import java.util.Scanner;
public class Primo{  

	//un numero primo es un nÃºmero natural mayor que 1 que 
	//tiene unicamente dos divisores distintos: el mismo y el 1
	public static boolean esPrimo(String numero){
	
		try {
			int num = Integer.parseInt(numero);
			if (num < 1){
				System.out.println("Número no natural o no mayor que 1");
				return false;
			}
			else {
				for (int i=2; i<num; i++)
					if (num%i==0)
						return false;
				return true;
			}
		} catch (NumberFormatException e){
			System.out.println("Error al convertir a número");
			return false;
		}
	}
	
	public static void main (String[] args) {
		Primo prueba = new Primo();
		
		System.out.println("Dime un número : ");
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		
		System.out.println(n + " es primo: " + prueba.esPrimo(n));
	}
}
