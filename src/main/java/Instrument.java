import behaviours.IPlay;

public abstract class Instrument implements IPlay {

    private String name;
    private String type;
    private String manufacturer;
    private String colour;
    private String sound;
    private double boughtPrice;
    private double sellingPrice;

    public Instrument(String name,  String type, String manufacturer, String colour, String sound, double boughtPrice, double sellingPrice){
        this.name = name;
        this.type = type;
        this.manufacturer = manufacturer;
        this.colour = colour;
        this.sound = sound;
        this.boughtPrice =boughtPrice;
        this.sellingPrice = sellingPrice;
    }


    public String play(){
        return "playing" + name + "(" + type + ") it makes a " + sound + "sound";
    }
}
