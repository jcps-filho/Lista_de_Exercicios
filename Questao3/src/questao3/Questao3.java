package questao3;
import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        int tabuada;
        int x = 1;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o número da tabuada desejada: ");
        tabuada = sc.nextInt();
        
        for(x = 0; x <= 10; x++){
           System.out.print("Tabuada do: " + tabuada);
           System.out.print(" x " + x + " = ");
           System.out.println(x * tabuada);  
        }
       
    }  
}
