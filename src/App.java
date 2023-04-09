import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        double valorhora;
        double horastrabmes;
        double totalsalariomes;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o valor que ganha por hora: ");
        valorhora = teclado.nextDouble();

        System.out.println("Digite a quantidade de horas trabalhadas no mes: ");
        horastrabmes = teclado.nextDouble();

        totalsalariomes = valorhora * horastrabmes;

        System.out.printf("Salário do mês é:" + totalsalariomes);

    }

}
