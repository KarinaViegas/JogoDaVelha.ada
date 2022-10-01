import java.util.Scanner;

public class GetUser {
    public static String getUser(String opcaoSimbolo){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nome do jogador %s:%n", opcaoSimbolo);
        scanner.close();
        return scanner.nextLine();
    }
}
