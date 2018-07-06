public class Xylophone extends Instrument{
    int notes;
    String material;
    public Xylophone(String name, InstrumentType type, int notes, String material, String manufacturer, String colour, String sound, double boughtPrice, double sellingPrice) {
        super(name, type, manufacturer, colour, sound, boughtPrice, sellingPrice);
        this.notes = notes;
        this.material = material;
        }



        public int getNotes(){
        return this.notes;
        }

        public String getMaterial(){
        return this.material;
        }
}
