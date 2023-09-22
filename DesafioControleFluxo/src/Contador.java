import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Digite o primeiro parâmetro: ");
            int parametroUm = scanner.nextInt();
            System.out.println("Digite o segundo parâmetro: ");
            int parametroDois = scanner.nextInt();

            contar(parametroUm, parametroDois);

        }  catch (InputMismatchException | ParametrosInvalidosException e) {
            if(e instanceof InputMismatchException){
                System.out.println("Os parâmetros inseridos devem ser números inteiros");
            } else {
                System.out.println(e.getMessage());
            }
        }
        scanner.close();
    }
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if(parametroUm > parametroDois){
            throw new ParametrosInvalidosException("O primeiro parâmetro precisa ser menor que o segundo parâmetro.");
        }
        int maximo = parametroDois - parametroUm;
        for(int i = 1; i <= maximo; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
