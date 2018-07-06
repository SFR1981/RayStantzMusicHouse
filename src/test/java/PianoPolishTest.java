import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PianoPolishTest {

    PianoPolish pianoPolish;

    @Before
    public void before(){
        pianoPolish = new PianoPolish("Key cleaner", "KeyMaestro", 8.99, 16.99);
    }

    @Test
    public void getName() {
        assertEquals("Key cleaner", pianoPolish.getName());
    }

    @Test
    public void getManufacturer() {
        assertEquals("KeyMaestro", pianoPolish.getManufacturer());
    }

    @Test
    public void getBoughtPrice() {
        assertEquals(8.99, pianoPolish.getBoughtPrice(), 0.01);
    }

    @Test
    public void getSellingPrice() {
        assertEquals(16.99, pianoPolish.getSellingPrice(),0.01);
    }

    @Test
    public void calculateMarkUpPrice() {
        assertEquals(8.00, pianoPolish.calculateMarkUpPrice(), 0.01);

    }
}