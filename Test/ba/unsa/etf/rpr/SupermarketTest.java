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

}

