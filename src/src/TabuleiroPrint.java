public class TabuleiroPrint {
    public static void tabuleiroPrint(String[] tabuleiro){
        System.out.printf("%n _%s_|_%s_|_%s_%n" +
                " _%s_|_%s_|_%s_%n" +
                " _%s_|_%s_|_%s_%n",tabuleiro[0],tabuleiro[1], tabuleiro[2], tabuleiro[3],tabuleiro[4], tabuleiro[5],tabuleiro[6],tabuleiro[7], tabuleiro[8]);
    }
}
