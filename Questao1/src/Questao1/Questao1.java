package Questao1;
import java.util.Scanner;

public class Questao1 {

    public static void main(String[] args) {
        double salarioOriginal;
        double porcentagem;
        double resultado;
        double novoSalario;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe seu salário: ");
        salarioOriginal = sc.nextDouble();
        System.out.println("Informe o percentual de aumento: ");
        porcentagem = sc.nextDouble();
        
        resultado = porcentagem / 100;
        
        novoSalario = salarioOriginal + (salarioOriginal * resultado);
        
        System.out.println("O salário com o aumento será: "+ novoSalario); 
    }
}
