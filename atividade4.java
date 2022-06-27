public class par_e_impar {
    public static void main(String[] args) {
        int soma = 0, multiplicacao = 0;
        for (int i = 1; i <= 30; i++) {
            if (i % 2 != 0) {
                soma = (soma + i);
            } else {
                multiplicacao = (multiplicacao + i);
            }
        }
        System.out.println("Soma dos ímpares: " + soma + " Multiplicação dos pares: " + multiplicacao);
    }
}
