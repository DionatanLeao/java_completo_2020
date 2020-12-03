import java.util.Locale;
import java.util.Scanner;

/***
 * 
 * @author dionatan
 *
 */

public class Main {

	public static void main(String[] args) {
		
		double x = 10.35784;
		Locale.setDefault(Locale.US);
		System.out.println(x);
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		System.out.println("O valor de x é: " + x);
		System.out.printf("O valor de x é: %.2f ", x);
		
		System.out.println("\n---------------------\n");
		
		Scanner sc = new Scanner(System.in);
		
		String s;
		s = sc.next();
		System.out.println("Você digitou: " + s);
		
		int i;
		i = sc.nextInt();
		System.out.println("Você digitou: " + i);
		
		double d;
		d = sc.nextDouble();
		System.out.println("Você digitou: " + d);
		sc.close();	
		
		char c;
		c = sc.next().charAt(0);
		System.out.println("Você digitou: " + c);
	}

}
