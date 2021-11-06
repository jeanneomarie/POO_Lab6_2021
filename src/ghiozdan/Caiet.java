package ghiozdan;

public class Caiet extends Rechizita {
    public Caiet(String eticheta) {
        super.setEticheta(eticheta);
    }

    @Override
    public String getNume() {
        return super.getEticheta() + " - caiet";
    }
}