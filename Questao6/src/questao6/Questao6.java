package questao6;
import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args) {
        double salario;
        double prestacao;
        double porcento;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe o seu salario bruto: ");
        salario = sc.nextDouble();
        System.out.println("Informe o valor de prestação desejado: ");
        prestacao = sc.nextDouble();
        
        porcento = salario * 0.3;
        
        if(prestacao <= porcento){
            System.out.println("Emprestimo aprovado!");
        }else{
            System.out.println("O Emprestimo não podê ser aprovado.");
        }      
    }
}
