import java.util.Scanner;
import javax.swing.JOptionPane;
public class atividade9{
    public static void main(String[] args) {
        int idade;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual a sua idade?");
     idade = entrada.nextInt();  
     entrada.close();
     if (idade <= 3){
        JOptionPane.showMessageDialog(null,"bebê");
     } else if ((idade >3) && (idade<=9)){
        JOptionPane.showMessageDialog(null,"criança");
     }  else if ((idade >9) && (idade<=13)){
        JOptionPane.showMessageDialog(null,"pré-adolescente");
    } else if ((idade >13) && (idade<=17)){
        JOptionPane.showMessageDialog(null,"adolescente");
    } else if ((idade > 17) && (idade<=25)){
        JOptionPane.showMessageDialog(null,"jovem adulto");
    }  else if ((idade >25) && (idade<=39)){
        JOptionPane.showMessageDialog(null,"adulto");
    }  else if (idade >39){
        JOptionPane.showMessageDialog(null,"💀");
    }
    }
}