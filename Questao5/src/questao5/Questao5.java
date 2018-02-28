package questao5;
import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        double litros;
        double total;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Quantos litros de gasolina foram comprados?");
        litros = sc.nextDouble();
        
        total = (litros * 2.5)+ 6;
        
        System.out.println("Total a ser pago: "+ total);
    }
    
}
