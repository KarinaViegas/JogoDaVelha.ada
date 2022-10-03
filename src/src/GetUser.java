import java.util.Scanner;

public class GetUser {
    public static String getUser(String opcaoIcone){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nome do jogador %s:%n", opcaoIcone);
        return scanner.nextLine();
    }
}
