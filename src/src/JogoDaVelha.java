import java.util.Locale;
import java.util.Scanner;

public class JogoDaVelha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Regras.regras();
        String participante1 = GetUser.getUser("X");
        String participante2 = GetUser.getUser("O");

        String[] tabuleiro = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
        char jogarNovamente = 'S';

        while(jogarNovamente == 'S') {
            TabuleiroPrint.tabuleiroPrint(tabuleiro);
            String vencedor = Rodadas.rodadas(participante1, participante2, tabuleiro);
            Placar.placar(vencedor, participante1, participante2);
            System.out.println("Digite 'S' para jogar outra partida");
            jogarNovamente = scanner.next().toUpperCase(Locale.ROOT).charAt(0);
        }
        System.out.println("Jogo encerrado");

        //placar ok
        //Fazer os tratamentos de erros, evitar que o jogador errar a posiçao ok
        //finalizar while quando o jogador nao quiser mais jogar ok
        //como repetir a partida varias vezes?ok
        //exibir o placar ao termino de cada rodada(se for empate respota generica) se alguem ganhar mensagem do jogador
        //como saber se alguem ganhou?ok
        //fazer a readme


    }
}
