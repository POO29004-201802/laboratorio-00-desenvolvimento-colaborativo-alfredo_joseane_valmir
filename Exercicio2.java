package Lista00;

import java.util.Scanner;

public class Exercicio2 {
        public static void main(String[] args) {
                int espaco, asterisco;
                Scanner entrada = new Scanner(System.in);

                System.out.print("Entre com uma altura:  ");
                int altura = entrada.nextInt();

                if (altura % 2 != 0) {

                        //Imprimi primeira parte da figura
                        asterisco = 1;
                        espaco = (altura - 1) / 2;
                        for (int i = 1; espaco > 0; i++) {

                                //espaco

                                for (int countEspaco = 1; countEspaco <= espaco; countEspaco++) {
                                        System.out.print(" ");
                                }

                                //asteriscos

                                for (int countAsterisco = 1; countAsterisco <= asterisco; countAsterisco++) {
                                        if (countAsterisco == 1 || countAsterisco == (asterisco)) {
                                                System.out.print("*");
                                        } else {
                                                System.out.print(" ");
                                        }
                                }
                                espaco--;
                                asterisco += 2;
                                System.out.println();
                        }

                        //imprimi a segunda parte da figura
                        for (int linha = 1; asterisco > 0; linha++) {

                                // espaco
                                for (int countEspaco = 1; countEspaco <= espaco; countEspaco++) {
                                        System.out.print(" ");
                                }

                                //asterisco
                                for (int countAsterisco = 1; countAsterisco <= asterisco; countAsterisco++) {
                                        if (countAsterisco == 1 || countAsterisco == (asterisco)) {
                                                System.out.print("*");
                                        } else {
                                                System.out.print(" ");
                                        }
                                }

                                espaco++;
                                asterisco -= 2;
                                System.out.println();
                        }

                } else {
                        System.out.println("valor inválido para um losango!");
                }
        }

}