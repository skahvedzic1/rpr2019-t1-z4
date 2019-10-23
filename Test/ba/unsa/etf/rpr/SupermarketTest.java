package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {

    @Test
    void ArtiklTest() {
        Artikl artikl=new Artikl("2",1,"2");
        assertAll ( "GETERI",
                () -> assertEquals( 1, artikl.getCijena() ),
                () -> assertEquals( "2", artikl.getKod() )
        );
    }

    @Test
    void Supermarket() {
        Supermarket supermarket = new Supermarket();
        supermarket.dodajArtikl(new Artikl("Biciklo", 1000, "1"));

        int broj=10;
        for( int i = 0; i < broj; i++) {
             assertEquals("Biciklo", supermarket[i].getNaziv());
             assertEquals("1", supermarket[i].getKod());

        }

    }
}

