package atv4;
//Classe criada para facilitar a crianção da data
public class Data {
    private int dia = 0;
    private int mes = 0;
    private int ano = 0;
    public void alteraData (int aDia, int aMes, int aAno){
        this.dia = aDia;
        this.mes = aMes;
        this.ano = aAno;
    }

    public void mostraData (){
        String auxiliarDia = "";
        String auxiliarMes = "";
        if (this.dia / 10 == 0){
            auxiliarDia = "0";
        }
        if (this.mes / 10 == 0){
            auxiliarMes = "0";
        }
        System.out.printf("%s%d/%s%d/%d\n", auxiliarDia, this.dia, auxiliarMes, this.mes, this.ano);
    }

}
