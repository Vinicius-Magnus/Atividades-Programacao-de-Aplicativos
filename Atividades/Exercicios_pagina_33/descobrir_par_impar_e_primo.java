import java.util.Scanner;
public class descobrir_par_impar_e_primo {
    public static void main(String[] args) {
        int num = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira um número:");
        num = entrada.nextInt();
        entrada.close();
        if (num % 2 != 0) {
            System.out.println("O número " + num + " é ímpar.");
        } else {
            System.out.println("O número " + num + " é par.");
        }
        if ((num == 2) || (num == 3) || (num % 2 != 0) && (num % 3 != 0) && (num != 1)) {
            System.out.println("O número " + num + " é primo.");
        } else {
            System.out.println("O número " + num + " não é primo.");
        }
    }
}