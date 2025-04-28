import java.util.Scanner;

public class compraIngresso {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double precoIngresso = 25.27;
        System.out.println("Quantos ingressos deseja comprar?");
        int quantidade = input.nextInt();
        System.out.println("Seu ingresso será meia entrada? digite  0 pra não e 1 pra sim");
        int meiaEntrada = input.nextInt();
        if (meiaEntrada==1) {
            precoIngresso = precoIngresso / 2;
        } else if (meiaEntrada==0) {
        }else {
            System.out.println("Opção inválida");
        }

        double total = precoIngresso * quantidade;

        System.out.println("===============================");
        System.out.println("🎟️ Resumo da Compra:");
         System.out.println("Quantidade de ingressos: " + quantidade);
        System.out.println("Preço unitário: R$ "+ precoIngresso );
        System.out.printf("Preço total: R$ %f2 \n", total);
        System.out.println("===============================\n");


    }
}
