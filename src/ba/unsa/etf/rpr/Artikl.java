package ba.unsa.etf.rpr;

public class Artikl {
    private String naziv, kod;
    private double cijena;

    public Artikl(String naziv, double cijena, String kod) {
        this.naziv = naziv;
        this.cijena = cijena;
        this.kod = kod;
    }

    public Artikl(Artikl a) {
        this.naziv = a.naziv;
        this.cijena = a.cijena;
        this.kod = a.kod;
    }

    public Artikl() {
        naziv = "";
        cijena = 0;
        kod = "";
    }

    public String getNaziv() {
        return naziv;
    }

    public double getCijena() {
        return cijena;
    }

    public String getKod() {
        return kod;
    }
}