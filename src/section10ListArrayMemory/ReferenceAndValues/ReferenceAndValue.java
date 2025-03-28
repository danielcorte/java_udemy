package section10ListArrayMemory.ReferenceAndValues;

public class ReferenceAndValue {

    /* Variáveis cujo tipo são classes não devem ser entendidas
    como caixas, mas sim "tentaculos" (ponteiros) para caixas*/

    public static void main(String[] args) {

        // Product p1, p2; --> Stack [ 0x100358 ] -> p1 | [   ] -> p2

        // p1 = new Product("TV", 900.00, 0); --> Heap = 0x100358:
        //                                              [ TV | 900 | 0 ]
        // p2 = p1; p2 passa a apontar para onde p1 aponta

        // p2 = null; [ X ]
    }
}
