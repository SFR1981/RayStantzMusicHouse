import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("Ibanez123", 5, "guitar", "Ibanez", "black", "Twangggggg", 100.00, 199.99);
    }

    @Test
    public void play() {
    }

    @Test
    public void calculateMarkUpPrice() {
    }

    @Test
    public void canGetName(){

    }

    @Test
    public void canGetStrings(){

    }

    @Test
    public void canGetType(){

    }

    @Test
    public void canGetManufacturer(){

    }

    @Test
    public void canGetColour(){

    }

    @Test
    public void canGetSound(){

    }


    @Test
    public void canGetBoughtPrice(){

    }

    @Test
    public void canGetSellingPrice(){

    }
}