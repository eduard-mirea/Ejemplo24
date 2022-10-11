import java.util.Scanner;
import java.util.concurrent.LinkedTransferQueue;

public class Ejemplo24 {
    public static void main(String[] args) {

        int numero;
        int factorial = 1;

        Scanner inputValue = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        numero = inputValue.nextInt();
        inputValue.close();

        for (int i = 2; i <= numero; i++){
            factorial *= numero;
        }
        System.out.println("El factorial de " + numero + " es " + factorial);
    }
}
