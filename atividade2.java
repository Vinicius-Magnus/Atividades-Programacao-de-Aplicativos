import java.util.Scanner;
public class atividade2 {          
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
System.out.println("O valor total da área é: "+area);
System.out.println("O valor arredondado da área é: "+ Math.round(area));

entrada.close();
}
} 