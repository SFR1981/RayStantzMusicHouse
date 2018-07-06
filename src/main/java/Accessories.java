import behaviours.ISell;

public abstract class Accessories implements ISell {


    String name;
    String manufacturer;
    double boughtPrice;
    double sellingPrice;

    public Accessories(String name, String manufacturer, double boughtPrice, double sellingPrice){
        this.name = name;
        this.manufacturer = manufacturer;
        this.boughtPrice = boughtPrice;
        this.sellingPrice = sellingPrice;
    }

    public String getName(){
        return this.name;
    }


    public String getManufacturer(){
        return this.manufacturer;
    }

    public double getBoughtPrice(){
        return this.boughtPrice;
    }

    public double getSellingPrice(){
        return this.sellingPrice;
    }


    public double calculateMarkUpPrice(){
        return sellingPrice - boughtPrice;
    }
}
