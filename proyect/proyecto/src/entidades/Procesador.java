package entidades;

import java.util.ArrayList;

public class Procesador {
    ArrayList<Procesador> procesadores = new ArrayList<>();
    private String generacion;
    private String serie;
    private String referencia;
    
    // Constructor vacío para evitar errores
    public Procesador(){}
    
    public Procesador(String generacion, String serie, String referencia) {
        this.generacion = generacion;
        this.serie = serie;
        this.referencia = referencia;
    }

    public String getGeneracion() {
        return generacion;
    }

    public void setGeneracion(String generacion) {
        this.generacion = generacion;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Procesador{");
        sb.append("\nGeneracion: ").append(generacion);
        sb.append("\nSerie: ").append(serie);
        sb.append("\nReferencia: ").append(referencia);
        sb.append("\n}");
        return sb.toString();
    }
    
    public void catalogoProcesador(){
        //Procesadores
            //AMD
                //AM3
        procesadores.add(new Procesador("1","FX-Series","FX-4100"));
        procesadores.add(new Procesador("1","FX-Series","FX-4110"));
        procesadores.add(new Procesador("1","FX-Series","FX-4120"));
        procesadores.add(new Procesador("1","FX-Series","FX-4130"));
        procesadores.add(new Procesador("1","FX-Series","FX-4150"));
        procesadores.add(new Procesador("1","FX-Series","FX-4170"));
        procesadores.add(new Procesador("2","FX-Series","FX-4200"));
        procesadores.add(new Procesador("3","FX-Series","FX-4300"));
        procesadores.add(new Procesador("3","FX-Series","FX-4320"));
        procesadores.add(new Procesador("3","FX-Series","FX-4330"));
        procesadores.add(new Procesador("3","FX-Series","FX-4350"));
        procesadores.add(new Procesador("1","FX-Series","FX-6100"));
        procesadores.add(new Procesador("1","FX-Series","FX-6120"));
        procesadores.add(new Procesador("1","FX-Series","FX-6130"));
        procesadores.add(new Procesador("3","FX-Series","FX-6330"));
        procesadores.add(new Procesador("3","FX-Series","FX-6350"));
        procesadores.add(new Procesador("1","FX-Series","FX-8100"));
        procesadores.add(new Procesador("1","FX-Series","FX-8110"));
        procesadores.add(new Procesador("1","FX-Series","FX-8120"));
        procesadores.add(new Procesador("1","FX-Series","FX-8130p"));
        procesadores.add(new Procesador("1","FX-Series","FX-8140"));
        procesadores.add(new Procesador("1","FX-Series","FX-8150"));
        procesadores.add(new Procesador("1","FX-Series","FX-8170"));
        procesadores.add(new Procesador("3","FX-Series","FX-8300"));
        procesadores.add(new Procesador("3","FX-Series","FX-8310"));
        procesadores.add(new Procesador("3","FX-Series","FX-8320"));
        procesadores.add(new Procesador("3","FX-Series","FX-8320E"));
        procesadores.add(new Procesador("3","FX-Series","FX-8350"));
        procesadores.add(new Procesador("3","FX-Series","FX-8370"));
        procesadores.add(new Procesador("3","FX-Series","FX-8370E"));
        procesadores.add(new Procesador("3","FX-Series","FX-9370"));
        procesadores.add(new Procesador("5","FX-Series","FX-9590"));
        procesadores.add(new Procesador("1","FX-Series","FX-B4150"));

        //FM2
        procesadores.add(new Procesador("2","SempronX2","240"));
        procesadores.add(new Procesador("2","SempronX2","250"));
        procesadores.add(new Procesador("3","AthlonX2","340"));
        procesadores.add(new Procesador("3","AthlonX2","350"));
        procesadores.add(new Procesador("3","AthlonX2","370K"));
        procesadores.add(new Procesador("7","AthlonX4","730"));
        procesadores.add(new Procesador("7","AthlonX4","740"));
        procesadores.add(new Procesador("7","AthlonX4","750"));
        procesadores.add(new Procesador("7","AthlonX4","750K"));
        procesadores.add(new Procesador("7","AthlonX4","760K"));
        procesadores.add(new Procesador("3","FirePro","A300"));
        procesadores.add(new Procesador("3","FirePro","A320"));
        procesadores.add(new Procesador("4","A4-Series","A4-4000"));
        procesadores.add(new Procesador("4","A4-Series","A4-4020"));
        procesadores.add(new Procesador("5","A4-Series","A4-5300"));
        procesadores.add(new Procesador("5","A4-Series","A4-5300B"));
        procesadores.add(new Procesador("6","A4-Series","A4-6300"));
        procesadores.add(new Procesador("6","A4-Series","A4-6300B"));
        procesadores.add(new Procesador("6","A4-Series","A4-6320"));
        procesadores.add(new Procesador("6","A4-Series","A4-6320B"));
        procesadores.add(new Procesador("7","A4-Series","A4-7300"));
        procesadores.add(new Procesador("7","A4-Series","A4 PRO-7300"));
        procesadores.add(new Procesador("5","A6-Series","A6-5400B"));
        procesadores.add(new Procesador("5","A6-Series","A6-5400K"));
        procesadores.add(new Procesador("6","A6-Series","A6-6400B"));
        procesadores.add(new Procesador("6","A6-Series","A6-6400K"));
        procesadores.add(new Procesador("6","A6-Series","A6-6420K"));
        procesadores.add(new Procesador("5","A8-Series","A8-5500"));
        procesadores.add(new Procesador("5","A8-Series","A8-5500B"));
        procesadores.add(new Procesador("5","A8-Series","A8-5600K"));
        procesadores.add(new Procesador("6","A8-Series","A8-6500"));
        procesadores.add(new Procesador("6","A8-Series","A8-6500B"));
        procesadores.add(new Procesador("6","A8-Series","A8-6500T"));
        procesadores.add(new Procesador("6","A8-Series","A8-6600K"));
        procesadores.add(new Procesador("5","A10-Series","A10-5700"));
        procesadores.add(new Procesador("5","A10-Series","A10-5800B"));
        procesadores.add(new Procesador("5","A10-Series","A10-5800K"));
        procesadores.add(new Procesador("6","A10-Series","A10-6700"));
        procesadores.add(new Procesador("6","A10-Series","A10-6700T"));
        procesadores.add(new Procesador("6","A10-Series","A10-6790B"));
        procesadores.add(new Procesador("6","A10-Series","A10-6790K"));
        procesadores.add(new Procesador("6","A10-Series","A10-6800B"));
        procesadores.add(new Procesador("6","A10-Series","A10-6800K"));
        procesadores.add(new Procesador("0","FX-Series","FX-670K"));

        //FM2+
        procesadores.add(new Procesador("0","Athlon X4", "830"));
        procesadores.add(new Procesador("0","Athlon X4", "835"));
        procesadores.add(new Procesador("0","Athlon X4", "840"));
        procesadores.add(new Procesador("0","Athlon X4", "845"));
        procesadores.add(new Procesador("0","Athlon X4", "850"));
        procesadores.add(new Procesador("0","Athlon X4", "860K"));
        procesadores.add(new Procesador("0","Athlon X4", "870K"));
        procesadores.add(new Procesador("0","Athlon X4", "880K"));
        procesadores.add(new Procesador("7","A4-Series", "A4-7300"));
        procesadores.add(new Procesador("7","A4-Series", "A4 PRO-7350B"));
        procesadores.add(new Procesador("7","A6-Series", "A6 PRO-7400B"));
        procesadores.add(new Procesador("7","A6-Series", "A6-7400K"));
        procesadores.add(new Procesador("7","A6-Series", "A6-7470K"));
        procesadores.add(new Procesador("7","A6-Series", "A6-7480"));
        procesadores.add(new Procesador("8","A6-Series", "A6-8550"));
        procesadores.add(new Procesador("8","A6-Series", "A6-8550K"));
        procesadores.add(new Procesador("7","A8-Series", "A8 PRO-7600B"));
        procesadores.add(new Procesador("7","A8-Series", "A8-7500"));
        procesadores.add(new Procesador("7","A8-Series", "A8-7600"));
        procesadores.add(new Procesador("7","A8-Series", "A8-7650K"));
        procesadores.add(new Procesador("7","A8-Series", "A8-7670K"));
        procesadores.add(new Procesador("7","A8-Series", "A8-7680"));
        procesadores.add(new Procesador("7","A8-Series", "A8-7690K"));
        procesadores.add(new Procesador("8","A8-Series", "A8-8650"));
        procesadores.add(new Procesador("8","A8-Series", "A8-8650K"));
        procesadores.add(new Procesador("7","A10-Series", "A10 PRO-7800B"));
        procesadores.add(new Procesador("7","A10-Series", "A10 PRO-7850B"));
        procesadores.add(new Procesador("7","A10-Series", "A10-7700K"));
        procesadores.add(new Procesador("7","A10-Series", "A10-7800"));
        procesadores.add(new Procesador("7","A10-Series", "A10-7850K"));
        procesadores.add(new Procesador("7","A10-Series", "A10-7860K"));
        procesadores.add(new Procesador("7","A10-Series", "A10-7870K"));
        procesadores.add(new Procesador("7","A10-Series", "A10-7890K"));
        procesadores.add(new Procesador("8","A10-Series", "A10-8750"));
        procesadores.add(new Procesador("8","A10-Series", "A10-8850K"));
        procesadores.add(new Procesador("0","FX-Series", "FX-770K"));
        procesadores.add(new Procesador("0","FX-Series", "FX-870K"));
        procesadores.add(new Procesador("8","A10-Series", "PRO A10-8750B"));
        procesadores.add(new Procesador("8","A10-Series", "PRO A10-8850B"));
        procesadores.add(new Procesador("8","A4-Series", "PRO A4-8350B"));

        //AM1
        procesadores.add(new Procesador("0","AthlonX4","530"));
        procesadores.add(new Procesador("0","AthlonX4","550"));
        procesadores.add(new Procesador("2","Sempron","2650"));
        procesadores.add(new Procesador("3","Sempron","3850"));
        procesadores.add(new Procesador("5","Athlon","5150"));
        procesadores.add(new Procesador("5","Athlon","5350"));
        procesadores.add(new Procesador("5","Athlon","5370"));

        //AM4
        procesadores.add(new Procesador("2","Athlon", "200GE"));
        procesadores.add(new Procesador("2","Athlon PRO", "200GE"));
        procesadores.add(new Procesador("2","Athlon", "220GE"));
        procesadores.add(new Procesador("2","Athlon", "240GE"));
        procesadores.add(new Procesador("3","Athlon", "300GE"));
        procesadores.add(new Procesador("3","Athlon PRO", "300GE"));
        procesadores.add(new Procesador("3","Athlon", "320GE"));
        procesadores.add(new Procesador("9","Athlon X4", "940"));
        procesadores.add(new Procesador("9","Athlon X4", "950"));
        procesadores.add(new Procesador("9","Athlon X4", "970"));
        procesadores.add(new Procesador("1","Ryzen 3", "1200"));
        procesadores.add(new Procesador("1","Ryzen 3 PRO", "1200"));
        procesadores.add(new Procesador("1","Ryzen 3 PRO", "1300"));
        procesadores.add(new Procesador("1","Ryzen 3", "1300X"));
        procesadores.add(new Procesador("1","Ryzen 5", "1400"));
        procesadores.add(new Procesador("1","Ryzen 5 PRO", "1500"));
        procesadores.add(new Procesador("1","Ryzen 5", "1500X"));
        procesadores.add(new Procesador("1","Ryzen 5", "1600"));
        procesadores.add(new Procesador("1","Ryzen 5 PRO", "1600"));
        procesadores.add(new Procesador("1","Ryzen 5", "1600X"));
        procesadores.add(new Procesador("1","Ryzen 7", "1700"));
        procesadores.add(new Procesador("1","Ryzen 7 PRO", "1700"));
        procesadores.add(new Procesador("1","Ryzen 7", "1700X"));
        procesadores.add(new Procesador("1","Ryzen 7 PRO", "1700X"));
        procesadores.add(new Procesador("1","Ryzen 7", "1800X"));
        procesadores.add(new Procesador("2","Ryzen 3", "2200G"));
        procesadores.add(new Procesador("2","Ryzen 3 PRO", "2200G"));
        procesadores.add(new Procesador("2","Ryzen 3", "2200GE"));
        procesadores.add(new Procesador("2","Ryzen 3 PRO", "2200GE"));
        procesadores.add(new Procesador("2","Ryzen 3", "2300X"));
        procesadores.add(new Procesador("2","Ryzen 5", "2400G"));
        procesadores.add(new Procesador("2","Ryzen 5 PRO", "2400G"));
        procesadores.add(new Procesador("2","Ryzen 5", "2400GE"));
        procesadores.add(new Procesador("2","Ryzen 5 PRO", "2400GE"));
        procesadores.add(new Procesador("2","Ryzen 5", "2500X"));
        procesadores.add(new Procesador("2","Ryzen 5", "2600"));
        procesadores.add(new Procesador("2","Ryzen 5 PRO", "2600"));
        procesadores.add(new Procesador("2","Ryzen 5", "2600E"));
        procesadores.add(new Procesador("2","Ryzen 5", "2600X"));
        procesadores.add(new Procesador("2","Ryzen 7", "2700"));
        procesadores.add(new Procesador("2","Ryzen 7 PRO", "2700"));
        procesadores.add(new Procesador("2","Ryzen 7", "2700E"));
        procesadores.add(new Procesador("2","Ryzen 7", "2700X"));
        procesadores.add(new Procesador("2","Ryzen 7 PRO", "2700X"));
        procesadores.add(new Procesador("3","Athlon", "3000G"));
        procesadores.add(new Procesador("3","Athlon", "3050GE"));
        procesadores.add(new Procesador("3","Ryzen 3", "3100"));
        procesadores.add(new Procesador("3","Athlon PRO", "3125GE"));
        procesadores.add(new Procesador("3","Athlon", "3150G"));
        procesadores.add(new Procesador("3","Athlon PRO", "3150G"));
        procesadores.add(new Procesador("3","Athlon", "3150GE"));
        procesadores.add(new Procesador("3","Athlon PRO", "3150GE"));
        procesadores.add(new Procesador("3","Ryzen 3", "3200G"));
        procesadores.add(new Procesador("3","Ryzen 3 PRO", "3200G"));
        procesadores.add(new Procesador("3","Ryzen 3", "3200GE"));
        procesadores.add(new Procesador("3","Ryzen 3 PRO", "3200GE"));
        procesadores.add(new Procesador("3","Ryzen 3", "3300X"));
        procesadores.add(new Procesador("3","Ryzen 5", "3350G"));
        procesadores.add(new Procesador("3","Ryzen 5 PRO", "3350G"));
        procesadores.add(new Procesador("3","Ryzen 5 PRO", "3350GE"));
        procesadores.add(new Procesador("3","Ryzen 5", "3400G"));
        procesadores.add(new Procesador("3","Ryzen 5 PRO", "3400G"));
        procesadores.add(new Procesador("3","Ryzen 5", "3400GE"));
        procesadores.add(new Procesador("3","Ryzen 5 PRO", "3400GE"));
        procesadores.add(new Procesador("3","Ryzen 5", "3500"));
        procesadores.add(new Procesador("3","Ryzen 5", "3500X"));
        procesadores.add(new Procesador("3","Ryzen 5", "3600"));
        procesadores.add(new Procesador("3","Ryzen 5 PRO", "3600"));
        procesadores.add(new Procesador("3","Ryzen 5", "3600X"));
        procesadores.add(new Procesador("3","Ryzen 5", "3600XT"));
        procesadores.add(new Procesador("3","Ryzen 7 PRO", "3700"));
        procesadores.add(new Procesador("3","Ryzen 7", "3700X"));
        procesadores.add(new Procesador("3","Ryzen 7", "3800X"));
        procesadores.add(new Procesador("3","Ryzen 7", "3800XT"));
        procesadores.add(new Procesador("3","Ryzen 9", "3900"));
        procesadores.add(new Procesador("3","Ryzen 9 PRO", "3900"));
        procesadores.add(new Procesador("3","Ryzen 9", "3900X"));
        procesadores.add(new Procesador("3","Ryzen 9", "3900XT"));
        procesadores.add(new Procesador("4","Ryzen 9", "3950X"));
        procesadores.add(new Procesador("4","Ryzen 3", "4100"));
        procesadores.add(new Procesador("4","Ryzen 3", "4300G"));
        procesadores.add(new Procesador("4","Ryzen 3", "4300GE"));
        procesadores.add(new Procesador("4","Ryzen 3 PRO", "4350G"));
        procesadores.add(new Procesador("4","Ryzen 3 PRO", "4350GE"));
        procesadores.add(new Procesador("4","Ryzen 3 PRO", "4355G"));
        procesadores.add(new Procesador("4","Ryzen 3 PRO", "4355GE"));
        procesadores.add(new Procesador("4","Ryzen 5", "4500"));
        procesadores.add(new Procesador("4","Ryzen 5", "4600G"));
        procesadores.add(new Procesador("4","Ryzen 5", "4600GE"));
        procesadores.add(new Procesador("4","Ryzen 5 PRO", "4650G"));
        procesadores.add(new Procesador("4",    "Ryzen 5 PRO", "4650GE"));
        procesadores.add(new Procesador("4","Ryzen 5 PRO", "4655G"));
        procesadores.add(new Procesador("4","Ryzen 5 PRO", "4655GE"));
        procesadores.add(new Procesador("4","Ryzen 7", "4700G"));
        procesadores.add(new Procesador("4","Ryzen 7", "4700GE"));
        procesadores.add(new Procesador("4","Ryzen 7 PRO", "4750G"));
        procesadores.add(new Procesador("4","Ryzen 7 PRO", "4750GE"));
        procesadores.add(new Procesador("5","Ryzen 3", "5300G"));
        procesadores.add(new Procesador("5","Ryzen 3", "5300GE"));
        procesadores.add(new Procesador("5","Ryzen 3 PRO", "5350G"));
        procesadores.add(new Procesador("5","Ryzen 3 PRO", "5350GE"));
        procesadores.add(new Procesador("5","Ryzen 5", "5500"));
        procesadores.add(new Procesador("5","Ryzen 5", "5600"));
        procesadores.add(new Procesador("5","Ryzen 5", "5600G"));
        procesadores.add(new Procesador("5","Ryzen 5", "5600GE"));
        procesadores.add(new Procesador("5","Ryzen 5", "5600X"));
        procesadores.add(new Procesador("5","Ryzen 5", "5600X3D"));
        procesadores.add(new Procesador("5","Ryzen 5 PRO", "5645"));
        procesadores.add(new Procesador("5","Ryzen 5 PRO", "5650G"));
        procesadores.add(new Procesador("5","Ryzen 5 PRO", "5650GE"));
        procesadores.add(new Procesador("5","Ryzen 7", "5700"));
        procesadores.add(new Procesador("5","Ryzen 7", "5700G"));
        procesadores.add(new Procesador("5","Ryzen 7", "5700GE"));
        procesadores.add(new Procesador("5","Ryzen 7", "5700X"));
        procesadores.add(new Procesador("5","Ryzen 7 PRO", "5750G"));
        procesadores.add(new Procesador("5","Ryzen 7 PRO", "5750GE"));
        procesadores.add(new Procesador("5","Ryzen 7", "5800"));
        procesadores.add(new Procesador("5","Ryzen 7", "5800X"));
        procesadores.add(new Procesador("5","Ryzen 7", "5800X3D"));
        procesadores.add(new Procesador("5","Ryzen 7 PRO", "5845"));
        procesadores.add(new Procesador("5","Ryzen 9", "5900"));
        procesadores.add(new Procesador("5","Ryzen 9", "5900X"));
        procesadores.add(new Procesador("5","Ryzen 9 PRO", "5945"));
        procesadores.add(new Procesador("5","Ryzen 9", "5950X"));
        procesadores.add(new Procesador("5","A6-Series", "A6-9400"));
        procesadores.add(new Procesador("9","A6-Series", "A6-9500"));
        procesadores.add(new Procesador("9","A6-Series", "A6-9500E"));
        procesadores.add(new Procesador("9","A6-Series", "A6-9550"));
        procesadores.add(new Procesador("9","A8-Series", "A8-9600"));
        procesadores.add(new Procesador("9","A10-Series", "A10-9700"));
        procesadores.add(new Procesador("9","A10-Series", "A10-9700E"));
        procesadores.add(new Procesador("9","A12-Series", "A12-9800"));
        procesadores.add(new Procesador("9","A12-Series", "A12-9800E"));
        procesadores.add(new Procesador("8","A10-Series", "PRO A10-8770"));
        procesadores.add(new Procesador("8","A10-Series", "PRO A10-8770E"));
        procesadores.add(new Procesador("8","A12-Series", "PRO A12-8870"));
        procesadores.add(new Procesador("8","A12-Series", "PRO A12-8870E"));
        procesadores.add(new Procesador("8","A6-Series", "PRO A6-8570"));
        procesadores.add(new Procesador("8","A6-Series", "PRO A6-8570E"));
        procesadores.add(new Procesador("8","A6-Series", "PRO A6-8580"));
        procesadores.add(new Procesador("9","A8-Series", "PRO A8-9600"));
        procesadores.add(new Procesador("9","A6-Series", "PRO A6-9500"));
        procesadores.add(new Procesador("9","A6-Series", "PRO A6-9500E"));
        procesadores.add(new Procesador("9","A10-Series", "PRO A10-9700"));
        procesadores.add(new Procesador("9","A10-Series", "PRO A10-9700E"));
        procesadores.add(new Procesador("9","A12-Series", "PRO A12-9800"));
        procesadores.add(new Procesador("9","A12-Series", "PRO A12-9800E"));
    
    }
    
    public ArrayList<Procesador> listaProcesador(){
        return procesadores;
    }
    
    ArrayList<Procesador> agregarProcesador(Procesador procesador){
        procesadores.add(procesador);
        return procesadores;
    }
}

    