import java.util.Locale;
import java.util.Scanner;


class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int Numero, Hora;
        double HoraSalario, salario; 

        Numero = sc.nextInt();
        Hora = sc.nextInt();
        HoraSalario = sc.nextDouble();
        
        salario = Hora* HoraSalario;
        
        System.out.println("NUMBER = " + Numero);
        System.out.printf("SALARY = U$ %.2f%n " , salario);

        sc.close();
    }
}
