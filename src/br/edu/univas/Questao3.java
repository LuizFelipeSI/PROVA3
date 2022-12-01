package br.edu.univas;

import java.util.Scanner;

public class Questao3 {

    public static void main (String []args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor, digite um número:");
        int n = scan.nextInt();
        int x = 0;
        int y = 2;
        int u = n;
        if(n < 50 || n > 100) {
            System.out.println("Número inválido!");
        } else {
            numerosImparesOuPares(n,x ,y, u);
        }
    }

    public static int numerosImparesOuPares(int n, int x, int y, int u) {

        if (n % 2 == 0){
            int[] numerosOrdenados = new int[u];
            numerosOrdenados[x] = (n + y) - n;
            System.out.println(numerosOrdenados[x]);
        } else {
            int[] numerosOrdenados = new int[u];
            numerosOrdenados[x] = (n + y - 1) - n;
            System.out.println(numerosOrdenados[x]);
        }

        if (n == 2 || n == 1) {
            return n;
        }
        return n + numerosImparesOuPares(n-2, x + 1, y +2, u);
    }
}
