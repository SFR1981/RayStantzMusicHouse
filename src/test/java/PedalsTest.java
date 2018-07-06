import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PedalsTest {
    
    Pedals pedals;

    @Before
    public void before(){
        pedals = new Pedals("Z-31", "Zoom", 38.99, 78.99);
    }

    @Test
    public void getName() {
        assertEquals("Z-31", pedals.getName());
    }

    @Test
    public void getManufacturer() {
        assertEquals("Zoom", pedals.getManufacturer());
    }

    @Test
    public void getBoughtPrice() {
        assertEquals(38.99, pedals.getBoughtPrice(), 0.01);
    }

    @Test
    public void getSellingPrice() {
        assertEquals(78.99, pedals.getSellingPrice(),0.01);
    }

    @Test
    public void calculateMarkUpPrice() {
        assertEquals(40.00, pedals.calculateMarkUpPrice(), 0.01);

    }

}