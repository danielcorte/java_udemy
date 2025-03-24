package section9ThisEncapsConstrOverchar.Exercises;

public class Product {

    int num_conta;
    String nome;
    double deposito_inicial = 0;

    public Product() {

    }

    public Product(int num_conta, String nome) {
        this.num_conta = num_conta;
        this.nome = nome;
    }

    public Product(int num_conta, String nome, double deposito_inicial) {

        this.num_conta = num_conta;
        this.nome = nome;
        this.deposito_inicial = deposito_inicial;
    }

    public int getNum_conta() {
        return num_conta;
    }

    public void setNum_conta(int num_conta) {
        this.num_conta = num_conta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getDeposito_inicial() {
        return deposito_inicial;
    }

}
