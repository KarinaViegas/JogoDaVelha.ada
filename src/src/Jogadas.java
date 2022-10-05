import java.util.Scanner;

public class Jogadas {
    public static String jogadas(String participante1, String participante2, String[] tabuleiro, String vez){
        Scanner scanner = new Scanner(System.in);
        int posicaoJogada;
        System.out.printf("%n%s, escolha em qual posicão você deseja jogar:%n", vez);
        posicaoJogada = scanner.nextInt();
        posicaoJogada -= 1;//para funcionar com o array que começa com zero
        if (tabuleiro[posicaoJogada].equals("X") || tabuleiro[posicaoJogada].equals("O")) {
            System.out.println("Posição inválida");
            return vez;
        }
        if (vez.equals(participante1)){
            tabuleiro[posicaoJogada] = "X";
            vez = participante2;
        } else if (vez.equals(participante2)) {
            tabuleiro[posicaoJogada] = "O";
            vez = participante1;
        }
        Rodadas.rodadaAtual++;//incrementa mais um para atualizar as rodadas so se for uma posiçcao valida
        return vez;
    }
}
