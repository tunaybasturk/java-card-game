
import java.util.ArrayList;
import java.util.Random;
import sun.net.www.content.audio.x_aiff;

public class Kullanıcı extends Oyuncu {

    ArrayList<Futbolcu> f_kartlistesi = new ArrayList<Futbolcu>();
    ArrayList<Futbolcu> bizimF = new ArrayList<Futbolcu>();
    ArrayList<Futbolcu> bilF=new ArrayList<Futbolcu>();
    ArrayList<Basketbolcu> b_kartlistesi = new ArrayList<Basketbolcu>();
    ArrayList<Basketbolcu> bizimB = new ArrayList<Basketbolcu>();
    ArrayList<Basketbolcu> bilB=new ArrayList<Basketbolcu>();

    public Kullanıcı() {
        //paramaetresiz
    }

    public Kullanıcı(String oyuncuID, String oyuncuAdi, int Skor) {
        super(oyuncuID, oyuncuAdi, Skor);
    }

    @Override
    public void kartSec() {

//return sporcu;
        Random rastgele = new Random();
        int[] dizi = new int[8];
        int[] dizi2=new int[8];
        int yeni_sayi;
        boolean durum = true;

        for (int i = 0; i < 4; i++) {
            while (durum) {
                yeni_sayi = rastgele.nextInt(8);

                if (i == 0) {
                    dizi[0] = yeni_sayi;
                    break; //While döngüsünden çıkılır.
                }

                for (int k = 0; k < i; k++) {
                    if (dizi[k] == yeni_sayi)
                    {
                        durum = true;
                        break;
                    } else {
                        durum = false;
                    }
                }

                if (durum == false) {
                    dizi[i] = yeni_sayi;
                }
            }
            durum = true;

        
}
        for(int i=4;i<8;i++)
        {
            dizi[i]=9;
        }
       
        for(int i=0;i<4;i++)
        {
            
             bizimF.add(f_kartlistesi.get(dizi[i]));
          
             
        }
        for (int i = 0; i < 4; i++) {
            while (durum) {
                yeni_sayi = rastgele.nextInt(8);

                if (i == 0) {
                    dizi2[0] = yeni_sayi;
                    break;
                }

                for (int k = 0; k < i; k++) {
                    if (dizi2[k] == yeni_sayi)
                    {
                        durum = true;
                        break;
                    } else {
                        durum = false;
                    }
                }

                if (durum == false) {
                    dizi2[i] = yeni_sayi;
                }
            }
            durum = true;  
}
         for(int i=4;i<8;i++)
        {
            dizi2[i]=9;
        }
        for(int i=0;i<4;i++)
        {
            
             bizimB.add(b_kartlistesi.get(dizi2[i]));      
        }
        for(int i=0;i<4;i++)
        {
            System.out.println(dizi[i]);
            
        }
      
       
          int[] y_dizi=new int[8];
       for(int i=0;i<8;i++)
       {
           y_dizi[i]=i;
       } 
       
       int[] y2_dizi=new int[8];
       for(int i=0;i<8;i++)
       {
           y2_dizi[i]=i;
       }
       for(int i=0;i<8;i++)
       {
           for(int j=0;j<8;j++)
           {
               if(y_dizi[i]==dizi[j])
           {
               y_dizi[i]=10;
           }
           }
           
       }
         for(int i=0;i<8;i++)
       {
           for(int j=0;j<8;j++)
           {
               if(y2_dizi[i]==dizi2[j])
           {
               y2_dizi[i]=10;
           }
           }
           
       }
       for(int i=0;i<8;i++)
       {
           if(y_dizi[i]!=10)
           {
               bilF.add(f_kartlistesi.get(y_dizi[i]));
           }
       }
        for(int i=0;i<8;i++)
       {
           if(y2_dizi[i]!=10)
           {
               bilB.add(b_kartlistesi.get(y2_dizi[i]));
           }
       }
    
    }

    public ArrayList<Futbolcu> getBizimF() {
        return bizimF;
    }

    public void setBizimF(ArrayList<Futbolcu> bizimF) {
        this.bizimF = bizimF;
    }

    public ArrayList<Futbolcu> getBilF() {
        return bilF;
    }

    public void setBilF(ArrayList<Futbolcu> bilF) {
        this.bilF = bilF;
    }

    public ArrayList<Basketbolcu> getBizimB() {
        return bizimB;
    }

    public void setBizimB(ArrayList<Basketbolcu> bizimB) {
        this.bizimB = bizimB;
    }

    public ArrayList<Basketbolcu> getBilB() {
        return bilB;
    }

    public void setBilB(ArrayList<Basketbolcu> bilB) {
        this.bilB = bilB;
    }

    public void butunKartlar(ArrayList<Futbolcu> x, ArrayList<Basketbolcu> y) {

        f_kartlistesi = x;
        b_kartlistesi = y;
    }

    public ArrayList<Futbolcu> getF_kartlistesi() {
        return f_kartlistesi;
    }

    public void setF_kartlistesi(ArrayList<Futbolcu> f_kartlistesi) {
        this.f_kartlistesi = f_kartlistesi;
    }

    public ArrayList<Basketbolcu> getB_kartlistesi() {
        return b_kartlistesi;
    }

    public void setB_kartlistesi(ArrayList<Basketbolcu> b_kartlistesi) {
        this.b_kartlistesi = b_kartlistesi;
    }

    @Override
    public void skorGoster() {
        
       
    }
}
