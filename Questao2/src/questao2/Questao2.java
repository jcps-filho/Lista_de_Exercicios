
package questao2;

import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        int x = 10;
        int y;
        int z;
        Scanner sc = new Scanner(System.in);
        while (x > 0){
            System.out.println("Digite um número inteiro: ");
            y = sc.nextInt();
            z = y % 2;
            if (z == 0){
                System.out.println("O número digitado é par!");
            }else{
                System.out.println("O número digitado é impar!");
            }
            x = x - 1;
        }
    }
    
}
