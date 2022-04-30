
import java.util.ArrayList;


public class Oyuncu {
    private String oyuncuID;
    private String oyuncuAdi;
    private int Skor;
   
    public Oyuncu()
    {
        //paramaetresiz
    }
    public Oyuncu(String oyuncuID,String oyuncuAdi,int Skor)
    {
        this.oyuncuID=oyuncuID;
        this.oyuncuAdi=oyuncuAdi;
        this.Skor=Skor;
    }

    public String getOyuncuID() {
        return oyuncuID;
    }

    public void setOyuncuID(String oyuncuID) {
        this.oyuncuID = oyuncuID;
    }

    public String getOyuncuAdi() {
        return oyuncuAdi;
    }

    public void setOyuncuAdi(String oyuncuAdi) {
        this.oyuncuAdi = oyuncuAdi;
    }

    public int getSkor() {
        return Skor;
    }

    public void setSkor(int Skor) {
        this.Skor = Skor;
    }

    public int skorEkle(int x)
    {
       this.Skor+=x;
       return this.Skor;
    }
    public void skorGoster()
    {
        skorEkle(Skor);
    }
    public void  kartSec()
    {
        
    }
  
}
