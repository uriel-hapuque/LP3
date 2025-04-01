class ContaBancaria{
    private String titular;
    private double saldo;
    private static int qntdd_contas = 0;
    public ContaBancaria(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
        qntdd_contas++;
    }

    public void ExibirInfo(ContaBancaria conta){
        System.out.println("Titular: " + titular + "\nSaldo: " + saldo + "\n");
    }

    public void Sacar(double valor){
        if(valor <= 0) System.out.println("informe um valor maior que 0!\n");
        System.out.println("saque realizado com sucesso!\n");
        this.saldo -= valor;
    }
    public void Depositar(double valor){
        if(valor <= 0) System.out.println("informe um valor maior que 0!\n");
        System.out.println("deposito realizado com sucesso!\n");
        this.saldo += valor;
    }
    public void Transferir(double valor, ContaBancaria contaDestino){
        if(saldo <= 0) System.out.println("informe um valor maior que 0!\n");
        this.saldo -= valor;
        contaDestino.saldo += valor;
        System.out.println("transferencia realizada com sucesso!\n");
        System.out.println("COMPROVANTE: \nDe: " + this.titular + " Para: " + contaDestino.titular + "\nValor: " + valor + "\n");
    }

    public static int QuantidadeContas(){
        return qntdd_contas;
    }
}