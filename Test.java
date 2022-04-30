
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JLabel;


public class Test {
  
    public static void main(String[] args) { 
       
        Scanner scanner=new Scanner(System.in);
        String[] futbolcukartnumaralari=new String[8] ;
        ArrayList<String> futbolbolcuIsim=new ArrayList<String>();
        futbolbolcuIsim.add("cristiano ronaldo");
        futbolbolcuIsim.add("messi");
        futbolbolcuIsim.add("ronaldinho");
        futbolbolcuIsim.add("alex");
        futbolbolcuIsim.add("de bruyne");
        futbolbolcuIsim.add("agüero");
        futbolbolcuIsim.add("zlatan ibrahimovic");
        futbolbolcuIsim.add("edin dzeko");
        
        ArrayList<String> futbolbolcuTakim=new ArrayList<String>();
        futbolbolcuTakim.add("Juventus");
        futbolbolcuTakim.add("Barcelona");
        futbolbolcuTakim.add("Emekli");
        futbolbolcuTakim.add("Emekli");
        futbolbolcuTakim.add("Manchester City");
        futbolbolcuTakim.add("Manchester City");
        futbolbolcuTakim.add("Milan");
        futbolbolcuTakim.add("Roma");
       
         Futbolcu cristianoRonaldo=new Futbolcu(97,85,90, futbolbolcuIsim.get(0),futbolbolcuTakim.get(0),"src\\IMG\\CR.png");
         Futbolcu Messi=new Futbolcu(95,90,93, futbolbolcuIsim.get(1),futbolbolcuTakim.get(1),"src\\IMG\\MESSI.png");
         Futbolcu Ronaldinho=new Futbolcu(89,95,91,futbolbolcuIsim.get(2),futbolbolcuTakim.get(2),"src\\IMG\\RONALDINHO.png");
         Futbolcu Alex=new Futbolcu(97,96,85,futbolbolcuIsim.get(3),futbolbolcuTakim.get(3),"src\\IMG\\ALEX.png");
         Futbolcu DeBruyne=new Futbolcu(81,83,78,futbolbolcuIsim.get(4),futbolbolcuTakim.get(4),"src\\IMG\\KEVIN.png");
         Futbolcu Aguero=new Futbolcu(88,73,98,futbolbolcuIsim.get(5),futbolbolcuTakim.get(5),"src\\IMG\\KUN.png");
         Futbolcu Zlatan=new Futbolcu(94,69,85,futbolbolcuIsim.get(6),futbolbolcuTakim.get(6),"src\\IMG\\ZLATAN.png");
         Futbolcu Edin=new Futbolcu(76,66,80,futbolbolcuIsim.get(7),futbolbolcuTakim.get(7),"src\\IMG\\DZEKO.png");
        ArrayList<Futbolcu> x=new ArrayList<Futbolcu>();
        x.add(cristianoRonaldo);
        x.add(Messi);
        x.add(Ronaldinho);
        x.add(Alex);
        x.add(DeBruyne);
        x.add(Aguero);
        x.add(Zlatan);
        x.add(Edin);
      
        ArrayList<String> basketbolcuIsim=new ArrayList<String>();
        basketbolcuIsim.add("Lebron James");
        basketbolcuIsim.add("Stephan Curry");
        basketbolcuIsim.add("Anthony Davis");
        basketbolcuIsim.add("Furkan Korkmaz");
        basketbolcuIsim.add("Micheal Jordan");
        basketbolcuIsim.add("Cedi Osman");
        basketbolcuIsim.add("Mehmet Okur");
        basketbolcuIsim.add("Lonzo Ball");
        
        ArrayList<String> basketbolcuTakim=new ArrayList<String>();
        basketbolcuTakim.add("La Lakers");
        basketbolcuTakim.add("Golden State Warrior");
        basketbolcuTakim.add("La Lakers");
        basketbolcuTakim.add("Philadelphia 76ers");
        basketbolcuTakim.add("Emekli");
        basketbolcuTakim.add("Clevland");
        basketbolcuTakim.add("Emekli");
        basketbolcuTakim.add("New Orleans Pelicans");
  
        Basketbolcu Lebron=new Basketbolcu(85,93,95,basketbolcuIsim.get(0),basketbolcuTakim.get(0),"src\\IMG\\LEBRON.png");
        Basketbolcu Curry=new Basketbolcu(88, 98, 90,basketbolcuIsim.get(1),basketbolcuTakim.get(1),"src\\IMG\\STEPHEN.png");
        Basketbolcu Davis=new Basketbolcu(82,89,91,basketbolcuIsim.get(2),basketbolcuTakim.get(2),"src\\IMG\\DAVIS.png");
        Basketbolcu Korkmaz=new Basketbolcu(87,92,86,basketbolcuIsim.get(3),basketbolcuTakim.get(3),"src\\IMG\\FURKAN.png");
        Basketbolcu Jordan=new Basketbolcu(92,94,97,basketbolcuIsim.get(4),basketbolcuTakim.get(4),"src\\IMG\\JORDAN.png");
        Basketbolcu Osman=new Basketbolcu(84,90,86, basketbolcuIsim.get(5),basketbolcuTakim.get(5),"src\\IMG\\CEDI.png");
        Basketbolcu Okur=new Basketbolcu(84,91,85, basketbolcuIsim.get(6),basketbolcuTakim.get(6),"src\\IMG\\MEHMET.png");
        Basketbolcu Ball=new Basketbolcu(83,65,92,basketbolcuIsim.get(7),basketbolcuTakim.get(7),"src\\IMG\\LONZO.png");
         ArrayList<Basketbolcu> y=new ArrayList<Basketbolcu>();
        y.add(Lebron);
        y.add(Curry);
        y.add(Davis);
        y.add(Korkmaz);
        y.add(Jordan);
        y.add(Osman);
        y.add(Okur);
        y.add(Ball);

        Kullanıcı kullanıcı=new Kullanıcı();
        kullanıcı.butunKartlar(x,y);
        javakart arayuz=new javakart();  
        kullanıcı.kartSec();
        Baslangıc_Arayuz baslangıc_Arayuz=new Baslangıc_Arayuz();
            
        Bilgisayar bilgisayar=new Bilgisayar();
       
        bilgisayar.exchange(kullanıcı.bilF,kullanıcı.bilB);
        arayuz.Bizimkartlar(kullanıcı.bizimF,kullanıcı.bizimB);
        arayuz.Pckartlar(kullanıcı.bilF,kullanıcı.bilB);
              
      ArrayList<JLabel> bilfkartlar=new ArrayList<JLabel>();   
       bilfkartlar.add(arayuz.getJLABEL9());
       bilfkartlar.add(arayuz.getJLABEL11());  
       bilfkartlar.add(arayuz.getJLABEL13());
       bilfkartlar.add(arayuz.getJLABEL15());
      ArrayList<JLabel> bilbkartlar=new ArrayList<JLabel>();
      bilbkartlar.add(arayuz.getJLABEL10());
      bilbkartlar.add(arayuz.getJLABEL12());
      bilbkartlar.add(arayuz.getJLABEL14());
      bilbkartlar.add(arayuz.getJLABEL16());
      
        arayuz.setBizimF(kullanıcı.getBizimF());
        arayuz.BizimKartlar();
        arayuz.labelTutan(bilfkartlar, bilbkartlar);
      baslangıc_Arayuz.setArayuz(arayuz);
      baslangıc_Arayuz.setVisible(true);
        
    }

      
}
