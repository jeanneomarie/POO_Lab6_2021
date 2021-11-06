package ghiozdan;

public abstract class Rechizita {
    private String eticheta;

    public abstract String getNume();

    public String getEticheta() {
        return eticheta;
    }

    public void setEticheta(String eticheta) {
        this.eticheta = eticheta;
    }
}