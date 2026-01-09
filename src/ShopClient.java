import utils.Client;

public abstract class ShopClient extends Client {
    public ShopClient(String pServerIP, int pServerport){
        super(pServerIP, pServerport);
    }
    public void processMessage(String pMessage){

    }

    public void groesseFarbeWaehlen(String pGroesse, String pFarbe){
        this.send("TSHIRT:"+pGroesse,":"+pFarbe);
    }


}
