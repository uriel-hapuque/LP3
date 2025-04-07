class Cliente {
    Data dataNascimento;
    String nomeCompleto;

    public Cliente(String nomeCompleto, Data dataNascimento) {
        this.nomeCompleto = nomeCompleto;
        this.dataNascimento = dataNascimento;
        int idade = dataNascimento.CalcularIdade(new Data());

        if(idade < 18){
            System.out.println("necessario ser maior de idade para abrir uma conta!");
            return;
        } else if(idade > 100){
            System.out.println("idade invalida!");
            return;
        } else {
            System.out.println("idade valida!");
        }
    }
}
