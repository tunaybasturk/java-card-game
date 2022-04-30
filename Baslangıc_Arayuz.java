
public class Baslangıc_Arayuz extends javax.swing.JFrame {
 String kullaniciad;
 String id;
  
    public Baslangıc_Arayuz() {
        initComponents();
        this.setAlwaysOnTop(true);
        this.setBounds(0,0,1920,1080);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        adLabel = new javax.swing.JLabel();
        IdLabel = new javax.swing.JLabel();
        Basla = new javax.swing.JButton();
        kullanıcAd = new javax.swing.JTextField();
        idAlani = new javax.swing.JTextField();
        Arkaplan = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        adLabel.setBackground(new java.awt.Color(255, 255, 255));
        adLabel.setFont(new java.awt.Font("Algerian", 1, 50)); // NOI18N
        adLabel.setForeground(new java.awt.Color(204, 204, 255));
        adLabel.setText("KULLANICI AD :");
        getContentPane().add(adLabel);
        adLabel.setBounds(400, 480, 470, 50);

        IdLabel.setFont(new java.awt.Font("Algerian", 1, 50)); // NOI18N
        IdLabel.setForeground(new java.awt.Color(204, 204, 255));
        IdLabel.setText("KULLANICI  ID :");
        getContentPane().add(IdLabel);
        IdLabel.setBounds(400, 550, 470, 50);

        Basla.setFont(new java.awt.Font("Algerian", 1, 50)); // NOI18N
        Basla.setText("BASLAT");
        Basla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BaslaMouseClicked(evt);
            }
        });
        Basla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BaslaActionPerformed(evt);
            }
        });
        getContentPane().add(Basla);
        Basla.setBounds(730, 650, 500, 50);
        getContentPane().add(kullanıcAd);
        kullanıcAd.setBounds(820, 480, 625, 50);

        idAlani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idAlaniActionPerformed(evt);
            }
        });
        getContentPane().add(idAlani);
        idAlani.setBounds(820, 550, 625, 50);

        Arkaplan.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Documents\\NetBeansProjects\\Java Proje\\src\\IMG\\Arkayuz2.jpg")); // NOI18N
        Arkaplan.setText("jLabel1");
        Arkaplan.setMaximumSize(new java.awt.Dimension(1920, 1080));
        Arkaplan.setMinimumSize(new java.awt.Dimension(1920, 1080));
        Arkaplan.setPreferredSize(new java.awt.Dimension(1920, 1080));
        Arkaplan.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(Arkaplan);
        Arkaplan.setBounds(0, 0, 1920, 1080);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1940, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1102, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1940, 1102);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idAlaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idAlaniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idAlaniActionPerformed

    private void BaslaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BaslaActionPerformed
        kullaniciad=kullanıcAd.getText();
        id=idAlani.getText();
       
        arayuz.getKullaniciad().setText(kullaniciad);
        arayuz.getKullaniciId().setText(id);
        
 
    }//GEN-LAST:event_BaslaActionPerformed

    private void BaslaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BaslaMouseClicked
         this.setVisible(false);
         arayuz.setVisible(true);
        
    }//GEN-LAST:event_BaslaMouseClicked
  javakart arayuz=new javakart();

    public javakart getArayuz() {
        return arayuz;
    }

    public void setArayuz(javakart arayuz) {
        this.arayuz = arayuz;
    }

    public String getKullaniciad() {
        return kullaniciad;
    }

    public void setKullaniciad(String kullaniciad) {
        this.kullaniciad = kullaniciad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    

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
            java.util.logging.Logger.getLogger(Baslangıc_Arayuz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Baslangıc_Arayuz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Baslangıc_Arayuz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Baslangıc_Arayuz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Baslangıc_Arayuz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Arkaplan;
    private javax.swing.JButton Basla;
    private javax.swing.JLabel IdLabel;
    private javax.swing.JLabel adLabel;
    private javax.swing.JTextField idAlani;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField kullanıcAd;
    // End of variables declaration//GEN-END:variables
}
