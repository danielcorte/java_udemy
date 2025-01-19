package section6repetitiveStructure.exercicios;

import java.util.Scanner;

public class ExWhile3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        /*
        Um Posto de combustíveis deseja determinar qual
        de seus produtos tem a preferência de seus clientes.
        Escreva um algoritmo para ler o tipo de combustível
        abastecido (codificado da seguinte forma:
        1.Álcool 2.Gasolina 3.Diesel 4.Fim).
        Caso o usuário informe um código inválido (fora da faixa de 1 a 4)
        deve ser solicitado um novo código (até que seja válido).
        O programa será encerrado quando o código informado
        for o número 4. Deve ser escrito a mensagem: "MUITO OBRIGADO"
        e a quantidade de clientes que abasteceram cada
        tipo de combustível, conforme exemplo

        */
        int alcool = 0, gasolina = 0, diesel = 0, opc = 0;

        while (opc != 4) {
            System.out.print("[1] - Alcool\n[2] - Gasolina\n[3] - Diesel\n[4] - Sair\nQual a sua escolha:");
            opc = sc.nextInt();

            if (opc == 1) alcool += 1;
            else if (opc == 2) gasolina += 1;
            else if (opc == 3) diesel += 1;
        }
        System.out.println("Muito obrigado!!");
        System.out.println("Quantidade de clientes que preferem: ");
        System.out.printf("Alcool = %d\nGasolina = %d\nDiesel = %d", alcool, gasolina, diesel);

    }
}
