import utils.Client;

public class ShopClient extends Client {
    public ShopClient(String pServerIP, int pServerport) {
        super(pServerIP, pServerport);
    }

    public void processMessage(String pMessage){

    }

    public void groesseFarbeWaehlen(String pGroesse, String pFarbe){
        this.send("TSHIRT:"+pGroesse+":"+pFarbe);
    }

    public void bestaetigen(String pAntwort){
        this.send("BESTAETIGUNG:"+pAntwort);
    }

    public void abmelden(){
        this.send("ABMELDEN");
    }

}
