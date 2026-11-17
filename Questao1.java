import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[10];
        int soma = 0;
        int maior;

        // Leitura dos números
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = sc.nextInt();
            soma += numeros[i];
        }

        // Cálculo da média
        double media = (double) soma / numeros.length;

        // Exibição inversa
        System.out.println("\nNúmeros na ordem inversa:");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }

        // Quantidade de números maiores que a média
        int quantidade = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > media) {
                quantidade++;
            }
        }

        System.out.println("\nMédia: " + media);
        System.out.println("Números maiores que a média: " + quantidade);

        // Identificação do maior valor
        maior = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }

        System.out.println("Maior valor: " + maior);
        System.out.println("Índices onde o maior valor aparece:");

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == maior) {
                System.out.println("Índice: " + i);
            }
        }

        sc.close();
    }
}