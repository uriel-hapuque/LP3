class ContaBancaria{
    public String titular;
    public double saldo;
    public int qntdd_contas;
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

    public int QuantidadeContas(){
        return qntdd_contas;
    }
}

public class App {
    public static void main(String[] args){
        ContaBancaria conta1 = new ContaBancaria("uriel", 100.00);
        ContaBancaria conta2 = new ContaBancaria("betao", 100.00);

        conta1.Transferir(50.00, conta2);
        conta2.ExibirInfo(conta2);
        conta1.ExibirInfo(conta1);
    }
}
