public class TShirt {
    private String groesse;
    private String farbe;
    private double preis;

    public TShirt(String pGroesse, String pFarbe, double pPreis){
         groesse=pGroesse;
         farbe=pFarbe;
         preis=pPreis;
    }

    public void setPreis(double preis) {
        this.preis=preis;
    }
    public double getPreis(){
        return preis;
    }
    public void setFarbe(String farbe){
        this.farbe=farbe;
    }
    public String getFarbe(){
        return farbe;
    }
    public void setGroesse(String groesse){
        this.groesse=groesse;
    }
    public String getGroesse(){
        return groesse;
    }
}
