public class Consumo {

    private int kms;
    private int litros;
    private int vmed;
    private int pgas;

    public Consumo(int kms, int litros, int pgas, int vmed) {
        this.kms = kms;
        this.litros = litros;
        this.pgas = pgas;
        this.vmed = vmed;
    }

    public int getKms() {
        return kms;
    }

    public void setKms(int kms) {
        this.kms = kms;
    }

    public int getVmed() {
        return vmed;
    }

    public void setVmed(int vmed) {
        this.vmed = vmed;
    }

    public int getLitros() {
        return litros;
    }

    public void setLitros(int litros) {
        this.litros = litros;
    }

    public int getPgas() {
        return pgas;
    }

    public void setPgas(int pgas) {
        this.pgas = pgas;
    }

    public int getTiempo(){
        return this.kms/this.vmed;
    }

    public int consumoMedio(){
        return ((this.litros*100)/this.kms);
    }

    public int consumoEuros(){
        return ((this.pgas*100)/this.kms);
    }




























}
