import java.util.Scanner;

public class salario {
    public static void main(String[] args) {
        double valorhora = 10.25, salario;
        int horastrab;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a quantidade de horas trabalhadas: ");
        horastrab = entrada.nextInt();
        entrada.close();
        salario = (horastrab * valorhora);
        System.out.println("O salário será de R$" + salario + " (Valor por hora: R$" + valorhora + ")");
        if (salario < 50) {
            System.out.println("Atenção, Dirija-se à direção do hotel!");
        }
    }
}
