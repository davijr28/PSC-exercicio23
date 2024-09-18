
import java.util.Scanner;

public class Exercicio23 {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);
        int start, end;
        int soma = 0;
        System.out.println("Digite o valor inicial: ");
        start = scanner.nextInt();
        System.out.println("Digite o valor final: ");
        end = scanner.nextInt();
        while (start <= end) {
            soma += start;
            start++;
        }
        System.out.println("O valor da soma é: " + soma);
    }
}
