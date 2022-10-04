public class Rodadas {
    public static String rodadas(String participante1, String participante2, String[] tabuleiro){
        tabuleiro = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9"};
        int fimDeJogo = 0;
        String vez = participante1;
        while (fimDeJogo < 9) {
            vez = Jogadas.jogadas(participante1, participante2, tabuleiro, vez);
            TabuleiroPrint.tabuleiroPrint(tabuleiro);
            fimDeJogo++;
            if (verificarFinalJogo(tabuleiro)) {
                System.out.println("O jogo acabou");
                if (vez.equals(participante1)) {
                    System.out.printf("O vencedor é %s!%n", participante2);
                    vez = participante2;
                } else {
                    System.out.printf("O vencedor é %s!%n", participante1);
                    vez = participante1;
                }
                break;
            } else if (fimDeJogo == 9) {
//                System.out.println("Empate!");
                vez = "Empate";
            }
        }
        return vez;
    }

    private static boolean verificarFinalJogo(String[] tabuleiro){
        return  (tabuleiro[0].equals(tabuleiro[1]) && tabuleiro[1].equals(tabuleiro[2])) ||
                (tabuleiro[3].equals(tabuleiro[4]) && tabuleiro[4].equals(tabuleiro[5])) ||
                (tabuleiro[6].equals(tabuleiro[7]) && tabuleiro[7].equals(tabuleiro[8])) ||
                (tabuleiro[0].equals(tabuleiro[3]) && tabuleiro[3].equals(tabuleiro[6])) ||
                (tabuleiro[1].equals(tabuleiro[4]) && tabuleiro[4].equals(tabuleiro[7])) ||
                (tabuleiro[2].equals(tabuleiro[5]) && tabuleiro[5].equals(tabuleiro[8])) ||
                (tabuleiro[0].equals(tabuleiro[4]) && tabuleiro[4].equals(tabuleiro[8])) ||
                (tabuleiro[2].equals(tabuleiro[4]) && tabuleiro[4].equals(tabuleiro[6]));
    }
}
