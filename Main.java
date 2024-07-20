
import java.util.InputMismatchException;
import java.util.Scanner;

class Main {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        NumerosPrimos numerosPrimos = new NumerosPrimos();
        Composicao composicao = new Composicao();

        boolean continuaLoop = true;

        do {
            try
            {
                System.out.printf("%nValor: ");
                composicao.setValor(scanner.nextInt());

                numerosPrimos.setLimite(composicao.getValor());
                composicao.setLista(numerosPrimos.primo());
                composicao.decompondo();

                continuaLoop = false;

            }catch (InputMismatchException inputMismatchException) {

                System.err.printf("%nException: " + inputMismatchException.getMessage());
                scanner.nextLine(); // Limpa o buffer do scanner
                System.out.printf("Os valores precisam ser todos inteiros.%n%n");

            }catch (IllegalArgumentException illegalArgumentException) {
                System.err.printf("%nErro: %s", illegalArgumentException.getMessage());
            }
        } while (continuaLoop);
    }
}
