package Exercicious;
import java.util.Scanner;
public class SimuladorDeCarneDePagamento {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Qual é o valor total da compra? ");
        double valorCompra = sc.nextDouble();

        System.out.print("Quer parcelar em quantas vezes (2 a 12)? ");
        int quantasVezes = sc.nextInt();


        while (quantasVezes<2 || quantasVezes>12){
            System.out.print("Número de parcelas inválido! Digite um valor de 2 a 12: ");
            quantasVezes = sc.nextInt();
        }

        double valorParcela = valorCompra/quantasVezes;
        if (quantasVezes > 6){
            valorParcela *= 1.02;
        }

        System.out.println("Cliente: "+nome);
        
        for(int parcela=1; parcela<=quantasVezes; parcela++){
            System.out.printf("Parcela: "+parcela+"/"+quantasVezes+": R$%.2f%n",valorParcela);

        }

        double total = valorParcela*quantasVezes;
        System.out.println("Total: "+total);
    }
}
