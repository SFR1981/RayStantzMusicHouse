import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("Ibanez123", 5, InstrumentType.GUITAR, "Ibanez", "black", "Twangggggg", 100.00, 199.99);
    }

    @Test
    public void play() {
        assertEquals("playing Ibanez123 (GUITAR) it makes a Twangggggg sound", guitar.play());
    }

    @Test
    public void calculateMarkUpPrice() {
        assertEquals(99.99, guitar.calculateMarkUpPrice(), 0.01);
    }

    @Test
    public void canGetName(){
        assertEquals("Ibanez123", guitar.getName());

    }

    @Test
    public void canGetStrings(){
        assertEquals(5, guitar.getStrings());

    }

    @Test
    public void canGetType(){
        assertEquals("string", guitar.getType());

    }

    @Test
    public void canGetManufacturer(){
        assertEquals("Ibanez", guitar.getManufacturer());

    }

    @Test
    public void canGetColour(){
        assertEquals("black", guitar.getColour());

    }

    @Test
    public void canGetSound(){
        assertEquals("Twangggggg", guitar.getSound());

    }


    @Test
    public void canGetBoughtPrice(){
        assertEquals(100.00, guitar.getBoughtPrice(), 0);

    }

    @Test
    public void canGetSellingPrice(){
        assertEquals(199.99, guitar.getSellingPrice(), 0);

    }
}