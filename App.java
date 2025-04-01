public class App {
    public static void main(String[] args){
        ContaBancaria conta1 = new ContaBancaria("uriel", 100.00);
        ContaBancaria conta2 = new ContaBancaria("betao", 100.00);

        conta1.Transferir(50.00, conta2);
        conta2.ExibirInfo(conta2);
        conta1.ExibirInfo(conta1);

        Banco.QuantidadeContas();
    }
}
