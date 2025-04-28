import java.util.Scanner;

public class Pagamento {
    Scanner input = new Scanner(System.in);
    public boolean EfetuarPagamento(double valorTotal){
        boolean pago = false;
        System.out.println("Escolha a forma de pagamento: ");
        System.out.println("1. Pix\n2.Cartão");
        int formaPagamento = input.nextInt();
        switch (formaPagamento) {
            case 1:
                //gerar QR Code
                //gerar temporizador
                System.out.println("Forma de pagamento escolhida: Pix");
                System.out.println("QR Code expira em:");
                pago = true;
                break;
            case 2:
                //conectar à maquineta
                System.out.println("Forma de pagamento escolhida: Cartão");
                System.out.println("Insira seu cartão:");
                pago = true;
                break;
            default:
                System.out.println("Forma de pagamento inválida!");
                break;
        }
        return pago;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //importar valor total
        double valorTotal = 75.00;  //exemplo
        Pagamento pagamento = new Pagamento();
        boolean pago = pagamento.EfetuarPagamento (valorTotal);
        if (!pago){
            System.out.println("Pagamento não identificado");
            System.out.println("1.Tentar novamente\n2.Cancelar compra");
            int opcao = input.nextInt();
            while (opcao == 1) {
                pago = pagamento.EfetuarPagamento (valorTotal);
                if (!pago){
                    System.out.println("Pagamento não identificado");
                    System.out.println("1.Tentar novamente\n2.Cancelar compra");
                    opcao = input.nextInt();
                }
            }
            if (opcao == 2) {
                System.out.println("Sessão encerrada");
            }
        }else{
            System.out.println("Pagamento efetuado com sucesso!");
            System.out.println("Imprimindo ingressos...");
        }
    }
}
