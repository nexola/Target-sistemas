public class Questao05 {
    public static void main(String[] args) {

        String texto = "Exemplo de texto para inverter";
        StringBuilder invertido = new StringBuilder();

        for (int i = texto.length() - 1; i >= 0; i--) {
            invertido.append(texto.charAt(i));
        }

        System.out.println("Texto original: " + texto);
        System.out.println("Texto invertido: " + invertido);
    }
}

