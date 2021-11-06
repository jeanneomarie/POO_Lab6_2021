package ghiozdan;

public class Ghiozdan {
    private Rechizita[] rechizite;
    int index = 0;

    public Ghiozdan(int numarRechizite) {
        this.rechizite = new Rechizita[numarRechizite];
    }

    public Rechizita[] getRechizite() {
        return rechizite;
    }

    public void setRechizite(Rechizita[] rechizite) {
        this.rechizite = rechizite;
    }

    public void add(Caiet caiet) {
        if (index < rechizite.length) {
            rechizite[index++] = caiet;
            System.out.println("Caietul " + caiet.getEticheta() + " a fost adaugat!");
        } else
            System.out.println("Caietul " + caiet.getEticheta() + " nu se mai poate adauga!");
    }

    public void add(Manual manual) {
        if (index < rechizite.length) {
            rechizite[index++] = manual;
            System.out.println("Manualul " + manual.getEticheta() + " a fost adaugat!");
        } else
            System.out.println("Manualul " + manual.getEticheta() + " nu se mai poate adauga!");
    }

    public void listItems() {
        for (int i = 0; i < index; i++) {
            System.out.println(rechizite[i].getNume());
        }
    }

    public void listManuale() {
        for (int i = 0; i < index; i++) {
            if (rechizite[i] instanceof Manual)
                System.out.println(rechizite[i].getNume());
        }
    }

    public void listCaiete() {
        for (int i = 0; i < index; i++) {
            if (rechizite[i] instanceof Caiet)
                System.out.println(rechizite[i].getNume());
        }
    }

    public int getNrRechizite() {
        return index;
    }

    public int getNrManuale() {
        int contor = 0;
        for (int i = 0; i < index; i++) {
            if (rechizite[i] instanceof Manual)
                contor++;
        }
        return contor;
    }

    public int getNrCaiete() {
        int contor = 0;
        for (int i = 0; i < index; i++) {
            if (rechizite[i] instanceof Caiet)
                contor++;
        }
        return contor;
    }
}