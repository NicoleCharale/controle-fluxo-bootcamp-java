import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        try {
            contar(num1, num2);
        }
        catch (ParametrosInvalidosException exception) {
            System.out.print(exception.getMessage());
        }
    }

    private static void contar(int num1, int num2) throws ParametrosInvalidosException {
        if(num1 >= num2) {
            throw new ParametrosInvalidosException("\nO segundo parâmetro deve ser maior que o primeiro!\n");
        }
        else {
            int interacoes = num2 - num1;

            for(int i = 1; i <= interacoes; i++) {
                System.out.printf("\nImprimindo o número %d", i);
            }
        }
    }
}
