
import java.util.ArrayList;
import java.util.Random;
import javafx.scene.input.KeyCode;
import javax.swing.ImageIcon;


public class Futbolcu extends Sporcu{
    
    private int penalti;
    private int serbesAtis;
    private int kaleciIleKarsiKarsiya;
    int dogruluk=0;
    private String dosyayolu;
    public Futbolcu() {
        //parametresiz
    }

    public Futbolcu(int penalti, int serbesAtis, int kaleciIleKarsiKarsiya, String sporcuIsim, String sporcuTakim,String dosyayolu) {
        super(sporcuIsim, sporcuTakim);
        this.penalti = penalti;
        this.serbesAtis = serbesAtis;
        this.kaleciIleKarsiKarsiya = kaleciIleKarsiKarsiya;
        this.dosyayolu=dosyayolu;
        
      
    }
   
    Futbolcu(String get, String get0) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public int getPenalti() {
        return penalti;
    }

    public void setPenalti(int penalti) {
        this.penalti = penalti;
    }

    public int getSerbesAtis() {
        return serbesAtis;
    }

    public void setSerbesAtis(int serbesAtis) {
        this.serbesAtis = serbesAtis;
    }

    public int getKaleciIleKarsiKarsiya() {
        return kaleciIleKarsiKarsiya;
    }

    public void setKaleciIleKarsiKarsiya(int kaleciIleKarsiKarsiya) {
        this.kaleciIleKarsiKarsiya = kaleciIleKarsiKarsiya;
    }

    public String getDosyayolu() {
        return dosyayolu;
    }

    public void setDosyayolu(String dosyayolu) {
        this.dosyayolu = dosyayolu;
    }

    @Override
    public void sporcuPuaniGoster(Futbolcu futbolcu) {
      
    }
    public boolean kartKullanildimi()
    {
       
        if(dogruluk==0)
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.print("penalti :"+this.penalti+"  ");
         System.out.print("serbest atis :"+this.serbesAtis+"  ");
         System.out.println("kaleci ile karsı karsiya :"+this.kaleciIleKarsiKarsiya);
       
    }
   
    
    
    
}
