
import java.util.ArrayList;
import javax.swing.JLabel;


public class Sleep extends Thread{
    javakart kartlar = new javakart();
    private int y;
    ArrayList<JLabel> labelTutan=new ArrayList<>();
    String dosya;
    int a;
    public  void run()    {
         {
            try     {
               Thread.sleep(2000); 

            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
            labelTutan.get(0).setVisible(true);
            labelTutan.get(0).setIcon(new javax.swing.ImageIcon(dosya));          
            kartlar.getjLabel17().setVisible(false);
             kartlar.getjLabel18().setVisible(false);
            if(a==1)
            {
                kartlar.bilfkartlar.get(y).setVisible(true);
            }
            else                
              kartlar.bilbkartlar.get(y).setVisible(true);
            
              labelTutan.remove(0);

        }
    }



   public void tutucu(JLabel xa,javakart x,int y,String dosyayolu,int a){
       labelTutan.add(xa);
       dosya=dosyayolu;
       kartlar=x;
       this.y=y;
       this.a=a;

   } 





}