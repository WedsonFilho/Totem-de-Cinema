import java.util.Arrays;
import java.util.Scanner;

public class Selecaofilmes {
    /*public class Acento{
        public int codigo;
        public boolean disponivel = true;
        Acento(int codigo, boolean disponivel){
            this.codigo = codigo;
            this.disponivel = disponivel;
        }
        public void setDisponivel(boolean disponivel) {
            this.disponivel = !disponivel;
        }
    }
    public class Filme{
        public String nome;
        public String descricao;
        public String categoria;
        public String horario;
        public Acento[] acentos = new Acento[100];

        Filme(String nome, String descricao, String categoria, String horario, Acento[] acentos) {
            this.nome = nome;
            this.descricao = descricao;
            this.categoria = categoria;
            this.horario = horario;
            this.acentos = acentos;
        }
        public void imprimeHorario(){
            System.out.println("Nome: " + nome);
            System.out.println("Horario: " + horario);
        }
        public void imprimeAcentosDisponiveis(){
            String acentosDisponiveis = "";
            for(int i = 0; i<acentos.length; i++){
                if(acentos[i].disponivel){
                    acentosDisponiveis.concat(acentos[i].toString()).concat(" ");
                }
            }
            System.out.println("Acentos disponíveis: " + acentosDisponiveis);
        }
    }*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*Selecaofilmes selecao = new Selecaofilmes();
        */


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

