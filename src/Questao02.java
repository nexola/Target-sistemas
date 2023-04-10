import java.util.Scanner;

public class Questao02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número para verificar se ele pertence à sequência de Fibonacci: ");
        int n = sc.nextInt();
        sc.close();

        int a = 0;
        int b = 1;
        int fib = 0;

        while (fib < n) {
            fib = a + b;
            a = b;
            b = fib;
        }

        if (fib == n) {
            System.out.println(n + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(n + " não pertence à sequência de Fibonacci.");
        }
    }
}

