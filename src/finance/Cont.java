package finance;


public class Cont {
    
    private String iBan;
    private String beneficiar;
    private float sold;
    private String moneda;
    
    public Cont(){
        this.iBan = null;
        this.beneficiar = null;
        this.sold = 0;
        this.moneda = null;
    }
    
    public Cont(String iBan, String beneficiar, float sold, String moneda){
        this.iBan = iBan;
        this.beneficiar = beneficiar;
        this.sold = sold;
        this.moneda = moneda;
    }
    
    public String getIban(){
        return this.iBan;
    }
    
    public String getBeneficiar(){
        return this.beneficiar;
    }
    
    public float getSold(){
        return this.sold;
    }
    
    public String getMoneda(){
        return this.moneda;
    }
    
    public void Sumare(float suma){
        this.sold = this.sold + suma;
    }
    
    public void Scadere(float suma){
        this.sold = this.sold - suma;
    }   
}
