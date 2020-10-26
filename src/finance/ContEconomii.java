package finance;


public class ContEconomii extends Cont {
    private String dobanda;
    
    public ContEconomii(){
        super();
        this.dobanda = null;
    }
    
    public ContEconomii(String iBan, String beneficiar, float sold, String moneda, String dobanda){
        super(iBan,beneficiar,sold,moneda);
        this.dobanda = dobanda;
        
    }
    
    public float getDobanda(){
        return Float.parseFloat(this.dobanda);
    }
}
