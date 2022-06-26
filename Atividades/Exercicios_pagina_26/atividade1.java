import java.util.Scanner;
public class atividade1 {          
 public static void main(String[] args ){
 Scanner entrada = new Scanner(System.in);
double altura,basemaior,basemenor,area;
System.out.println("Digite a altura:  ");
altura = entrada.nextDouble(); 
System.out.println("Digite a base menor:  ");
basemenor = entrada.nextDouble(); 
System.out.println("Digite a base maior:  ");
basemaior = entrada.nextDouble(); 
area = (altura*(basemenor+basemaior))/2;
System.out.println("======================================");
System.out.println("O valor da área é: "+area);

entrada.close();
}
} 