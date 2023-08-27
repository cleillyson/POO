package atv2;

public class Data {
    int dia = 0;
    int mes = 0;
    int ano = 0;
    void alteraData (int aDia, int aMes, int aAno){
        this.dia = aDia;
        this.mes = aMes;
        this.ano = aAno;
    }

    void mostraData (){
        String auxiliarDia = "";
        String auxiliarMes = "";
        if (this.dia / 10 == 0){
            auxiliarDia = "0";
        }
        if (this.mes / 10 == 0){
            auxiliarMes = "0";
        }
        System.out.printf("%s%d/%s%d/%d", auxiliarDia, this.dia, auxiliarMes, this.mes, this.ano);
    }

}
