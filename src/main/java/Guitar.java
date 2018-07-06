public class Guitar extends Instrument{

    int strings;

    public Guitar(String name, int strings, InstrumentType type, String manufacturer, String colour, String sound, double boughtPrice, double sellingPrice) {
        super(name, type, manufacturer, colour, sound, boughtPrice, sellingPrice);

        this.strings = strings;
    }

    public int getStrings(){
        return this.strings;
    }



}
