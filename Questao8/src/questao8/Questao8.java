package questao8;
import java.util.Scanner;

public class Questao8 {
    public static void main(String[] args) {
        String nome;
        int dias = 1;
        double total;
        Scanner sc = new Scanner(System.in);
        while(dias != 0){
            System.out.println("Bem-vindo! Informe seu nome, por favor:");
            nome = sc.nextLine();
            System.out.println("Agora informe quantos dias você ficara hospedado: (Para SAIR pressone '0' e confirme)");
            dias = sc.nextInt();
        
            if(dias < 10){
                total = (dias * 40) + (dias * 15);
                System.out.println("O valor da sua estadia é: "+ total);
            }else{
                total = (dias * 40) + (dias * 8);
                System.out.println("O valor da sua estadia é: "+ total);
            }
        }
    }
}
