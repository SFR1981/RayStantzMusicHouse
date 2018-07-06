import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class XylophoneTest {

    Xylophone xylophone;

    @Before
    public void before() {
        xylophone = new Xylophone("hammers",InstrumentType.XYLOPHONE, 16, "wood", "Xylem", "mahogany", "ding dong", 70.00, 145.99);
    }

    @Test
    public void getNotes() {
        assertEquals(16, xylophone.getNotes());
    }

    @Test
    public void getMaterial() {
        assertEquals("wood", xylophone.getMaterial());
    }


    @Test
    public void play() {
        assertEquals("playing hammers (XYLOPHONE) it makes a ding dong sound", xylophone.play());
    }

    @Test
    public void calculateMarkUpPrice() {
        assertEquals(75.99, xylophone.calculateMarkUpPrice(), 0.01);
    }

    @Test
    public void canGetName(){
        assertEquals("hammers", xylophone.getName());

    }




    @Test
    public void canGetType(){
        assertEquals("percussion", xylophone.getType());

    }

    @Test
    public void canGetManufacturer(){
        assertEquals("Xylem", xylophone.getManufacturer());

    }

    @Test
    public void canGetColour(){
        assertEquals("mahogany", xylophone.getColour());

    }

    @Test
    public void canGetSound(){
        assertEquals("ding dong", xylophone.getSound());

    }


    @Test
    public void canGetBoughtPrice(){
        assertEquals(70.00, xylophone.getBoughtPrice(), 0);

    }

    @Test
    public void canGetSellingPrice(){
        assertEquals(145.99, xylophone.getSellingPrice(), 0);

    }
}