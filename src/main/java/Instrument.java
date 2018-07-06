import behaviours.IPlay;
import behaviours.ISell;

public abstract class Instrument implements IPlay, ISell {

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
        return "playing " + name + " (" + type + ") it makes a " + sound + " sound";
    }

    public double calculateMarkUpPrice(){
        return sellingPrice - boughtPrice;
    }


    public String getName(){
        return this.name;
    }

    public String getType(){
        return this.type;
    }

    public String getManufacturer(){
        return this.manufacturer;
    }

    public String getColour(){
        return this.colour;
    }

    public String getSound(){
        return this.sound;
    }

    public double getBoughtPrice(){
        return this.boughtPrice;
    }

    public double getSellingPrice(){
        return this.sellingPrice;
    }
}
