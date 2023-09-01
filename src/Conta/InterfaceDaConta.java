package Conta;

import java.util.Scanner;

public class InterfaceDaConta {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        Conta interfaces = new Conta();
        String mensagem = "Dados iniciais:";
        String tipoConta = "Corrente";

        System.out.println(mensagem);
        System.out.println("******************************");
        System.out.println("Nome do cliente: %s".formatted(interfaces.getNome()));
        System.out.println("Tipo conta: %s".formatted(tipoConta));
        System.out.println("Saldo atual: %.2f".formatted(interfaces.getSaldo()));
        System.out.println("******************************");

        while (interfaces.opcao != 4){
            System.out.println(interfaces.getMenu());
            interfaces.opcao = dado.nextInt();

            if (interfaces.opcao == 1){
                System.out.println("Saldo atual: %.2f".formatted(interfaces.getSaldo()));
            } else if (interfaces.opcao == 2) {
                System.out.println("Informe o valor a ser transferido:");
                interfaces.transfereValor = dado.nextDouble();

                if (interfaces.transfereValor > interfaces.getSaldo()){
                    System.out.println("Não há saldo para realizar a transferência!");
                } else {
                    System.out.println("Saldo atualizado: %.2f".formatted(interfaces.valorTransferencia()));
                }
            } else if (interfaces.opcao == 3) {
                System.out.println("Informe o valor a ser recebido");
                interfaces.recebeValor = dado.nextDouble();
                System.out.println("Saldo atualizado: %.2f".formatted(interfaces.valorRecebido()));
            } else if (interfaces.opcao != 4) {
                System.out.println("Opção invalida!");
            }
        }
    }


}
