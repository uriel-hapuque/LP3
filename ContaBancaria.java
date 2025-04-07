class ContaBancaria{
    private String titular;
    private double saldo;
    private static int quantidadeContas = 0;
    private Data dataDeNascimento;
    private Data dataDeAbertura;

    public ContaBancaria(String titular, double saldo, Data dataDeNascimento){
        this.titular = titular;
        this.saldo = saldo;
        this.dataDeNascimento = dataDeNascimento;
        this.dataDeAbertura = new Data();
        int idade = dataDeNascimento.CalcularIdade(new Data());
        quantidadeContas++;

        if(idade < 18){
            System.out.println("necessario ser maior de idade para abrir uma conta!");
            return;
        } else if(idade > 100){
            System.out.println("idade invalida!");
            return;
        } else {
            System.out.println("idade valida!");
        }

        System.out.println("conta criada com sucesso!\n" + "titular: " + this.titular + "\nsaldo: " + this.saldo + "\ndata de abertura: " + this.dataDeAbertura + "\n");
    }

    public void Depositar(double valor){
        this.saldo += valor;
        System.out.println("deposito de " + valor + " realizado com sucesso!\ndata da operacao: " + new Data());
    }

    public void Sacar(double valor){
        this.saldo -= valor;
        System.out.println("deposito de " + valor + " realizado com sucesso!\ndata da operacao: " + new Data());
    }

    public void Transferir(double valor, ContaBancaria destinatario){
        if(valor <= 0) System.out.println("informe um valor maior que 0!\n");
        else if(valor > this.saldo) System.out.println("saldo insuficiente!\n");
        this.saldo -= valor;
        destinatario.saldo += valor;
        System.out.println("deposito de " + valor + " realizado com sucesso!\ndata da operacao: " + new Data());
    }
    public static int QuantidadeContas(){
       return quantidadeContas;
    }

    
}