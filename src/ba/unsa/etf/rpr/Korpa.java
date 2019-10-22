package ba.unsa.etf.rpr;

public class Korpa {
    private int max = 50;
    private int broj = 0;
    private Artikl[] korpa;

    public Korpa() {
        korpa = new Artikl[50];
        broj = 0;
    }


    public boolean dodajArtikl(Artikl a) {
        if (this.broj == 50)
            return false;
        this.korpa[this.broj++] = new Artikl(a);
        return true;
    }

    public Artikl[] getArtikli() {
        return korpa;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        int pozicija = -1;
        Artikl pomocni = new Artikl("1",2,"1");
        for (int i = 0; i < broj; i++) {
            if (kod.equals(this.korpa[i].getKod())) {
                pozicija = i;
                pomocni = new Artikl(this.korpa[i].getNaziv(), this.korpa[i].getCijena(),kod);
                break;
            }
        }
        if (pozicija != -1) {
            for (int j = pozicija; j < this.broj - 1; j++) {
                this.korpa[j] = this.korpa[j+1];
            }
            this.korpa[broj-1] = null;
            this.broj -= 1;
            return pomocni;
        }
        return null;
    }

    public int dajUkupnuCijenuArtikala() {
        int ukupna_cijena = 0;
        for (int i = 0; i < this.broj; i++) {
            ukupna_cijena += this.korpa[i].getCijena();
        }
        return ukupna_cijena;
    }
}