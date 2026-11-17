public class Questão3 {
    
}
import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] precos = new double[8];
        int quantidade = 8;

        // Leitura dos preços
        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite o preço: ");
            precos[i] = sc.nextDouble();

            while (precos[i] <= 0) {
                System.out.print("Preço inválido. Digite novamente: ");
                precos[i] = sc.nextDouble();
            }
        }

        // Cálculo do total e da média
        double total = 0;

        for (int i = 0; i < quantidade; i++) {
            total += precos[i];
        }

        double media = total / quantidade;

        System.out.println("\nTotal inicial: R$ " + total);
        System.out.println("Média inicial: R$ " + media);

        // Solicitação do índice
        int indice;

        System.out.print("\nDigite o índice do preço que deseja remover (0 a 7): ");
        indice = sc.nextInt();

        while (indice < 0 || indice >= quantidade) {
            System.out.print("Índice inválido. Digite novamente: ");
            indice = sc.nextInt();
        }

        // Remoção lógica
        for (int i = indice; i < quantidade - 1; i++) {
            precos[i] = precos[i + 1];
        }

        quantidade--;

        // Limpeza da posição liberada
        precos[quantidade] = 0.0;

        // Exibição dos preços restantes
        System.out.println("\nPreços após a remoção:");

        total = 0;

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Índice " + i + ": R$ " + precos[i]);
            total += precos[i];
        }

        // Novo cálculo da média
        media = total / quantidade;

        System.out.println("\nNovo total: R$ " + total);
        System.out.println("Nova média: R$ " + media);
        System.out.println("Quantidade de preços válidos: " + quantidade);

        sc.close();
    }
}import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] precos = new double[8];
        int quantidade = 8;
        double total = 0;

        // Leitura dos preços
        for (int i = 0; i < precos.length; i++) {
            System.out.print("Digite o preco " + (i + 1) + ": ");
            precos[i] = sc.nextDouble();

            while (precos[i] <= 0) {
                System.out.print("Preco invalido. Digite novamente: ");
                precos[i] = sc.nextDouble();
            }

            total += precos[i];
        }

        // Total e média inicial
        System.out.println("\nTotal: R$ " + total);
        System.out.println("Media: R$ " + (total / quantidade));

        // Escolha do índice
        int indice;

        System.out.print("\nDigite o indice do preco que deseja remover (0 a 7): ");
        indice = sc.nextInt();

        while (indice < 0 || indice >= quantidade) {
            System.out.print("Indice invalido. Digite novamente: ");
            indice = sc.nextInt();
        }

        // Remoção lógica
        for (int i = indice; i < quantidade - 1; i++) {
            precos[i] = precos[i + 1];
        }

        quantidade--;

        // Limpa a posição liberada
        precos[quantidade] = 0.0;

        // Recalcular total
        total = 0;

        System.out.println("\nPrecos validos:");

        for (int i = 0; i < quantidade; i++) {
            System.out.println("R$ " + precos[i]);
            total += precos[i];
        }

        // Total e média atualizados
        System.out.println("\nNovo total: R$ " + total);
        System.out.println("Nova media: R$ " + (total / quantidade));

        System.out.println("Quantidade de precos validos: " + quantidade);

        sc.close();
    }
}