public class Placar {
    public static int vitoriasPart1 = 0;
    public static int vitoriasPart2 = 0;
    public static int empate = 0;
    public static void placar(String vencedor, String participante1, String participante2){
        if (vencedor.equals(participante1)) {
            vitoriasPart1++;
        } else if (vencedor.equals(participante2)) {
            vitoriasPart2++;
        }else{
            empate++;
        }
       // System.out.printf("O placar atual é:%n%s: %d;%n%s: %d;%nEmpate: %d.%n", participante1, vitoriasPart1, participante2, vitoriasPart2, empate

        System.out.println("+------------------------------+");
        System.out.println("  -Placar Atual-                ");
        System.out.println("+------------------------------+");
        System.out.printf( " %s->  %d                      \n" , participante1, vitoriasPart1);
        System.out.println("+------------------------------+");
        System.out.printf( " %s-> %d                      \n", participante2 , vitoriasPart2);
        System.out.println("+------------------------------+");
        System.out.printf( " Empate->  %d                 \n",  empate);
        System.out.println("+------------------------------+");

    }
}
