import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SheetMusicTest {
    
    SheetMusic sheetMusic;
    
  
    @Before
    public void before(){
        sheetMusic= new SheetMusic("Smash Mouth's greatest hit", "KeyMaestro", 8.99, 16.99);
    }

    @Test
    public void getName() {
        assertEquals("Smash Mouth's greatest hit", sheetMusic.getName());
    }

    @Test
    public void getManufacturer() {
        assertEquals("KeyMaestro", sheetMusic.getManufacturer());
    }

    @Test
    public void getBoughtPrice() {
        assertEquals(8.99, sheetMusic.getBoughtPrice(), 0.01);
    }

    @Test
    public void getSellingPrice() {
        assertEquals(16.99, sheetMusic.getSellingPrice(),0.01);
    }

    @Test
    public void calculateMarkUpPrice() {
        assertEquals(8.00, sheetMusic.calculateMarkUpPrice(), 0.01);

    }

}