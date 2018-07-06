public enum InstrumentType {

    XYLOPHONE("percussion"),
    GUITAR("string"),
    PIANO("struck string intrument");


    private String type;

    InstrumentType(String type){
        this.type = type;
    }

    public String getType(){
        return this.type;
    }

}
