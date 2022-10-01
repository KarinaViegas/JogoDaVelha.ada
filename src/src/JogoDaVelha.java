public class JogoDaVelha {
    public static void main(String[] args) {
        Regras.regras();
        String participante1 = GetUser.getUser("X");
        String participante2 = GetUser.getUser("O");

        String[] tabuleiro = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
        int vitoriasPart1 = 0;
        int vitoriasPart2 = 0;
        TabuleiroPrint.tabuleiroPrint(tabuleiro);

        String vencedor = Rodadas.rodadas(participante1, participante2, tabuleiro);

        if (vencedor.equals(participante1)) {
            vitoriasPart1++;
        } else if (vencedor.equals(participante2)) {
            vitoriasPart2++;
        } else {
            System.out.println("Empate!");
        }

        System.out.println("Jogo encerrado" + vencedor);

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
