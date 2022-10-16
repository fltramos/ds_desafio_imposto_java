import java.util.Locale;
import java.util.Scanner;

public class Desafio_Imposto_Java {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double salario, rendaAnualSalario, rendaAnualServico, rendaAnualCapital, gastosMedicos, gastosEducacao;
        double impostoSalario, impostoServicos, impostoCapital, maximoDedutivel, gastosDedutiveis, impostoBruto;
        double abatimento, impostoLiquido;

        System.out.print("Renda anual com salário: ");
        rendaAnualSalario = sc.nextDouble();
        System.out.print("Renda anual com prestação de serviço: ");
        rendaAnualServico = sc.nextDouble();
        System.out.print("Renda anual com ganho de capital: ");
        rendaAnualCapital = sc.nextDouble();
        System.out.print("Gastos médicos: ");
        gastosMedicos = sc.nextDouble();
        System.out.print("Gastos educacionais: ");
        gastosEducacao = sc.nextDouble();

        salario = rendaAnualSalario / 12;

        if (salario < 3000.00) {
            impostoSalario = 0.0;
        } else if (salario < 5000.00) {
            impostoSalario = rendaAnualSalario * 0.1;
        } else {
            impostoSalario = rendaAnualSalario * 0.2;
        }

        impostoServicos = rendaAnualServico * 0.15;
        impostoCapital = rendaAnualCapital * 0.2;
        gastosDedutiveis = gastosMedicos + gastosEducacao;
        impostoBruto = impostoSalario + impostoServicos + impostoCapital;
        maximoDedutivel = impostoBruto * 0.3;

        if (gastosDedutiveis > maximoDedutivel) {
            abatimento = maximoDedutivel;
        }else {
            abatimento = gastosDedutiveis;
        }

        impostoLiquido = impostoBruto - abatimento;

        System.out.println();

        System.out.println("RELATÓRIO DE IMPOSTO DE RENDA");

        System.out.println();

        System.out.println("CONSOLIDADO DE RENDA:");
        System.out.printf("Imposto sobre salário: %.2f%n", impostoSalario);
        System.out.printf("Imposto sobre serviços: %.2f%n", impostoServicos);
        System.out.printf("Imposto sobre ganho de capital: %.2f%n", impostoCapital);

        System.out.println();

        System.out.println("DEDUÇÕES:");
        System.out.printf("Máximo dedutível: %.2f%n", maximoDedutivel);
        System.out.printf("Gastos dedutíveis: %.2f%n", gastosDedutiveis);

        System.out.println();

        System.out.println("RESUMO:");
        System.out.printf("Imposto bruto total: %.2f%n", impostoBruto);
        System.out.printf("Abatimento: %.2f%n", abatimento);
        System.out.printf("Imposto devido: %.2f%n", impostoLiquido);

        sc.close();
    }
}
