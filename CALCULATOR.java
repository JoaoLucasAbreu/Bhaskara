package com.example.calculator;

import java.util.Scanner;

public class CALCULATOR {

    public static void main(String[] args) {
        // write your code here
        Scanner scan = new Scanner(System.in);
        double x1, x2, delta, a, b, c;
        int cont = 1;

        while (cont != -1) {

            System.out.println("Você realizará uma conta de Bhaskara. [1] Continuar [-1] Finalizar");
            cont = scan.nextInt();

            if (cont == 1) {

                System.out.println("Digite: ");
                System.out.println("a: ");
                a = scan.nextDouble();

                System.out.println("b: ");
                b = scan.nextDouble();

                System.out.println("c: ");
                c = scan.nextDouble();

                delta = Math.pow(b, 2) - 4 * a * c;

                if (delta < 0) {

                    System.out.println("Não há raízes reais");
                } else {

                    if (delta == 0) {

                        x1 = -b / 2 * a;
                        System.out.println("Há uma única raiz real: " + x1);
                    } else {

                        x1 = (-b + Math.sqrt(delta)) / (2 * a);
                        x2 = (-b - Math.sqrt(delta)) / (2 * a);
                        System.out.println("Há duas raízes reais, x1:" + x1 + ", x2:" + x2);
                    }
                }


            }

        }

        System.out.println("Programa finalizado!");

    }

}
