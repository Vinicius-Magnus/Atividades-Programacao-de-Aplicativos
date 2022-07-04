public class atividade5 {
    public static void main(String[] args) {
        for (int i = 2; i < 123; i++) { // 1 não é primo
            if ((i == 2) || (i == 3) || (i % 2 != 0) && (i % 3 != 0)) {
                System.out.println(i + " é um número primo.");
            }
        }
    }
}
