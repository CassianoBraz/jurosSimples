/*Programe um método que receba um valor double por parâmetro, 
representando uma quantia em dinheiro, e um valor inteiro representando 
a quantidade de dias de rendimento. Retorne o valor com rendimento calculado. 
Considere fixo os juros simples em 0,70% ao mês.
Exemplo:
double valorAtualizado = rendimento( 1250.59, 60 );
Neste caso, o valor retornado seria aproximadamente 1.268,09, que corresponde 
ao valor 1250.59 acrescido de juros de 0,70% ao mês. Como são 60 dias, 
são dois meses, logo a taxa aplicada foi de 1,40%.
*/
import java.text.DecimalFormat;
import java.util.Scanner;

public class Atv1 {
    public static void main(String[] args) {
        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");
        Scanner read = new Scanner(System.in);

        System.out.println("Qual a quantida de dinheiro: ");
        double valorDinheiro = read.nextDouble();

        System.out.println("Quantos dias são: ");
        int ds = read.nextInt();

        double soma = ds / 30;
        double money = valorDinheiro * 0.007;

        System.out.println("O rendimento em: "+soma+" meses.\nTem o valor final: "+decimalFormat.format(((soma*money)+valorDinheiro)));
    }
}
