package java_udemy.section5conditionalStructure.optionalSyntax.ternaryCondition;

public class Main {

    public static void main(String[] args) {
        // Estrutura opcional ao if-else quando se deseja decidir um valor com base em uma condição

        // sintqxe = ( condição ) ? valor_se_verdadeiro : valor_se_falso

        // Exemplo:
        // UTILIZANDO IF-ELSE
        double preco = 34.5;
        double desconto;
        if (preco < 20.0) {
            desconto = preco * 0.1;
        } else {
            desconto = preco * 0.05;
        }

        // UTILIZANDO TERNARIO
        double preco_ternario = 34.5;
        double desconto_ternario = (preco_ternario < 20.0) ? preco_ternario * 0.1 : preco_ternario * 0.05;
    }
}
