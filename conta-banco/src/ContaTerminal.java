import java.util.Scanner;

import java.util.Scanner;

public class ContaTerminal {

    Integer conta;
    String agencia;
    String titular;
    Float saldo;

    public ContaTerminal(Integer numConta, String agencia, String titular, Float saldo) {
        this.conta = numConta;
        this.agencia = agencia;
        this.titular = titular;
        this.saldo = saldo;
    }

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        Integer conta;
        String agencia;
        String titular;
        Float saldo;

        System.out.println("Informe o nome do titular:");
        titular = scanner.nextLine();
        System.out.println("Informe a agencia:");
        agencia = scanner.nextLine();
        System.out.println("Informe o numero da conta:");
        conta = scanner.nextInt();
        System.out.println("Informe o saldo:");
        saldo = scanner.nextFloat();

        scanner.close();

        ContaTerminal contaBanco = new ContaTerminal(conta, agencia, titular, saldo);

        contaBanco.imprimirMensagem();

    }

    public void imprimirMensagem() {
        System.out.printf(
                "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %f já está disponível para saque",
                this.titular, this.agencia, this.conta, this.saldo);
    }

}
