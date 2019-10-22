package ba.unsa.etf.rpr;

public class Supermarket {
    private int max = 1000;
    private int broj;
    private Artikl[] supermarket;

    public Supermarket() {
        supermarket = new Artikl[1000];
        broj = 0;
    }


    public void dodajArtikl(Artikl artikl) {
        this.supermarket[this.broj++] = new Artikl(artikl);
    }

    public Artikl[] getArtikli() {
        return supermarket;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        int pozicija = -1;
        Artikl pomocni = new Artikl("1",2,"1");
        for ( int i = 0; i < broj; i++) {
            if (kod.equals(this.supermarket[i].getKod())) {
                pozicija = i;
                pomocni = new Artikl(this.supermarket[i].getNaziv(),this.supermarket[i].getCijena(),kod);
                break;
            }
        }
        if ( pozicija != -1) {
            for ( int j = pozicija; j < this.broj-1; j++) {
                this.supermarket[j] = this.supermarket[j + 1];
            }
            this.supermarket[broj-1] = null;
            this.broj -= 1;
            return pomocni;
        }

        return null;
    }
}