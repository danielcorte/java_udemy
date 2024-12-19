package java_udemy.section5conditionalStructure.optionalSyntax.scopeAndInitialization;

public class Main {

    public static void main(String[] args) {

        // Escopo de uma variável: é a região do programa onde a variável é válida, ou seja, onde ela pode ser referenciada

        // Uma variável não pode ser usada se não for iniciada

        // Falaremos de escopo de métodos no Cápitulo 5

        // Inicialização
        double price;

//        System.out.println(price); // Variable 'price' might not have been initialized

        // A varíavel foi declarada porém não foi iniciada, então gera um erro

        double price_1 = 300.0;

        System.out.println(price_1);

        // Agora a variável foi declarada e iniciada, então o código funciona sem problemas

        // Escopo
        if (price_1 < 200.00) {
            double discount = price_1 * 0.1;
        }

//        System.out.println(discount); // Cannot resolve symbol 'discount'

        // discount existe apenas dentro do escopo do if, então para o print 'discount' não existe
        double discount_1;

        if (price_1 < 200.00) {
            discount_1 = price_1 * 0.1;
        }

//        System.out.println(discount_1); // Variable 'discount_1' might not have been initialized

        // A variável foi declarada, porém ela só sera iniciada se o if for true, então agora o print reconhece
        // a variável 'discount_1' porém talvez ela não seja iniciada para ser usada pelo print

        double discount_2;

        if (price_1 < 200.00) {
            discount_2 = price_1 * 0.1;
        } else {
            discount_2 = 0;
        }

        System.out.println(discount_2);

        // Agora a variável está declarada, e independente da condição será declarada, então não tem como ocorrer
        // mais nenhum erro
    }
}
