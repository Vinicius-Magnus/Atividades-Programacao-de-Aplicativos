import javax.swing.JOptionPane;
public class atividade10 {
    public static void main(String[] args){
    double peso= 0 ,altura = 0,imc = 0;
    String resposta1,resposta2,categ = "";
    try
    {
        resposta1 = JOptionPane.showInputDialog("informe seu peso");
        peso = Float.parseFloat(resposta1);
        resposta2 = JOptionPane.showInputDialog("informe a sua altura");
        altura = Float.parseFloat(resposta2);
        imc = peso/Math.pow(altura,2);
    }
    catch(NumberFormatException erro)
    {

    }
    imc = peso/Math.pow(altura,2); 
    if (imc < 18.5){
        categ = "Peso abaixo do normal.";
    }
    else if ((imc >= 18.5) && (imc <=24.4)){
        categ = "Peso ideal.";
    }
    else if ((imc >= 24.5) && (imc <=29.9)){
        categ = "Pré-obesidade.";
    }
    else if ((imc >= 30) && (imc <=34.9)){
        categ = "Obesidade classe I";
    }
    else if ((imc >= 35) && (imc <=39.9)){
        categ = "Obesidade severa";
    }
    else if (imc > 39){
        categ = "Obesidade mórbida";
    }
    JOptionPane.showMessageDialog(null,"seu imc é " + Math.round(imc) + " e a sua categoria é: " + categ);
}}