//Código feito por Leandro Gonçalves da Silva

import java.util.Scanner;
public class SequenciaFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escreva17 um número: ");
        int numero = scanner.nextInt();
        boolean pertence = pertenceASequencia(numero);
        if (pertence){
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
        }
        scanner.close();
    }
    public static boolean pertenceASequencia(int numero) {
        if (numero == 0 || numero == 1) {
            return true;
        }
        int a = 0;
        int b = 1;
        int soma = 0;
        while (soma < numero) {
            soma = a + b;
            a = b;
            b = soma;
        }
        return soma == numero;
    }
}

