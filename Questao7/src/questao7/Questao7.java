package questao7;
import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args) {
        int x;
        int reprovados = 0;
        int exames = 0;
        int aprovados = 0;
        double nota1;
        double nota2;
        double media;
        double mediaGlobal = 0;
        Scanner sc = new Scanner(System.in);
        
        for (x = 0; x < 6; x++){
            System.out.println("Informe a primeira nota: ");
            nota1 = sc.nextDouble();
            System.out.println("Informe a primeira nota: ");
            nota2 = sc.nextDouble();
            
            media = (nota1 + nota2)/2;
            mediaGlobal = mediaGlobal + media;
            
            if(media < 3){
                System.out.println("Você reprovou sem direito ao exame, sua média final é: "+media);
                reprovados = reprovados + 1;
            }if(media >= 3 && media <= 7){
                System.out.println("Você presisara fazer o exame para ser aprovado, sua média final é: "+media);
                exames = exames + 1;
            }else{
                System.out.println("Você foi aprovado!, sua média final é: "+media);
                aprovados = aprovados + 1;
            }
        }
        mediaGlobal = mediaGlobal / 6;
        System.out.println("Total de alunos aprovados: "+ aprovados);
        System.out.println("Total de alunos no exame: "+ exames);
        System.out.println("Total de alunos reprovados: "+ reprovados);
        System.out.println("A média da classe é: "+ mediaGlobal);
    }
}