
import java.util.ArrayList;


public class Bilgisayar extends Oyuncu{
   
    ArrayList<Futbolcu> bil_f = new ArrayList<Futbolcu>();
    ArrayList<Basketbolcu> bil_b = new ArrayList<Basketbolcu>();
    
    public Bilgisayar() {
        //paramaetresiz
    }

    public Bilgisayar(String oyuncuID, String oyuncuAdi, int Skor) {
        super(oyuncuID, oyuncuAdi, Skor);
    }
    public void exchange(ArrayList<Futbolcu> BİLF,ArrayList<Basketbolcu> BİLB)
    {
        bil_b=BİLB;
        bil_f=BİLF;
        for(int i=0;i<4;i++)
        {
            System.out.println(bil_f.get(i).getSporcuIsim()+" "+bil_f.get(i).getSporcuTakim()+" "+bil_f.get(i).getPenalti());
            System.out.println(bil_b.get(i).getSporcuIsim()+" "+bil_b.get(i).getSporcuTakim()+" "+bil_b.get(i).getIkilik());
        }
    }
    @Override
    public void kartSec() {
       // return super.kartSec(sporcu);
      // return sporcu;
      
      
    }
    @Override
    public void skorGoster() {
        
    }

}
