package gui;

import database.IBilgiController;
import database.transactions.HesapBilgileri;
import database.transactions.ParaCekme;
import gui.ayarlar.ActionAyarlari;
import gui.ayarlar.Dialogs;
import gui.ayarlar.IDuzenleyici;
import gui.ayarlar.TextAyarlari;
import javax.swing.JOptionPane;

public class ParaCekmeEkrani extends javax.swing.JFrame implements IDuzenleyici, IBilgiController {

    private ParaCekme paraCekmeObject = null;
    private int cekilecekMiktar = 0;

    public ParaCekmeEkrani() {
        initComponents();
        getEdits();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paraCekmeEkraniPanel = new javax.swing.JPanel();
        kullaniciAdiSoyadiLabel = new javax.swing.JLabel();
        toplamBakiyenizLabel = new javax.swing.JLabel();
        limitUyariLabel = new javax.swing.JLabel();
        bakiyeLabel = new javax.swing.JLabel();
        cekeceginizMiktarLabel = new javax.swing.JLabel();
        cekilecekMiktarText = new javax.swing.JTextField();
        paraCekButton = new javax.swing.JButton();
        geriIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        paraCekmeEkraniPanel.setBackground(new java.awt.Color(0, 60, 104));

        kullaniciAdiSoyadiLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        kullaniciAdiSoyadiLabel.setForeground(new java.awt.Color(0, 153, 153));
        kullaniciAdiSoyadiLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        kullaniciAdiSoyadiLabel.setText("Sayın [Kullanıcı Adı Soyadı]");

        toplamBakiyenizLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        toplamBakiyenizLabel.setForeground(new java.awt.Color(0, 0, 0));
        toplamBakiyenizLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        toplamBakiyenizLabel.setText("Toplam Bakiyeniz :");

        limitUyariLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        limitUyariLabel.setForeground(new java.awt.Color(0, 0, 0));
        limitUyariLabel.setText("Tek seferde maksimum 5000 tl çekebilirsiniz !");

        bakiyeLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        bakiyeLabel.setForeground(new java.awt.Color(0, 0, 0));
        bakiyeLabel.setText("[BAKİYE]");

        cekeceginizMiktarLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        cekeceginizMiktarLabel.setForeground(new java.awt.Color(0, 0, 0));
        cekeceginizMiktarLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        cekeceginizMiktarLabel.setText("Çekeceğiniz Miktar :");

        cekilecekMiktarText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cekilecekMiktarTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cekilecekMiktarTextFocusLost(evt);
            }
        });
        cekilecekMiktarText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cekilecekMiktarTextActionPerformed(evt);
            }
        });
        cekilecekMiktarText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cekilecekMiktarTextKeyReleased(evt);
            }
        });

        paraCekButton.setText("Para Çek");
        paraCekButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        paraCekButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paraCekButtonActionPerformed(evt);
            }
        });

        geriIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/ayarlar/iconlar/previousIcon.png"))); // NOI18N
        geriIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        geriIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                geriIconMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout paraCekmeEkraniPanelLayout = new javax.swing.GroupLayout(paraCekmeEkraniPanel);
        paraCekmeEkraniPanel.setLayout(paraCekmeEkraniPanelLayout);
        paraCekmeEkraniPanelLayout.setHorizontalGroup(
            paraCekmeEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paraCekmeEkraniPanelLayout.createSequentialGroup()
                .addGroup(paraCekmeEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paraCekmeEkraniPanelLayout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addGroup(paraCekmeEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(paraCekmeEkraniPanelLayout.createSequentialGroup()
                                .addComponent(toplamBakiyenizLabel)
                                .addGap(18, 18, 18)
                                .addComponent(bakiyeLabel))
                            .addGroup(paraCekmeEkraniPanelLayout.createSequentialGroup()
                                .addComponent(cekeceginizMiktarLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(paraCekmeEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cekilecekMiktarText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(paraCekButton)))))
                    .addGroup(paraCekmeEkraniPanelLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(kullaniciAdiSoyadiLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(paraCekmeEkraniPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(geriIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(paraCekmeEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(paraCekmeEkraniPanelLayout.createSequentialGroup()
                    .addGap(129, 129, 129)
                    .addComponent(limitUyariLabel)
                    .addContainerGap(143, Short.MAX_VALUE)))
        );

        paraCekmeEkraniPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cekeceginizMiktarLabel, cekilecekMiktarText, paraCekButton});

        paraCekmeEkraniPanelLayout.setVerticalGroup(
            paraCekmeEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paraCekmeEkraniPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(geriIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(kullaniciAdiSoyadiLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96)
                .addGroup(paraCekmeEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(toplamBakiyenizLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bakiyeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paraCekmeEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cekeceginizMiktarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cekilecekMiktarText, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(paraCekButton)
                .addContainerGap(102, Short.MAX_VALUE))
            .addGroup(paraCekmeEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(paraCekmeEkraniPanelLayout.createSequentialGroup()
                    .addGap(143, 143, 143)
                    .addComponent(limitUyariLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(294, Short.MAX_VALUE)))
        );

        paraCekmeEkraniPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {limitUyariLabel, toplamBakiyenizLabel});

        paraCekmeEkraniPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {bakiyeLabel, cekilecekMiktarText});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paraCekmeEkraniPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paraCekmeEkraniPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void getEdits() {
        this.setLocationRelativeTo(null);
        paraCekmeEkraniPanel.setFocusable(true);
        TextAyarlari.setOnlyNumber(cekilecekMiktarText);
        TextAyarlari.setmaxLimit(cekilecekMiktarText, 4);
        this.kullaniciAdiSoyadiLabel.setText("Sayın"+this.getHesapBilgileri().getAdSoyad());
        this.bakiyeLabel.setText(String.valueOf(this.getHesapBilgileri().getBakiye()));

    }

    @Override
    public boolean bilgilerGecerliMi() {
        return !(this.cekilecekMiktarText.getText().equals(""));
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        return HesapBilgileri.getInstance();
    }

    public ParaCekme getParaCekmeObject() {
        if(this.paraCekmeObject==null){
            paraCekmeObject = new ParaCekme();
        }
        return paraCekmeObject;
    }


    private void cekilecekMiktarTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cekilecekMiktarTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cekilecekMiktarTextActionPerformed

    private void cekilecekMiktarTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cekilecekMiktarTextKeyReleased
        this.cekilecekMiktar = TextAyarlari.checkTheTextKeyReleased(cekilecekMiktarText, 5000);
    }//GEN-LAST:event_cekilecekMiktarTextKeyReleased

    private void geriIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_geriIconMouseClicked
        ActionAyarlari.setVisible(this, new HesapEkrani());
    }//GEN-LAST:event_geriIconMouseClicked

    private void paraCekButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paraCekButtonActionPerformed
       if(this.bilgilerGecerliMi()){
            this.paraCek();
       }else{
           Dialogs.bosOlamazMesajiGoster(this);
       }
    }//GEN-LAST:event_paraCekButtonActionPerformed
    private void paraCek(){
         this.getParaCekmeObject().setCekilecekMiktar(cekilecekMiktar);
         
         if(getParaCekmeObject().paraCekildiMi()){
             Dialogs.ozelMesajGoster(this, "Para Çekme İşlemi Başarılı");
             ActionAyarlari.setVisible(this, new HesapEkrani());
         }else{
             Dialogs.ozelMesajGoster(this, "Bakiyeniz yetersizdir");
         }
    }
    private void cekilecekMiktarTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cekilecekMiktarTextFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_cekilecekMiktarTextFocusLost

    private void cekilecekMiktarTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cekilecekMiktarTextFocusGained
      //  TextAyarlari.checkTheTextFocusGained(musteri, org);
    }//GEN-LAST:event_cekilecekMiktarTextFocusGained

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(ParaCekmeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ParaCekmeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ParaCekmeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ParaCekmeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ParaCekmeEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bakiyeLabel;
    private javax.swing.JLabel cekeceginizMiktarLabel;
    private javax.swing.JTextField cekilecekMiktarText;
    private javax.swing.JLabel geriIcon;
    private javax.swing.JLabel kullaniciAdiSoyadiLabel;
    private javax.swing.JLabel limitUyariLabel;
    private javax.swing.JButton paraCekButton;
    private javax.swing.JPanel paraCekmeEkraniPanel;
    private javax.swing.JLabel toplamBakiyenizLabel;
    // End of variables declaration//GEN-END:variables
}
