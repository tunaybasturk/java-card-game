
public class Sporcu {
    private String sporcuIsim;
    private String sporcuTakim;
    public Sporcu()
    {
        //parametresiz constructor
    }
    public Sporcu(String sporcuIsim,String sporcuTakim)
    {
        this.sporcuIsim=sporcuIsim;
        this.sporcuTakim=sporcuTakim;
    }

    public String getSporcuIsim() {
        return sporcuIsim;
    }

    public void setSporcuIsim(String sporcuIsim) {
        this.sporcuIsim = sporcuIsim;
    }

    public String getSporcuTakim() {
        return sporcuTakim;
    }

    public void setSporcuTakim(String sporcuTakim) {
        this.sporcuTakim = sporcuTakim;
    }
    
    public void sporcuPuaniGoster(Futbolcu futbolcu)
    {
        
    }
     public void sporcuPuaniGoster1(Basketbolcu basketbolcu)
    {
        
    }

    public void bilgileriGoster()
    {
        System.out.print("Ad: "+this.sporcuIsim+"  ");
        System.out.print("Takım :"+this.sporcuTakim+"  ");
    }
    
    
}
