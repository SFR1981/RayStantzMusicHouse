public class Piano extends Instrument {

    int keys;

    public Piano(String name, String type, int keys, String manufacturer, String colour, String sound, double boughtPrice, double sellingPrice) {
        super(name, type, manufacturer, colour, sound, boughtPrice, sellingPrice);
        this.keys = keys;
    }

    public int getKeys(){
        return this.keys;
    }
}
