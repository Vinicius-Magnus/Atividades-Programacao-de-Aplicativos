import java.util.Scanner;

public class atividade8 {
    public static void main(String[] args) {
        String medida = "";
        char medida1;
        int valor;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o peso:");
        valor = entrada.nextInt();
        System.out.println("Para qual medida você deseja converter? (L = libra, Q = Quilo");
        medida = entrada.next();
        entrada.close();
        medida1 = medida.charAt(0);
        if ((medida1 == 'Q') || (medida1 == 'q')) {
            System.out.println(valor + " libras em quilos são: " + (Math.round(valor / 2.205)) + "kg");
        } else if ((medida1 == 'L') || (medida1 == 'l'))
            System.out.println(valor + " quilos em libras são: " + (Math.round(valor * 2.205)) + "lb");
    }
}
