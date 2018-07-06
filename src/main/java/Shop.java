import behaviours.ISell;

import java.util.ArrayList;

public class Shop {

    String name;
    ArrayList<ISell> stock;

    public Shop(String name){
        this.name = name;
        stock = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }

    public ArrayList<ISell> getStock(){
        return this.stock;
    }

    public void addStock(ISell iSell){
        stock.add(iSell);
    }

    public void removeStock(ISell iSell){
        stock.remove(iSell);
    }

    public double totalPotentialProfit() {
        double total = 0.00;
        for (ISell stockItem : stock) {
            total += stockItem.calculateMarkUpPrice();
        }
        return total;
    }

}

