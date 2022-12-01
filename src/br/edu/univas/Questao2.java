package br.edu.univas;

import java.util.Scanner;

public class Questao2 {

    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor, digite um número de 50 até 100:");
        long n = scan.nextLong();
        if (n < 50 || n > 100) {
            System.out.println("Número inválido!");
        } else {
            long soma = somaNumeros(n);
            System.out.println("A soma dos números de 1 até " + n + " é: " + soma);
        }
    }

    public static long somaNumeros(long n) {

        if (n == 1) {
            return 1;
        }

        return n + somaNumeros(n-1);
    }
}
