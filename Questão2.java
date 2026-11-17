import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nomes = new String[6];
        int[] quantidades = new int[6];

        // Cadastro dos produtos
        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Nome do produto: ");
            nomes[i] = sc.nextLine();

            System.out.print("Quantidade em estoque: ");
            quantidades[i] = sc.nextInt();

            while (quantidades[i] < 0) {
                System.out.print("Quantidade inválida. Digite novamente: ");
                quantidades[i] = sc.nextInt();
            }

            sc.nextLine();
        }

        // Busca do produto
        System.out.print("\nDigite o nome do produto para venda: ");
        String busca = sc.nextLine();

        int indice = -1;

        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].equalsIgnoreCase(busca)) {
                indice = i;
                break;
            }
        }

        // Venda do produto
        if (indice == -1) {
            System.out.println("Produto não encontrado.");
        } else {
            System.out.print("Quantidade para venda: ");
            int venda = sc.nextInt();

            while (venda <= 0) {
                System.out.print("Digite uma quantidade positiva: ");
                venda = sc.nextInt();
            }

            if (venda <= quantidades[indice]) {
                quantidades[indice] -= venda;
                System.out.println("Venda realizada com sucesso!");
            } else {
                System.out.println("Estoque insuficiente!");
            }
        }

        // Exibição do estoque atualizado
        System.out.println("\n--- ESTOQUE ATUALIZADO ---");

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i] + " - Quantidade: " + quantidades[i]);

            if (quantidades[i] < 5) {
                System.out.println("ATENÇÃO: Estoque baixo!");
            }
        }

        sc.close();
    }
}