public class JogoDaVelha {
    public static void main(String[] args) {
        Regras.regras();
        String participante1 = GetUser.getUser("X");
        String participante2 = GetUser.getUser("O");

        String[] tabuleiro = {"1","2","3","4","5","6","7","8","9"};
        TabuleiroPrint.tabuleiroPrint(tabuleiro);

        int fimDeJogo = 0;
        while (fimDeJogo<9){
            Rodada.rodada(participante1, participante2, tabuleiro);
            TabuleiroPrint.tabuleiroPrint(tabuleiro);
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
