public class Rodadas {
    public static String rodadas(String participante1, String participante2, String[] tabuleiro){
        int fimDeJogo = 0;
        String vez = participante1;
        while (fimDeJogo < 9 ){
            vez = Jogadas.jogadas(participante1, participante2, tabuleiro, vez);
            TabuleiroPrint.tabuleiroPrint(tabuleiro);
            fimDeJogo++;//funçao que calcula o ganhador do jogo
            if ((tabuleiro[0].equals(tabuleiro[1]) && tabuleiro[1].equals(tabuleiro[2])) || (tabuleiro[3].equals(tabuleiro[4]) && tabuleiro[4].equals(tabuleiro[5])) ||
                    (tabuleiro[6].equals(tabuleiro[7]) && tabuleiro[7].equals(tabuleiro[8])) || (tabuleiro[0].equals(tabuleiro[3]) && tabuleiro[3].equals(tabuleiro[6])) ||
                    (tabuleiro[1].equals(tabuleiro[4]) && tabuleiro[4].equals(tabuleiro[7])) || (tabuleiro[2].equals(tabuleiro[5]) && tabuleiro[5].equals(tabuleiro[8])) ||
                    (tabuleiro[0].equals(tabuleiro[4]) && tabuleiro[4].equals(tabuleiro[8])) || (tabuleiro[2].equals(tabuleiro[4]) && tabuleiro[4].equals(tabuleiro[6]))){
                System.out.println("O jogo acabou");
                if (vez == participante1){
                    System.out.printf("O vencedor é %s!", participante2);
                    vez = participante2;
                } else {
                    System.out.printf("O vencedor é %s!", participante1);
                    vez = participante1;
                }
                break;
            }
        }
        return vez;    }
}
