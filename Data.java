import java.time.LocalDate;

class Data{
    private int dia;
    private int mes;
    private int ano;

    public Data(){
        LocalDate dataAtual = LocalDate.now();
        String dataAtualString = dataAtual.toString();
        this.dia = Integer.parseInt(dataAtualString.split("-")[2]);
        this.mes = Integer.parseInt(dataAtualString.split("-")[1]);
        this.ano = Integer.parseInt(dataAtualString.split("-")[0]);
        if(!DataValida(this)) return;
    }

    public Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        if(!DataValida(this)) return;
    }

    public Data(String data){
        this.dia = Integer.parseInt(data.split("-")[2]);
        this.mes = Integer.parseInt(data.split("-")[1]);
        this.ano = Integer.parseInt(data.split("-")[0]);
        if(!DataValida(this)) return;
    }

    private Boolean DataValida(Data data){
        if(data.dia <= 0){
            System.out.println("dia invalido!");
            return false;  
        } 
        if(data.ano < 0){
            System.out.println("ano invalido!"); 
            return false;
        } 
        switch (data.mes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return data.dia <= 31;
            case 4: case 6: case 9: case 11:
                return data.dia <= 30;
            case 2:
                return data.dia <= 29;
            default:
                System.out.println("mes invalido!");
                return false;
        }
    }

    public Boolean IsEqual(Data data){
        if(this.dia == data.dia && this.mes == data.mes && this.ano == data.ano){
            System.out.println("datas iguais!");
            return true;
        }
        System.out.println("datas diferentes!");
        return false;
    }

    public String toString(){
        return this.dia + "-" + this.mes + "-" + this.ano;
    }

    public int CalcularIdade(Data data){
        int idade = data.ano - this.ano;
        if(data.mes < this.mes || (data.mes == this.mes && data.dia < this.dia)){
            idade--;
        }
        return idade;
    }
}