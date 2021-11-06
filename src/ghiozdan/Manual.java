package ghiozdan;

public class Manual extends Rechizita {
    public Manual(String eticheta) {
        super.setEticheta(eticheta);
    }

    @Override
    public String getNume() {
        return super.getEticheta() + " - manual";
    }
}