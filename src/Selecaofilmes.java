import java.util.Scanner;

public class Selecaofilmes {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);

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
        System.out.println("Filmes:");
        for (String filme : filmes) {
            System.out.println(filme);
        }

        }
    }

