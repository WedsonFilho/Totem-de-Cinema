import java.util.Arrays;
import java.util.Scanner;

public class Selecaofilmes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] filmes = {
                "1. Um Filme Minecraft",
                "2. Pecadores",
                "3. O Rei dos Reis",
                "4. O Contador 2",
                "5. Until Dawn: Noite de Terror",
                "6. Conclave",
                "7. Capitão América: Admirável Mundo Novo",
                "8. Flow"
        };
        System.out.println("========== Filmes: ===========");
        for (String filme : filmes) {
            System.out.println(filme);
        }
        System.out.println("===== Escolha um filme: =====");
        int escolha = input.nextInt();
        System.out.println("🎬 Filme escolhido:");
        if (escolha >= 1 && escolha <= filmes.length) {
            System.out.println("==> " + filmes[escolha - 1].substring(3));
        } else{
            System.out.println(" ⚠\uFE0F Filme fora de cartaz");
        }
        System.out.println("===============================\n");





        }
    }

