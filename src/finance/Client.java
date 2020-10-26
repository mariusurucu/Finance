package finance;


public class Client {
    private String nume;
    private String preNume;
    private String adresa;
    private int varsta;
    private String valabilitateCard;
    
    public Client(){
        this.nume = null;
        this.preNume = null;
        this.adresa = null;
        this.varsta = 0;
        this.valabilitateCard = null;
    }
    
    public Client(String nume, String preNume, String adresa, int varsta, String valabilitate){
        this.nume = nume;
        this.preNume = preNume;
        this.adresa = adresa;
        this.varsta = varsta;
        this.valabilitateCard = valabilitate;
        
    }
    
    public String getNume(){
        return this.nume;
    }
    
    public String getPrenume(){
        return this.preNume;
    }
    
    public String getAdresa(){
        return this.adresa;
    }
    
    public int getVarsta(){
        return this.varsta;
    }
    
    public String getValabilitate(){
        return this.valabilitateCard;
    }
    
    
    
}
