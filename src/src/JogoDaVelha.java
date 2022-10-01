import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class JogoDaVelha {
    public static void main(String[] args) {


        System.out.println("Regra do Jogo");
        System.out.println();
        System.out.println("É jogado com dois participantes; e no inicio do jogo cada um deve escolher um dos simblos (X O) para representar.");
        System.out.println("O objetivo do jogo é fazer uma sequência de três símbolos iguais, seja em linha vertical,");
        System.out.println("horizontal ou diagonal, enquanto tenta impedir que seu adversário faça o mesmo;");
        System.out.println("Quando um dos participantes faz uma linha, ganha o jogo.");

        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nome do jogador X:");
        String participante1 = scanner.next();
        System.out.println("Nome do jogador O:");
        String participante2 = scanner.next();
        //scanner.close();

        String[] tabuleiro = new String[9];
        String[] tabuleiro1 = {"1","2","3","4","5","6","7","8","9"};
        System.out.println(Arrays.deepToString(tabuleiro));
        System.out.println(Arrays.deepToString(tabuleiro1));
        System.out.println(tabuleiro.length);

        System.out.println();

        System.out.printf(" _%s_|_%s_|_%s_\n", tabuleiro1[0],tabuleiro1[1], tabuleiro1[2]);
        System.out.printf(" _%s_|_%s_|_%s_\n", tabuleiro1[3],tabuleiro1[4], tabuleiro1[5]);
        System.out.printf(" _%s_|_%s_|_%s_\n", tabuleiro1[6],tabuleiro1[7], tabuleiro1[8]);

        int fimDeJogo = 0;
        String vez = participante1;
        while (fimDeJogo<9){
            System.out.println("Escolha em qual posicão deseja Jogar");
            int posicaoJogada = scanner.nextInt();
            if (vez == participante1){
                tabuleiro1[--posicaoJogada] = "X";
                vez = participante2;
            } else if (vez==participante2) {
                tabuleiro1[--posicaoJogada] = "O";
                vez = participante1;
            }
            System.out.printf(" _%s_|_%s_|_%s_\n", tabuleiro1[0],tabuleiro1[1], tabuleiro1[2]);
            System.out.printf(" _%s_|_%s_|_%s_\n", tabuleiro1[3],tabuleiro1[4], tabuleiro1[5]);
            System.out.printf("_%s_|_%s_|_%s_\n", tabuleiro1[6],tabuleiro1[7], tabuleiro1[8]);

            fimDeJogo++;//funçao que calcula o ganhador do jogo
        }

        //placar
        //Fazer os tratamentos de erros, evitar que o jogador errar a posiçao
        //finalizar while quando o jogador nao quiser mais jogar
        //como repetir a partida varias vezes?
        //exibir o placar ao termino de cada rodada(se for empate respota generica) se alguem ganhar mensagem do jogador
        //como saber se alguem ganhou?
        //mudar de lista para matriz
        //fazer a readme


    }
}
