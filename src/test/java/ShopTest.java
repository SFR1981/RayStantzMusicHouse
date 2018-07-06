import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShopTest {

    Shop shop;
    Guitar guitar;
    Xylophone xylophone;
    Piano piano;
    Pedals pedals;
    SheetMusic sheetMusic;
    PianoPolish pianoPolish;

    @Before
    public void below(){
        sheetMusic= new SheetMusic("Smash Mouth's greatest hit", "KeyMaestro", 8.99, 18.99);
        pedals = new Pedals("Z-31", "Zoom", 38.99, 48.99);
        xylophone = new Xylophone("hammers",InstrumentType.XYLOPHONE, 16, "wood", "Xylem", "mahogany", "ding dong", 70.99, 80.99);
        pianoPolish = new PianoPolish("Key cleaner", "KeyMaestro", 8.99, 18.99);
        guitar = new Guitar("Ibanez123", 5, InstrumentType.GUITAR, "Ibanez", "black", "Twangggggg", 100.00, 110.00);
        piano = new Piano("Keymistress", InstrumentType.PIANO, 88, "Keymaster", "black", "Plink Plonk", 240.00, 250.00);
        shop = new Shop("Ray Stantz (from out of Ghostbusters) music exchange");
    }

    @Test
    public void getName() {
        assertEquals("Ray Statnz (from out of Ghostbusters) music exchange", shop.getName());
    }

    @Test
    public void getStock() {
        assertEquals(0, shop.getStock().size());
    }

    @Test
    public void addStock() {
        shop.addStock(guitar);
        assertEquals(1, shop.getStock().size());
    }

    @Test
    public void removeStock() {
        shop.addStock(guitar);
        shop.removeStock(guitar);
        assertEquals(0, shop.getStock().size());
    }

    @Test
    public void canFindTotalPotentialProfit(){
        shop.addStock(guitar);
        shop.addStock(xylophone);
        shop.addStock(piano);
        shop.addStock(pianoPolish);
        shop.addStock(pedals);
        shop.addStock(sheetMusic);
        shop.addStock(guitar);
        assertEquals(70.00, shop.totalPotentialProfit(),0.01);
    }




    }