package section9ThisEncapsConstrOverchar.This;

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

public class This {

    /*
    É uma referência para o próprio objeto

    - Usos comuns:
        - Diferenciar atributos de variáveis locais
        - Passar o próprio objeto como argumento na
            chamada de um método ou construtor.

            na memória:

                (escopo do construtor)
                    name = [ "TV" ]
                    price = [ 1500.0 ]
                    quantity = [ 0 ]

                product -> [     |      |     ]
                            name  price  quant
     */


    /*
    PASSAR O PROPRIO OBJETO COMO ARGUMENTO

    placeNewPiece('e', 1, new King(board, Color.WHITE, this));
     */
}
