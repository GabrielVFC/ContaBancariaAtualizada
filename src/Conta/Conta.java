package Conta;

public class Conta {
    private String nome = "Gabriel Vinicius";
    private String menu = """
                Digite sua opção:
                1 - Consultar saldo
                2 - Transferir pix
                3 - Receber pix
                4 - Sair
                """;
     private Double saldo = 1600.00;
     Double transfereValor;
     Double recebeValor;

    Integer opcao = 0;

    double valorTransferencia (){
        return saldo -= transfereValor;
    }

    double valorRecebido (){
        return saldo += recebeValor;
    }
    public Double getSaldo (){
        return saldo;
    }
    public String getNome (){
        return nome;
    }
    public String getMenu (){
        return menu;
    }
}
