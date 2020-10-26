package finance;




public class Transfer {
    
    public Transfer(String tip,ContEconomii cont1, ContEconomii cont2, float suma ){
        switch (tip) {
            case "credit":
                Credit(cont1,cont2,suma);
                break;
            case "debit":
                Debit(cont1,cont2,suma);
                break;
            default:
                System.out.println("Ne cerem scuze ,dar singurele operatii valide de transfer sunt cele de creditare si debitare.");
                break;  
        }
        
    }
    
    public Transfer(String tip,ContCurent cont1, ContCurent cont2, float suma ){
        switch (tip) {
            case "credit":
                Credit(cont1,cont2,suma);
                break;
            case "debit":
                Debit(cont1,cont2,suma);
                break;
            default:
                System.out.println("Ne cerem scuze ,dar singurele operatii valide de transfer sunt cele de creditare si debitare.");
                break;  
        }
        
    }
    
    private void Credit(ContEconomii cont1, ContEconomii cont2, float suma){
        if(cont2.getSold() >= suma){
            cont1.Sumare(suma);
            cont2.Scadere(suma);
        }
        else{
            System.out.println("Fonduri insuficiente");
        }
        
    }
    
    private void Debit(ContEconomii cont1, ContEconomii cont2, float suma){
        if(cont1.getSold() >= suma){
            cont2.Sumare(suma);
            cont1.Scadere(suma);
        }
        else{
            System.out.println("Fonduri insuficiente");
        }
    }
    
    private void Credit(ContCurent cont1, ContCurent cont2, float suma){
        if(cont2.getSold() >= suma){
            cont1.Sumare(suma);
            cont2.Scadere(suma);
        }
        else{
            System.out.println("Fonduri insuficiente");
        }
        
    }
    
    private void Debit(ContCurent cont1, ContCurent cont2, float suma){
        if(cont1.getSold() >= suma){
            cont2.Sumare(suma);
            cont1.Scadere(suma);
        }
        else{
            System.out.println("Fonduri insuficiente");
        }
        
    }
    
}
