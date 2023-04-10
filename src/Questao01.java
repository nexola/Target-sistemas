public class Questao01 {
    public static void main(String[] args) {
        int indice = 13;
        int soma = 0;
        int k = 0;

        while (k < indice) {
            k += 1;
            soma += k;
        }

        System.out.printf("O valor da variável soma ao final do processamento será: %d", soma);
    }
}