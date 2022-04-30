
import java.awt.Font;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JLabel;
import jdk.nashorn.internal.parser.TokenType;

public class javakart extends javax.swing.JFrame {
  Kullanıcı kullanıcı=new Kullanıcı();
  Bilgisayar bilgisayar=new Bilgisayar();
 
   public int bizimskor=0;
   public int bilskor=0;
  
    public javakart() {
        initComponents(); 
        this.setAlwaysOnTop(true);
        this.setSize(1920,1080);
       
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel18 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        JLABEL16 = new javax.swing.JLabel();
        JLABEL15 = new javax.swing.JLabel();
        JLABEL14 = new javax.swing.JLabel();
        JLABEL13 = new javax.swing.JLabel();
        JLABEL12 = new javax.swing.JLabel();
        JLABEL11 = new javax.swing.JLabel();
        JLABEL10 = new javax.swing.JLabel();
        JLABEL9 = new javax.swing.JLabel();
        JLABEL8 = new javax.swing.JLabel();
        JLABEL7 = new javax.swing.JLabel();
        JLABEL6 = new javax.swing.JLabel();
        JLABEL5 = new javax.swing.JLabel();
        JLABEL4 = new javax.swing.JLabel();
        JLABEL3 = new javax.swing.JLabel();
        JLABEL2 = new javax.swing.JLabel();
        JLABEL1 = new javax.swing.JLabel();
        VS = new javax.swing.JLabel();
        BİLOZELLIKLERI = new javax.swing.JLabel();
        BIZIMOZELLIKLER = new javax.swing.JLabel();
        pcSkor = new javax.swing.JButton();
        kullanıcıSkor = new javax.swing.JButton();
        KimKazandi = new javax.swing.JButton();
        KullaniciId = new javax.swing.JLabel();
        Kullaniciad = new javax.swing.JLabel();
        PCAD = new javax.swing.JLabel();
        ARKAPLAN = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().add(jLabel18);
        jLabel18.setBounds(1000, 370, 200, 300);
        getContentPane().add(jLabel17);
        jLabel17.setBounds(670, 370, 200, 300);

        JLABEL16.setText("JLABEL16");
        getContentPane().add(JLABEL16);
        JLABEL16.setBounds(1550, 20, 200, 300);

        JLABEL15.setText("JLABEL15");
        getContentPane().add(JLABEL15);
        JLABEL15.setBounds(1330, 25, 200, 300);
        JLABEL15.getAccessibleContext().setAccessibleName("MESSI");

        JLABEL14.setText("JLABEL14");
        getContentPane().add(JLABEL14);
        JLABEL14.setBounds(1115, 20, 200, 300);

        JLABEL13.setText("JLABEL13");
        getContentPane().add(JLABEL13);
        JLABEL13.setBounds(900, 25, 200, 300);

        JLABEL12.setText("JLABEL12");
        getContentPane().add(JLABEL12);
        JLABEL12.setBounds(680, 20, 200, 300);

        JLABEL11.setText("JLABEL11");
        getContentPane().add(JLABEL11);
        JLABEL11.setBounds(460, 25, 200, 300);

        JLABEL10.setText("JLABEL10");
        getContentPane().add(JLABEL10);
        JLABEL10.setBounds(240, 20, 200, 300);

        JLABEL9.setText("JLABEL9");
        getContentPane().add(JLABEL9);
        JLABEL9.setBounds(10, 25, 200, 300);

        JLABEL8.setText("JLABEL8");
        JLABEL8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JLABEL8MouseClicked(evt);
            }
        });
        getContentPane().add(JLABEL8);
        JLABEL8.setBounds(1550, 720, 200, 300);

        JLABEL7.setText("JLABEL7");
        JLABEL7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JLABEL7MouseClicked(evt);
            }
        });
        getContentPane().add(JLABEL7);
        JLABEL7.setBounds(1330, 720, 200, 300);

        JLABEL6.setText("JLABEL6");
        JLABEL6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JLABEL6MouseClicked(evt);
            }
        });
        getContentPane().add(JLABEL6);
        JLABEL6.setBounds(1115, 720, 200, 300);

        JLABEL5.setText("JLABEL5");
        JLABEL5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JLABEL5MouseClicked(evt);
            }
        });
        getContentPane().add(JLABEL5);
        JLABEL5.setBounds(900, 720, 200, 300);

        JLABEL4.setText("JLABEL4");
        JLABEL4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JLABEL4MouseClicked(evt);
            }
        });
        getContentPane().add(JLABEL4);
        JLABEL4.setBounds(680, 720, 200, 300);

        JLABEL3.setText("JLABEL3");
        JLABEL3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JLABEL3MouseClicked(evt);
            }
        });
        getContentPane().add(JLABEL3);
        JLABEL3.setBounds(460, 720, 200, 300);

        JLABEL2.setText("JLABEL2");
        JLABEL2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JLABEL2MouseClicked(evt);
            }
        });
        getContentPane().add(JLABEL2);
        JLABEL2.setBounds(240, 720, 200, 300);

        JLABEL1.setText("JLABEL1");
        JLABEL1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JLABEL1MouseClicked(evt);
            }
        });
        getContentPane().add(JLABEL1);
        JLABEL1.setBounds(20, 720, 200, 300);

        VS.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Documents\\NetBeansProjects\\Java Proje\\src\\IMG\\VS.png")); // NOI18N
        getContentPane().add(VS);
        VS.setBounds(900, 455, 75, 75);

        BİLOZELLIKLERI.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        BİLOZELLIKLERI.setForeground(new java.awt.Color(255, 153, 51));
        BİLOZELLIKLERI.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(BİLOZELLIKLERI);
        BİLOZELLIKLERI.setBounds(1220, 330, 700, 300);

        BIZIMOZELLIKLER.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        BIZIMOZELLIKLER.setForeground(new java.awt.Color(255, 153, 51));
        BIZIMOZELLIKLER.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(BIZIMOZELLIKLER);
        BIZIMOZELLIKLER.setBounds(100, 330, 550, 300);
        getContentPane().add(pcSkor);
        pcSkor.setBounds(1760, 120, 120, 80);
        getContentPane().add(kullanıcıSkor);
        kullanıcıSkor.setBounds(1760, 740, 120, 80);

        KimKazandi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KimKazandiMouseClicked(evt);
            }
        });
        getContentPane().add(KimKazandi);
        KimKazandi.setBounds(1760, 470, 120, 80);

        KullaniciId.setFont(new java.awt.Font("Algerian", 3, 20)); // NOI18N
        KullaniciId.setForeground(new java.awt.Color(255, 0, 51));
        KullaniciId.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        getContentPane().add(KullaniciId);
        KullaniciId.setBounds(1760, 940, 150, 80);

        Kullaniciad.setFont(new java.awt.Font("Algerian", 3, 20)); // NOI18N
        Kullaniciad.setForeground(new java.awt.Color(255, 0, 51));
        Kullaniciad.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        getContentPane().add(Kullaniciad);
        Kullaniciad.setBounds(1760, 840, 150, 80);

        PCAD.setFont(new java.awt.Font("Algerian", 3, 80)); // NOI18N
        PCAD.setForeground(new java.awt.Color(255, 51, 51));
        PCAD.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        PCAD.setText("PC");
        getContentPane().add(PCAD);
        PCAD.setBounds(1760, 20, 120, 80);

        ARKAPLAN.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Documents\\NetBeansProjects\\Java Proje\\src\\IMG\\Arkayuz1.jpg")); // NOI18N
        ARKAPLAN.setText("jLabel1");
        ARKAPLAN.setMaximumSize(new java.awt.Dimension(1920, 1080));
        ARKAPLAN.setMinimumSize(new java.awt.Dimension(1920, 1080));
        ARKAPLAN.setPreferredSize(new java.awt.Dimension(1920, 1080));
        getContentPane().add(ARKAPLAN);
        ARKAPLAN.setBounds(0, 0, 1920, 1080);

        jPanel1.setMinimumSize(new java.awt.Dimension(1920, 1080));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1920, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1080, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1920, 1080);

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    private void JLABEL2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLABEL2MouseClicked
    
        JLABEL2.setVisible(false);
        jLabel17.setVisible(true);
        jLabel18.setVisible(true);
         Random random=new Random();
     int y=random.nextInt(bilB.size());
     jLabel17.setIcon(new javax.swing.ImageIcon(bizimB.get(0).getDosyayolu()));
     jLabel18.setIcon(new javax.swing.ImageIcon(bilB.get(y).getDosyayolu()));    
     
     int[] dizi=new int[3];
     dizi[0]=bilB.get(y).getSerbestAtis();
     dizi[1]=bilB.get(y).getIkilik();
     dizi[2]=bilB.get(y).getUcluk();
      int[] dizi2=new int[3];
     dizi2[0]=bizimB.get(0).getSerbestAtis();
     dizi2[1]=bizimB.get(0).getIkilik();
     dizi2[2]=bizimB.get(0).getUcluk();
     int x=random.nextInt(3);
     if(dizi[x]>dizi2[x])
     {
         bilskor+=10;
         bilgisayar.setSkor(bilskor);
         pcSkor.setText("Skor : "+bilskor);
          kullanıcıSkor.setText("Skor : "+bizimskor);
     bilB.remove(y);
     y=random.nextInt(bilbkartlar.size());
     bilbkartlar.get(y).setVisible(false);
     bilbkartlar.remove(y);
     }
     else if(dizi2[x]>dizi[x])
     {
        
         bizimskor+=10;
         kullanıcı.setSkor(bizimskor);
         pcSkor.setText("Skor : "+bilskor);
          kullanıcıSkor.setText("Skor : "+bizimskor);
     bilB.remove(y);
     y=random.nextInt(bilbkartlar.size());
    bilbkartlar.get(y).setVisible(false);
     bilbkartlar.remove(y);
     }
     else
     {
         bilbkartlar.get(y).setVisible(false);
          Sleep sleep=new Sleep();
         sleep.tutucu(JLABEL2, this, y,bizimB.get(0).getDosyayolu(),4);
         sleep.start();
     }
     String[] dizi3=new String[3];
     dizi3[0]="Serbest Atıs : ";
     dizi3[1]="İkilik : ";
     dizi3[2]="Üçlük : ";
     BİLOZELLIKLERI.setText(dizi3[x]+dizi[x]); 
     BIZIMOZELLIKLER.setText(dizi3[x]+dizi2[x]);
    
    }//GEN-LAST:event_JLABEL2MouseClicked
 
    private void JLABEL1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLABEL1MouseClicked
     
      JLABEL1.setVisible(false);
       jLabel17.setVisible(true);
        jLabel18.setVisible(true);
         Random random=new Random();
     int y=random.nextInt(bilF.size());
     jLabel17.setIcon(new javax.swing.ImageIcon(bizimF.get(0).getDosyayolu()));
     jLabel18.setIcon(new javax.swing.ImageIcon(bilF.get(y).getDosyayolu()));
      
     int[] dizi=new int[3];
     dizi[0]=bilF.get(y).getPenalti();
     dizi[1]=bilF.get(y).getSerbesAtis();
     dizi[2]=bilF.get(y).getKaleciIleKarsiKarsiya();
      int[] dizi2=new int[3];
     dizi2[0]=bizimF.get(0).getPenalti();
     dizi2[1]=bizimF.get(0).getSerbesAtis();
     dizi2[2]=bizimF.get(0).getKaleciIleKarsiKarsiya();
     int x=random.nextInt(3);
      if(dizi[x]>dizi2[x])
     {
         bilskor+=10;
         bilgisayar.setSkor(bilskor);
         pcSkor.setText("Skor : "+bilskor);
          kullanıcıSkor.setText("Skor : "+bizimskor);
     bilF.remove(y);
     y=random.nextInt(bilfkartlar.size());
       bilfkartlar.get(y).setVisible(false);
     bilfkartlar.remove(y);
     }
     else if(dizi2[x]>dizi[x])
     {
        
         bizimskor+=10;
         kullanıcı.setSkor(bizimskor);
         pcSkor.setText("Skor : "+bilskor);
          kullanıcıSkor.setText("Skor : "+bizimskor);
     bilF.remove(y);
     y=random.nextInt(bilfkartlar.size());
      bilfkartlar.get(y).setVisible(false);
     bilfkartlar.remove(y);
     }
     else
     {  
         bilfkartlar.get(y).setVisible(false);
          Sleep sleep=new Sleep();
         sleep.tutucu(JLABEL1, this, y,bizimF.get(0).getDosyayolu(),1);
         sleep.start();
     }
     String[] dizi3=new String[3];
     dizi3[0]="Penaltı : ";
     dizi3[1]="Serbest Atış : ";
     dizi3[2]="K K K : ";
     BİLOZELLIKLERI.setText(dizi3[x]+dizi[x]); 
     BIZIMOZELLIKLER.setText(dizi3[x]+dizi2[x]);
   
    }//GEN-LAST:event_JLABEL1MouseClicked
   
    private void JLABEL4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLABEL4MouseClicked
        
         JLABEL4.setVisible(false);
          jLabel17.setVisible(true);
        jLabel18.setVisible(true);
         Random random=new Random();
     int y=random.nextInt(bilB.size());
     jLabel17.setIcon(new javax.swing.ImageIcon(bizimB.get(1).getDosyayolu()));
     jLabel18.setIcon(new javax.swing.ImageIcon(bilB.get(y).getDosyayolu()));
    
     int[] dizi=new int[3];
     dizi[0]=bilB.get(y).getSerbestAtis();
     dizi[1]=bilB.get(y).getIkilik();
     dizi[2]=bilB.get(y).getUcluk();
      int[] dizi2=new int[3];
     dizi2[0]=bizimB.get(1).getSerbestAtis();
     dizi2[1]=bizimB.get(1).getIkilik();
     dizi2[2]=bizimB.get(1).getUcluk();
     int x=random.nextInt(3);
     if(dizi[x]>dizi2[x])
     {
         bilskor+=10;
         bilgisayar.setSkor(bilskor);
         pcSkor.setText("Skor : "+bilskor);
          kullanıcıSkor.setText("Skor : "+bizimskor);
     bilB.remove(y);
     y=random.nextInt(bilbkartlar.size());
     bilbkartlar.get(y).setVisible(false);
     bilbkartlar.remove(y);
     }
     else if(dizi2[x]>dizi[x])
     {
        
         bizimskor+=10;
         kullanıcı.setSkor(bizimskor);
         pcSkor.setText("Skor : "+bilskor);
          kullanıcıSkor.setText("Skor : "+bizimskor);
     bilB.remove(y);
     y=random.nextInt(bilbkartlar.size());
    bilbkartlar.get(y).setVisible(false);
     bilbkartlar.remove(y);
     }
     else
     { 
         bilbkartlar.get(y).setVisible(false);
          Sleep sleep=new Sleep();
         sleep.tutucu(JLABEL4, this, y,bizimB.get(1).getDosyayolu(),2);
         sleep.start();
     }
     String[] dizi3=new String[3];
     dizi3[0]="Serbest Atıs : ";
     dizi3[1]="İkilik : ";
     dizi3[2]="Üçlük : ";
     BİLOZELLIKLERI.setText(dizi3[x]+dizi[x]); 
     BIZIMOZELLIKLER.setText(dizi3[x]+dizi2[x]);
   
    }//GEN-LAST:event_JLABEL4MouseClicked

    private void JLABEL3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLABEL3MouseClicked
      JLABEL3.setVisible(false);
       jLabel17.setVisible(true);
        jLabel18.setVisible(true);
         Random random=new Random();
     int y=random.nextInt(bilF.size());
     jLabel17.setIcon(new javax.swing.ImageIcon(bizimF.get(1).getDosyayolu()));
     jLabel18.setIcon(new javax.swing.ImageIcon(bilF.get(y).getDosyayolu()));
    
     int[] dizi=new int[3];
     dizi[0]=bilF.get(y).getPenalti();
     dizi[1]=bilF.get(y).getSerbesAtis();
     dizi[2]=bilF.get(y).getKaleciIleKarsiKarsiya();
      int[] dizi2=new int[3];
     dizi2[0]=bizimF.get(1).getPenalti();
     dizi2[1]=bizimF.get(1).getSerbesAtis();
     dizi2[2]=bizimF.get(1).getKaleciIleKarsiKarsiya();
     int x=random.nextInt(3);
      if(dizi[x]>dizi2[x])
     {
         bilskor+=10;
         bilgisayar.setSkor(bilskor);
         pcSkor.setText("Skor : "+bilskor);
          kullanıcıSkor.setText("Skor : "+bizimskor);
     bilF.remove(y);
     y=random.nextInt(bilfkartlar.size());
       bilfkartlar.get(y).setVisible(false);
     bilfkartlar.remove(y);
     }
     else if(dizi2[x]>dizi[x])
     {
        
         bizimskor+=10;
         kullanıcı.setSkor(bizimskor);
         pcSkor.setText("Skor : "+bilskor);
          kullanıcıSkor.setText("Skor : "+bizimskor);
     bilF.remove(y);
     y=random.nextInt(bilfkartlar.size());
      bilfkartlar.get(y).setVisible(false);
     bilfkartlar.remove(y);
     }
     else
     { 
         bilfkartlar.get(y).setVisible(false);
          Sleep sleep=new Sleep();
         sleep.tutucu(JLABEL3, this, y,bizimF.get(1).getDosyayolu(),1);
         sleep.start();
     }
     String[] dizi3=new String[3];
     dizi3[0]="Penaltı : ";
     dizi3[1]="Serbest Atış : ";
     dizi3[2]="K K K : ";
     BİLOZELLIKLERI.setText(dizi3[x]+dizi[x]); 
     BIZIMOZELLIKLER.setText(dizi3[x]+dizi2[x]);
   
             
    }//GEN-LAST:event_JLABEL3MouseClicked

    private void JLABEL5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLABEL5MouseClicked
       JLABEL5.setVisible(false);
        jLabel17.setVisible(true);
        jLabel18.setVisible(true);
         Random random=new Random();
     int y=random.nextInt(bilF.size());
     jLabel17.setIcon(new javax.swing.ImageIcon(bizimF.get(2).getDosyayolu()));
     jLabel18.setIcon(new javax.swing.ImageIcon(bilF.get(y).getDosyayolu()));
    
     int[] dizi=new int[3];
     dizi[0]=bilF.get(y).getPenalti();
     dizi[1]=bilF.get(y).getSerbesAtis();
     dizi[2]=bilF.get(y).getKaleciIleKarsiKarsiya();
      int[] dizi2=new int[3];
     dizi2[0]=bizimF.get(2).getPenalti();
     dizi2[1]=bizimF.get(2).getSerbesAtis();
     dizi2[2]=bizimF.get(2).getKaleciIleKarsiKarsiya();
     int x=random.nextInt(3);
      if(dizi[x]>dizi2[x])
     {
         bilskor+=10;
         bilgisayar.setSkor(bilskor);
         pcSkor.setText("Skor : "+bilskor);
          kullanıcıSkor.setText("Skor : "+bizimskor);
     bilF.remove(y);
     y=random.nextInt(bilfkartlar.size());
       bilfkartlar.get(y).setVisible(false);
     bilfkartlar.remove(y);
     }
     else if(dizi2[x]>dizi[x])
     {
         bizimskor+=10;
         kullanıcı.setSkor(bizimskor);
         pcSkor.setText("Skor : "+bilskor);
          kullanıcıSkor.setText("Skor : "+bizimskor);
     bilF.remove(y);
     y=random.nextInt(bilfkartlar.size());
      bilfkartlar.get(y).setVisible(false);
     bilfkartlar.remove(y);
     }
     else
     { 
         bilfkartlar.get(y).setVisible(false);
          Sleep sleep=new Sleep();
         sleep.tutucu(JLABEL5, this, y,bizimF.get(2).getDosyayolu(),1);
         sleep.start();
     }
     String[] dizi3=new String[3];
     dizi3[0]="Penaltı : ";
     dizi3[1]="Serbest Atış : ";
     dizi3[2]="K K K : ";
     BİLOZELLIKLERI.setText(dizi3[x]+dizi[x]); 
     BIZIMOZELLIKLER.setText(dizi3[x]+dizi2[x]);
     
    }//GEN-LAST:event_JLABEL5MouseClicked

    private void JLABEL7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLABEL7MouseClicked
       JLABEL7.setVisible(false);
        jLabel17.setVisible(true);
        jLabel18.setVisible(true);
         Random random=new Random();
     int y=random.nextInt(bilF.size());
     jLabel17.setIcon(new javax.swing.ImageIcon(bizimF.get(3).getDosyayolu()));
     jLabel18.setIcon(new javax.swing.ImageIcon(bilF.get(y).getDosyayolu()));
    
     int[] dizi=new int[3];
     dizi[0]=bilF.get(y).getPenalti();
     dizi[1]=bilF.get(y).getSerbesAtis();
     dizi[2]=bilF.get(y).getKaleciIleKarsiKarsiya();
      int[] dizi2=new int[3];
     dizi2[0]=bizimF.get(3).getPenalti();
     dizi2[1]=bizimF.get(3).getSerbesAtis();
     dizi2[2]=bizimF.get(3).getKaleciIleKarsiKarsiya();
     int x=random.nextInt(3);
      if(dizi[x]>dizi2[x])
     {
         bilskor+=10;
         bilgisayar.setSkor(bilskor);
         pcSkor.setText("Skor : "+bilskor);
          kullanıcıSkor.setText("Skor : "+bizimskor);
     bilF.remove(y);
     y=random.nextInt(bilfkartlar.size());
       bilfkartlar.get(y).setVisible(false);
     bilfkartlar.remove(y);
     }
     else if(dizi2[x]>dizi[x])
     {
  
         bizimskor+=10;
         kullanıcı.setSkor(bizimskor);
         pcSkor.setText("Skor : "+bilskor);
          kullanıcıSkor.setText("Skor : "+bizimskor);
     bilF.remove(y);
     y=random.nextInt(bilfkartlar.size());
      bilfkartlar.get(y).setVisible(false);
     bilfkartlar.remove(y);
     }
     else
     {
         bilfkartlar.get(y).setVisible(false);
          Sleep sleep=new Sleep();
         sleep.tutucu(JLABEL7, this, y,bizimF.get(3).getDosyayolu(),1);
         sleep.start();
     }
     String[] dizi3=new String[3];
     dizi3[0]="Penaltı : ";
     dizi3[1]="Serbest Atış : ";
     dizi3[2]="K K K : ";
     BİLOZELLIKLERI.setText(dizi3[x]+dizi[x]); 
     BIZIMOZELLIKLER.setText(dizi3[x]+dizi2[x]);
      
    }//GEN-LAST:event_JLABEL7MouseClicked

    private void JLABEL6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLABEL6MouseClicked
          JLABEL6.setVisible(false);
           jLabel17.setVisible(true);
        jLabel18.setVisible(true);
         Random random=new Random();
     int y=random.nextInt(bilB.size());
     jLabel17.setIcon(new javax.swing.ImageIcon(bizimB.get(2).getDosyayolu()));
     jLabel18.setIcon(new javax.swing.ImageIcon(bilB.get(y).getDosyayolu()));
   
     int[] dizi=new int[3];
     dizi[0]=bilB.get(y).getSerbestAtis();
     dizi[1]=bilB.get(y).getIkilik();
     dizi[2]=bilB.get(y).getUcluk();
      int[] dizi2=new int[3];
     dizi2[0]=bizimB.get(2).getSerbestAtis();
     dizi2[1]=bizimB.get(2).getIkilik();
     dizi2[2]=bizimB.get(2).getUcluk();
     int x=random.nextInt(3);
     if(dizi[x]>dizi2[x])
     {
         bilskor+=10;
         bilgisayar.setSkor(bilskor);
         pcSkor.setText("Skor : "+bilskor);
          kullanıcıSkor.setText("Skor : "+bizimskor);
     bilB.remove(y);
     y=random.nextInt(bilbkartlar.size());
     bilbkartlar.get(y).setVisible(false);
     bilbkartlar.remove(y);
     }
     else if(dizi2[x]>dizi[x])
     {
         
         bizimskor+=10;
         kullanıcı.setSkor(bizimskor);
         pcSkor.setText("Skor : "+bilskor);
          kullanıcıSkor.setText("Skor : "+bizimskor);
     bilB.remove(y);
     y=random.nextInt(bilbkartlar.size());
    bilbkartlar.get(y).setVisible(false);
     bilbkartlar.remove(y);
     }
     else
     { 
         bilbkartlar.get(y).setVisible(false);
          Sleep sleep=new Sleep();
         sleep.tutucu(JLABEL6, this, y,bizimB.get(2).getDosyayolu(),2);
         sleep.start();
     }
     String[] dizi3=new String[3];
     dizi3[0]="Serbest Atıs : ";
     dizi3[1]="İkilik : ";
     dizi3[2]="Üçlük : ";
     BİLOZELLIKLERI.setText(dizi3[x]+dizi[x]); 
     BIZIMOZELLIKLER.setText(dizi3[x]+dizi2[x]);
  
    }//GEN-LAST:event_JLABEL6MouseClicked

    private void JLABEL8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLABEL8MouseClicked
          JLABEL8.setVisible(false);
           jLabel17.setVisible(true);
        jLabel18.setVisible(true);
         Random random=new Random();
     int y=random.nextInt(bilB.size());
     jLabel17.setIcon(new javax.swing.ImageIcon(bizimB.get(3).getDosyayolu()));
     jLabel18.setIcon(new javax.swing.ImageIcon(bilB.get(y).getDosyayolu()));
    
     int[] dizi=new int[3];
     dizi[0]=bilB.get(y).getSerbestAtis();
     dizi[1]=bilB.get(y).getIkilik();
     dizi[2]=bilB.get(y).getUcluk();
      int[] dizi2=new int[3];
     dizi2[0]=bizimB.get(3).getSerbestAtis();
     dizi2[1]=bizimB.get(3).getIkilik();
     dizi2[2]=bizimB.get(3).getUcluk();
     int x=random.nextInt(3);
     if(dizi[x]>dizi2[x])
     {
         bilskor+=10;
         bilgisayar.setSkor(bilskor);
         pcSkor.setText("Skor : "+bilskor);
          kullanıcıSkor.setText("Skor : "+bizimskor);
     bilB.remove(y);
     y=random.nextInt(bilbkartlar.size());
     bilbkartlar.get(y).setVisible(false);
     bilbkartlar.remove(y);
     }
     else if(dizi2[x]>dizi[x])
     {
         
         bizimskor+=10;
         kullanıcı.setSkor(bizimskor);
         pcSkor.setText("Skor : "+bilskor);
          kullanıcıSkor.setText("Skor : "+bizimskor);
     bilB.remove(y);
     y=random.nextInt(bilbkartlar.size());
    bilbkartlar.get(y).setVisible(false);
     bilbkartlar.remove(y);
     }
     else
     {
         bilbkartlar.get(y).setVisible(false);
          Sleep sleep=new Sleep();
         sleep.tutucu(JLABEL8, this, y,bizimB.get(3).getDosyayolu(),3);
         sleep.start();
     }
     String[] dizi3=new String[3];
     dizi3[0]="Serbest Atıs : ";
     dizi3[1]="İkilik : ";
     dizi3[2]="Üçlük : ";
     BİLOZELLIKLERI.setText(dizi3[x]+dizi[x]); 
     BIZIMOZELLIKLER.setText(dizi3[x]+dizi2[x]);
    
    }//GEN-LAST:event_JLABEL8MouseClicked
  
    private void KimKazandiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KimKazandiMouseClicked
        if(bilskor>bizimskor)
        {
            KimKazandi.setText("KAYBETTİNİZ");
        }
        else if(bilskor<bizimskor)
        {
            KimKazandi.setText("KAZANDINIZ");
        }
        else 
             KimKazandi.setText("BERABERE");
    }//GEN-LAST:event_KimKazandiMouseClicked
  
   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(javakart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(javakart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(javakart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(javakart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new javakart().setVisible(true);
             
                
            }
           
        });
    }
    
    ArrayList<Futbolcu> bizimF=new ArrayList<Futbolcu>();
    ArrayList<Futbolcu> bilF=new ArrayList<Futbolcu>();
    ArrayList<Basketbolcu> bizimB=new ArrayList<Basketbolcu>();
    ArrayList<Basketbolcu> bilB=new ArrayList<Basketbolcu>();
    ArrayList<JLabel> bilfkartlar=new ArrayList<JLabel>();    
    ArrayList<JLabel> bilbkartlar=new ArrayList<JLabel>();

      public void labelTutan(ArrayList<JLabel> bilfler,ArrayList<JLabel> bilbler)
      {
          bilfkartlar=bilfler;        
          bilbkartlar=bilbler;
   
      }
    
    public void Bizimkartlar(ArrayList<Futbolcu> bizimfler,ArrayList<Basketbolcu> bizimbler)
    {
             
         bizimF=bizimfler;
        bizimB=bizimbler;
       
       }
    public void Pckartlar(ArrayList<Futbolcu> bilf,ArrayList<Basketbolcu> bilb)
    {
        bilF=bilf;
        bilB=bilb;
    }
  
    public ArrayList<Futbolcu> getBizimF() {
        return bizimF;
    }

    public void setBizimF(ArrayList<Futbolcu> bizimF) {
        this.bizimF = bizimF;
    }

    public JLabel getARKAPLAN() {
        return ARKAPLAN;
    }

    public void setARKAPLAN(JLabel ARKAPLAN) {
        this.ARKAPLAN = ARKAPLAN;
    }

    public JLabel getJLABEL1() {
        return JLABEL1;
    }

    public void setJLABEL1(JLabel JLABEL1) {
        this.JLABEL1=JLABEL1;
      
       
    }
  public void BizimKartlar()
  {

     JLABEL1.setIcon(new javax.swing.ImageIcon(bizimF.get(0).getDosyayolu()));
     JLABEL3.setIcon(new javax.swing.ImageIcon(bizimF.get(1).getDosyayolu()));
      JLABEL5.setIcon(new javax.swing.ImageIcon(bizimF.get(2).getDosyayolu()));
     JLABEL7.setIcon(new javax.swing.ImageIcon(bizimF.get(3).getDosyayolu()));
      JLABEL2.setIcon(new javax.swing.ImageIcon(bizimB.get(0).getDosyayolu()));
     JLABEL4.setIcon(new javax.swing.ImageIcon(bizimB.get(1).getDosyayolu()));
      JLABEL6.setIcon(new javax.swing.ImageIcon(bizimB.get(2).getDosyayolu()));
     JLABEL8.setIcon(new javax.swing.ImageIcon(bizimB.get(3).getDosyayolu()));
     JLABEL9.setIcon(new javax.swing.ImageIcon("src\\IMG\\FARKAYUZ.png"));
     JLABEL11.setIcon(new javax.swing.ImageIcon("src\\IMG\\FARKAYUZ.png"));
     JLABEL13.setIcon(new javax.swing.ImageIcon("src\\IMG\\FARKAYUZ.png"));
     JLABEL15.setIcon(new javax.swing.ImageIcon("src\\IMG\\FARKAYUZ.png"));
     JLABEL10.setIcon(new javax.swing.ImageIcon("src\\IMG\\BARKAYUZ.png"));
     JLABEL12.setIcon(new javax.swing.ImageIcon("src\\IMG\\BARKAYUZ.png"));
     JLABEL14.setIcon(new javax.swing.ImageIcon("src\\IMG\\BARKAYUZ.png"));
     JLABEL16.setIcon(new javax.swing.ImageIcon("src\\IMG\\BARKAYUZ.png"));
  }
    public JLabel getJLABEL10() {
        return JLABEL10;
    }

    public void setJLABEL10(JLabel JLABEL10) {
        this.JLABEL10 = JLABEL10;
    }

    public JLabel getJLABEL11() {
        return JLABEL11;
    }

    public void setJLABEL11(JLabel JLABEL11) {
        this.JLABEL11 = JLABEL11;
    }

    public JLabel getJLABEL12() {
        return JLABEL12;
    }

    public void setJLABEL12(JLabel JLABEL12) {
        this.JLABEL12 = JLABEL12;
    }

    public JLabel getJLABEL13() {
        return JLABEL13;
    }

    public void setJLABEL13(JLabel JLABEL13) {
        this.JLABEL13 = JLABEL13;
    }

    public JLabel getJLABEL14() {
        return JLABEL14;
    }

    public void setJLABEL14(JLabel JLABEL14) {
        this.JLABEL14 = JLABEL14;
    }

    public JLabel getJLABEL15() {
        return JLABEL15;
    }

    public void setJLABEL15(JLabel JLABEL15) {
        this.JLABEL15 = JLABEL15;
    }

    public JLabel getJLABEL16() {
        return JLABEL16;
    }

    public void setJLABEL16(JLabel JLABEL16) {
        this.JLABEL16 = JLABEL16;
    }

    public JLabel getJLABEL2() {
        return JLABEL2;
    }

    public void setJLABEL2(JLabel JLABEL2) {
        this.JLABEL2 = JLABEL2;
    }

    public JLabel getJLABEL3() {
        return JLABEL3;
    }

    public void setJLABEL3(JLabel JLABEL3) {
        this.JLABEL3 = JLABEL3;
    }

    public JLabel getJLABEL4() {
        return JLABEL4;
    }

    public void setJLABEL4(JLabel JLABEL4) {
        this.JLABEL4 = JLABEL4;
    }

    public JLabel getJLABEL5() {
        return JLABEL5;
    }

    public void setJLABEL5(JLabel JLABEL5) {
        this.JLABEL5 = JLABEL5;
    }

    public JLabel getJLABEL6() {
        return JLABEL6;
    }

    public void setJLABEL6(JLabel JLABEL6) {
        this.JLABEL6 = JLABEL6;
    }

    public JLabel getJLABEL7() {
        return JLABEL7;
    }

    public JLabel getKullaniciId() {
        return KullaniciId;
    }

    public void setKullaniciId(JLabel KullaniciId) {
        this.KullaniciId = KullaniciId;
    }

    public JLabel getKullaniciad() {
        return Kullaniciad;
    }

    public void setKullaniciad(JLabel Kullaniciad) {
        this.Kullaniciad = Kullaniciad;
    }
    

    public void setJLABEL7(JLabel JLABEL7) {
        this.JLABEL7 = JLABEL7;
    }

    public JLabel getJLABEL8() {
        return JLABEL8;
    }

    public void setJLABEL8(JLabel JLABEL8) {
        this.JLABEL8 = JLABEL8;
    }

    public JLabel getJLABEL9() {
        return JLABEL9;
    }

    public void setJLABEL9(JLabel JLABEL9) {
        this.JLABEL9 = JLABEL9;
    }

    public JLabel getjLabel17() {
        return jLabel17;
    }

    public void setjLabel17(JLabel jLabel17) {
        this.jLabel17 = jLabel17;
    }

    public JLabel getjLabel18() {
        return jLabel18;
    }

    public void setjLabel18(JLabel jLabel18) {
        this.jLabel18 = jLabel18;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ARKAPLAN;
    private javax.swing.JLabel BIZIMOZELLIKLER;
    private javax.swing.JLabel BİLOZELLIKLERI;
    private javax.swing.JLabel JLABEL1;
    private javax.swing.JLabel JLABEL10;
    private javax.swing.JLabel JLABEL11;
    private javax.swing.JLabel JLABEL12;
    private javax.swing.JLabel JLABEL13;
    private javax.swing.JLabel JLABEL14;
    private javax.swing.JLabel JLABEL15;
    private javax.swing.JLabel JLABEL16;
    private javax.swing.JLabel JLABEL2;
    private javax.swing.JLabel JLABEL3;
    private javax.swing.JLabel JLABEL4;
    private javax.swing.JLabel JLABEL5;
    private javax.swing.JLabel JLABEL6;
    private javax.swing.JLabel JLABEL7;
    private javax.swing.JLabel JLABEL8;
    private javax.swing.JLabel JLABEL9;
    private javax.swing.JButton KimKazandi;
    private javax.swing.JLabel KullaniciId;
    private javax.swing.JLabel Kullaniciad;
    private javax.swing.JLabel PCAD;
    private javax.swing.JLabel VS;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton kullanıcıSkor;
    private javax.swing.JButton pcSkor;
    // End of variables declaration//GEN-END:variables

}
