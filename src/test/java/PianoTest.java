import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PianoTest {


    Piano piano;

    @Before
    public void before(){
        piano = new Piano("Keymistress", "Piano", 88, "Keymaster", "black", "Plink Plonk", 240.00, 380.00);
    }

    @Test
    public void getKeys() {
        assertEquals(88, piano.getKeys());
    }


    @Test
    public void play() {
        assertEquals("playing Keymistress (Piano) it makes a Plink Plonk sound", piano.play());
    }

    @Test
    public void calculateMarkUpPrice() {
        assertEquals(140.00, piano.calculateMarkUpPrice(), 0.01);
    }

    @Test
    public void canGetName(){
        assertEquals("Keymistress", piano.getName());

    }



    @Test
    public void canGetType(){
        assertEquals("Piano", piano.getType());

    }

    @Test
    public void canGetManufacturer(){
        assertEquals("Keymaster", piano.getManufacturer());

    }

    @Test
    public void canGetColour(){
        assertEquals("black", piano.getColour());

    }

    @Test
    public void canGetSound(){
        assertEquals("Plink Plonk", piano.getSound());

    }


    @Test
    public void canGetBoughtPrice(){
        assertEquals(240.00, piano.getBoughtPrice(), 0);

    }

    @Test
    public void canGetSellingPrice(){
        assertEquals(380.00, piano.getSellingPrice(), 0);

    }
}