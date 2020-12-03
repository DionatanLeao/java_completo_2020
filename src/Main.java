import java.util.Locale;

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
		
	}

}
