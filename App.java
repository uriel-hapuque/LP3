public class App{
    public static void main(String[] args){
        Data data1 = new Data(11, 8, 1996);
        Data data2 = new Data(10, 11, 2003);
        ContaBancaria conta1 = new ContaBancaria("beltrano", 50.00, data1);
        ContaBancaria conta2 = new ContaBancaria("ciclano", 50.00, data2);
        conta1.Transferir(50.00, conta2);
    }
}