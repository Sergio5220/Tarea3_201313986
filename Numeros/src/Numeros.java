import java.util.Scanner;
public class Numeros {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int numero;
		System.out.println("ingrese un numero");
		numero= sc.nextInt();
		if (numero%2==0)
			System.out.println("Es par");
		else
			System.out.println("es impar");
		return;			
	}
}
