import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o ano: ");
        int ano = sc.nextInt();
        sc.close();
        
        boolean bissexto = false;
        
        if (ano % 400 == 0) {
            bissexto = true;
        } else if (ano % 4 == 0 && ano % 100 != 0) {
            bissexto = true;
        }
        
        if (bissexto) {
            System.out.println("Ano BISSEXTO");
        } else {
            System.out.println("Não é Bissexto");
        }
    }
}
