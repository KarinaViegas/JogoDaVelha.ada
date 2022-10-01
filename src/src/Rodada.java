import java.util.Scanner;

public class Rodada {
    public static void rodada(String participante1, String participante2, String[] tabuleiro){
        Scanner scanner = new Scanner(System.in);
        int posicaoJogada;
        String vez = participante1;
        if (vez.equals(participante1)){
            System.out.printf("%n%s, escolha em qual posicão você deseja jogar:%n", participante1);
            posicaoJogada = scanner.nextInt();
            tabuleiro[--posicaoJogada] = "X";
            vez = participante2;
        } else if (vez.equals(participante2)) {
            System.out.printf("%n%s, escolha em qual posicão você deseja jogar:%n", participante2);
            posicaoJogada = scanner.nextInt();
            tabuleiro[--posicaoJogada] = "O";
            vez = participante1;

        }
    }
}
