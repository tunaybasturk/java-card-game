
import java.util.Random;
import javax.swing.ImageIcon;


public class Basketbolcu extends Sporcu{
    
    private int ikilik;
    private int ucluk;
    private int serbestAtis;
    private String dosyayolu;
    int dogruluk=0;

    public Basketbolcu() {
        //parametresiz
    }

    public Basketbolcu(int ikilik, int ucluk, int serbestAtis, String sporcuIsim, String sporcuTakim,String dosyayolu) {
        super(sporcuIsim, sporcuTakim);
        this.ikilik = ikilik;
        this.ucluk = ucluk;
        this.serbestAtis = serbestAtis;
        this.dosyayolu=dosyayolu;

    }

    public int getIkilik() {
        return ikilik;
    }

    public void setIkilik(int ikilik) {
        this.ikilik = ikilik;
    }

    public int getUcluk() {
        return ucluk;
    }

    public void setUcluk(int ucluk) {
        this.ucluk = ucluk;
    }

    public int getSerbestAtis() {
        return serbestAtis;
    }

    public void setSerbestAtis(int serbestAtis) {
        this.serbestAtis = serbestAtis;
    }

    public String getDosyayolu() {
        return dosyayolu;
    }

    public void setDosyayolu(String dosyayolu) {
        this.dosyayolu = dosyayolu;
    }


    @Override
    public void sporcuPuaniGoster1(Basketbolcu basketbolcu) {
      
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
        System.out.print("İkilik :"+this.ikilik+"  ");
        System.out.print("Ucluk :"+this.ucluk+"  ");
        System.out.println("SerbestAtis :"+this.serbestAtis);
    }
      
    
    
    
    
}
