package section9ThisEncapsConstrOverchar.Construct;

public class Constructs {

    /*
     CONSTRUTOR
        - É uma operação especial da classe, que executa
        no momento da instanciação do objeto

        - Uso comuns:
            - Iniciar valores dos atributos

            - Permitir ou obrigar que o objeto receba dados
              dependências no momento de sua instanciação
              (injeção de dependência)

            - Se um construtor customizado não for especificado,
              a classe disponibiliza o construtor padrão:
                Product p = new Product();

            - É possivel especificar mais de um construtor na
              mesma classe (sobrecarga).
     */

    public static void main(String[] args) {

        /*
        Para criarmos um método construtor
        fazemos uma declaração pública de metodo
        com o nome da classe, e passamos de
        parâmetro os atributos da classe, e
        denteo da classe chamamos os atributos
        dela usando this, e agregamos o valor do
        método a ela, exemplo:

        public Construct(String name, double price, int quantity) {
            this.name = name;
            this.price = price;
            this.quantity = quantity;
    }
        */
    }
}
