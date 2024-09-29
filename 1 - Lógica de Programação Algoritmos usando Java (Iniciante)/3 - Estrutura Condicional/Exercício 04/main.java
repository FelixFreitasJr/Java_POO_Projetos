import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int I , F, D;
		
		I = sc.nextInt();
		F = sc.nextInt();
		
		if ( I < F ) {
			D = F - I;
		} else {
			D = 24 - I + F;
		}
		
		System.out.println("O JOGO DUROU " + D + " HORA(S)");
		
		sc.close();
		
	}

}
