package lista00;
import java.util.Scanner;

public class Exercicio1 {
    public void Retangulo(int Lado) {

        int lado;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Entre com uma dimensão: ");
        lado = teclado.nextInt();

        for (int i = 0; i < lado; i++) {
            if (i == 0 || i == (lado - 1)) {
                System.out.print("+");
                for (int j = 1; j < lado - 1; j++) {
                    System.out.print("-");
                    if (j == (lado - 2)) {
                        System.out.print("+");
                    }
                }
            } else {
                for (int j = 0; j < lado; j++) {
                    if (j == 0 || j == (lado - 1)) {
                        System.out.print("-");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}



