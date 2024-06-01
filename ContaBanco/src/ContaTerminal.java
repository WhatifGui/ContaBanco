import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Usuário: ");
		int usuario = scanner.nextInt();
		
		System.out.println("Agência: ");
		String agencia = scanner.next();
		
		System.out.println("Nome: ");
		String nome = scanner.next();
		
		System.out.println("Sobrenome: ");
		String sobrenome = scanner.next();
		
		System.out.println("Digite quanto você quer depositar: ");
		double saldo = scanner.nextDouble(); // input de saldo 
		
		
		System.out.println("Olá "+nome.concat(" ").concat(sobrenome).concat(", ")+ "obrigado por criar uma conta em nosso banco, sua agência é "+ agencia + ", conta"+ usuario +", e seu saldo é "+ saldo +" já está disponível para saque");
		
	}

}
