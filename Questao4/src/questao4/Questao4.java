package questao4;
import java.util.Scanner;
        
public class Questao4 {
    public static void main(String[] args) {
        String nome = null;
        double salario;
        double salarioNovo;
        
        Scanner sc = new Scanner(System.in);
        
        while (!"fim".equals(nome)){
            System.out.println("Informe seu nome: (Informe 'fim' para fechar o programa)");
            nome = sc.nextLine();
            System.out.println("Informe o seu salário atual");
            salario = sc.nextDouble();
            
            if (salario < 500.00) {
               System.out.println("Você tem direito ao reajuste de salário!");
               salarioNovo = salario + (salario * 0.20 );
               System.out.println("Seu novo salário é: "+ salarioNovo);
            }else{
               System.out.println("Você não tem direito ao reajuste.");
            }
        }  
    }
}
