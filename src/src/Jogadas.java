import java.util.Scanner;

public class Jogadas {
    public static String jogadas(String participante1, String participante2, String[] tabuleiro, String vez){
        Scanner scanner = new Scanner(System.in);
        int posicaoJogada;
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
        return vez;
    }
}
