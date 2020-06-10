package gui;

import database.IBilgiController;
import database.transactions.FaturaOdemeleri;
import database.transactions.HesapBilgileri;
import gui.ayarlar.ActionAyarlari;
import gui.ayarlar.ButonAyarlari;
import gui.ayarlar.Dialogs;
import gui.ayarlar.IDuzenleyici;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class OdemelerEkrani extends javax.swing.JFrame implements IDuzenleyici, IBilgiController {

    private FaturaOdemeleri faturaOdemeleriObject = null;

    public OdemelerEkrani() {
        initComponents();
        getEdits();
    }

    public FaturaOdemeleri getFaturaOdemeleriObject() {
        if (this.faturaOdemeleriObject == null) {
            faturaOdemeleriObject = new FaturaOdemeleri();
        }
        return faturaOdemeleriObject;
    }

    @Override
    public void getEdits() {
        this.setLocationRelativeTo(null);
        this.setFocusable(true);
        this.kullaniciAdiSoyadiLabel.setText("Sayın " + getHesapBilgileri().getAdSoyad());
        this.elektrikBorcu.setText(String.valueOf(getHesapBilgileri().getElektrikFaturasi()));
        this.suBorcu.setText(String.valueOf(getHesapBilgileri().getSuFaturasi()));
        this.dogalgazBorcu.setText(String.valueOf(getHesapBilgileri().getDogalgazFaturasi()));
        this.internetBorcu.setText(String.valueOf(getHesapBilgileri().getInternetFaturasi()));
    }

    @Override
    public boolean bilgilerGecerliMi() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        return HesapBilgileri.getInstance();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        odemelerEkraniPanel = new javax.swing.JPanel();
        kullaniciAdiSoyadiLabel = new javax.swing.JLabel();
        geriIcon = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        elektrikBorcu = new javax.swing.JLabel();
        elektrikOdeButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        suBorcu = new javax.swing.JLabel();
        suOdeButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        dogalgazBorcu = new javax.swing.JLabel();
        dogalgazOdeButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        internetBorcu = new javax.swing.JLabel();
        internetOdeButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Çiftlik Bank Ödemeler Ekranı");

        odemelerEkraniPanel.setBackground(new java.awt.Color(0, 60, 104));

        kullaniciAdiSoyadiLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        kullaniciAdiSoyadiLabel.setForeground(new java.awt.Color(0, 153, 153));
        kullaniciAdiSoyadiLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        kullaniciAdiSoyadiLabel.setText("Sayın [Kullanıcı Adı Soyadı]");

        geriIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/ayarlar/iconlar/previousIcon.png"))); // NOI18N
        geriIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        geriIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                geriIconMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Toplam Elektrik Faturası Borcunuz  :");

        elektrikBorcu.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        elektrikBorcu.setForeground(new java.awt.Color(0, 0, 0));
        elektrikBorcu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        elektrikBorcu.setText("[ELEKT BORC]");

        elektrikOdeButton.setBackground(new java.awt.Color(51, 51, 51));
        elektrikOdeButton.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        elektrikOdeButton.setText("ÖDE");
        elektrikOdeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        elektrikOdeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                elektrikOdeButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                elektrikOdeButtonMouseExited(evt);
            }
        });
        elektrikOdeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elektrikOdeButtonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Toplam Su Faturası Borcunuz  :");

        suBorcu.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        suBorcu.setForeground(new java.awt.Color(0, 0, 0));
        suBorcu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        suBorcu.setText("[SU BORC]");

        suOdeButton.setBackground(new java.awt.Color(51, 51, 51));
        suOdeButton.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        suOdeButton.setText("ÖDE");
        suOdeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        suOdeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                suOdeButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                suOdeButtonMouseExited(evt);
            }
        });
        suOdeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suOdeButtonActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Toplam Doğalgaz Faturası Borcunuz  :");

        dogalgazBorcu.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        dogalgazBorcu.setForeground(new java.awt.Color(0, 0, 0));
        dogalgazBorcu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dogalgazBorcu.setText("[DGLGZ BORC]");

        dogalgazOdeButton.setBackground(new java.awt.Color(51, 51, 51));
        dogalgazOdeButton.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        dogalgazOdeButton.setText("ÖDE");
        dogalgazOdeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dogalgazOdeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dogalgazOdeButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dogalgazOdeButtonMouseExited(evt);
            }
        });
        dogalgazOdeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dogalgazOdeButtonActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Toplam İnternet Faturası Borcunuz  :");

        internetBorcu.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        internetBorcu.setForeground(new java.awt.Color(0, 0, 0));
        internetBorcu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        internetBorcu.setText("[INTRNT BORC]");

        internetOdeButton.setBackground(new java.awt.Color(51, 51, 51));
        internetOdeButton.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        internetOdeButton.setText("ÖDE");
        internetOdeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        internetOdeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                internetOdeButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                internetOdeButtonMouseExited(evt);
            }
        });
        internetOdeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                internetOdeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout odemelerEkraniPanelLayout = new javax.swing.GroupLayout(odemelerEkraniPanel);
        odemelerEkraniPanel.setLayout(odemelerEkraniPanelLayout);
        odemelerEkraniPanelLayout.setHorizontalGroup(
            odemelerEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(odemelerEkraniPanelLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(odemelerEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addGap(12, 12, 12)
                .addGroup(odemelerEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(odemelerEkraniPanelLayout.createSequentialGroup()
                        .addComponent(internetBorcu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addComponent(internetOdeButton))
                    .addGroup(odemelerEkraniPanelLayout.createSequentialGroup()
                        .addComponent(dogalgazBorcu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dogalgazOdeButton))
                    .addGroup(odemelerEkraniPanelLayout.createSequentialGroup()
                        .addComponent(suBorcu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(suOdeButton))
                    .addGroup(odemelerEkraniPanelLayout.createSequentialGroup()
                        .addComponent(elektrikBorcu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(elektrikOdeButton)))
                .addContainerGap())
            .addGroup(odemelerEkraniPanelLayout.createSequentialGroup()
                .addGroup(odemelerEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(odemelerEkraniPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(geriIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(odemelerEkraniPanelLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(kullaniciAdiSoyadiLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(43, 43, 43))
        );
        odemelerEkraniPanelLayout.setVerticalGroup(
            odemelerEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(odemelerEkraniPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(geriIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kullaniciAdiSoyadiLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(odemelerEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(elektrikBorcu)
                    .addComponent(elektrikOdeButton))
                .addGap(18, 18, 18)
                .addGroup(odemelerEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(suBorcu)
                    .addComponent(suOdeButton))
                .addGap(18, 18, 18)
                .addGroup(odemelerEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dogalgazBorcu)
                    .addComponent(dogalgazOdeButton))
                .addGap(18, 18, 18)
                .addGroup(odemelerEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(internetBorcu)
                    .addComponent(internetOdeButton))
                .addContainerGap(132, Short.MAX_VALUE))
        );

        odemelerEkraniPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {elektrikBorcu, jLabel1});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(odemelerEkraniPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(odemelerEkraniPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void geriIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_geriIconMouseClicked
        ActionAyarlari.setVisible(this, new HesapEkrani());
    }//GEN-LAST:event_geriIconMouseClicked

    private void elektrikOdeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elektrikOdeButtonActionPerformed
        double elektrikTutari = Double.valueOf(this.elektrikBorcu.getText());
        if (this.faturaOncedenOdenmisMi(elektrikTutari)) {
            Dialogs.ozelMesajGoster(this, "Elektrik faturası zaten ödenmiş!");
        } else {
            this.faturayiOde("elektrik", elektrikTutari);
        }
    }//GEN-LAST:event_elektrikOdeButtonActionPerformed

    private void suOdeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suOdeButtonActionPerformed
        double suTutari = Double.valueOf(this.suBorcu.getText());
        if (this.faturaOncedenOdenmisMi(suTutari)) {
            Dialogs.ozelMesajGoster(this, "Su faturası zaten ödenmiş!");
        } else {
            this.faturayiOde("su", suTutari);
        }
    }//GEN-LAST:event_suOdeButtonActionPerformed

    private void dogalgazOdeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dogalgazOdeButtonActionPerformed
        double dogalgazTutari = Double.valueOf(this.dogalgazBorcu.getText());
        if (this.faturaOncedenOdenmisMi(dogalgazTutari)) {
            Dialogs.ozelMesajGoster(this, "Doğalgaz faturası zaten ödenmiş!");
        } else {
            this.faturayiOde("dogalgaz", dogalgazTutari);
        }
    }//GEN-LAST:event_dogalgazOdeButtonActionPerformed

    private void internetOdeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_internetOdeButtonActionPerformed
       double internetTutari = Double.valueOf(this.internetBorcu.getText());
        if (this.faturaOncedenOdenmisMi(internetTutari)) {
            Dialogs.ozelMesajGoster(this, "İnternet faturası zaten ödenmiş!");
        } else {
            this.faturayiOde("internet", internetTutari);
        }
    }//GEN-LAST:event_internetOdeButtonActionPerformed

    private void setBgFg(Component c) {
        ButonAyarlari.setBgFg((JButton) c, Color.BLACK, Color.WHITE);
    }


    private void elektrikOdeButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_elektrikOdeButtonMouseEntered
        this.setBgFg(evt.getComponent());
    }//GEN-LAST:event_elektrikOdeButtonMouseEntered

    private void elektrikOdeButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_elektrikOdeButtonMouseExited
        ButonAyarlari.setOriginalBgFg((JButton) evt.getComponent());
    }//GEN-LAST:event_elektrikOdeButtonMouseExited

    private void suOdeButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_suOdeButtonMouseEntered
        this.setBgFg(evt.getComponent());
    }//GEN-LAST:event_suOdeButtonMouseEntered

    private void suOdeButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_suOdeButtonMouseExited
        ButonAyarlari.setOriginalBgFg((JButton) evt.getComponent());
    }//GEN-LAST:event_suOdeButtonMouseExited

    private void dogalgazOdeButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dogalgazOdeButtonMouseExited

        ButonAyarlari.setOriginalBgFg((JButton) evt.getComponent());
    }//GEN-LAST:event_dogalgazOdeButtonMouseExited

    private void dogalgazOdeButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dogalgazOdeButtonMouseEntered
        this.setBgFg(evt.getComponent());
    }//GEN-LAST:event_dogalgazOdeButtonMouseEntered

    private void internetOdeButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_internetOdeButtonMouseEntered
        this.setBgFg(evt.getComponent());
    }//GEN-LAST:event_internetOdeButtonMouseEntered

    private void internetOdeButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_internetOdeButtonMouseExited
        ButonAyarlari.setOriginalBgFg((JButton) evt.getComponent());
    }//GEN-LAST:event_internetOdeButtonMouseExited

    private boolean faturaOncedenOdenmisMi(double odenecekTutar) {
        return odenecekTutar == 0.0;
    }

    private void faturayiOde(String faturaIsmi, double faturaTutari) {
        this.getFaturaOdemeleriObject().setFaturaIsmi(faturaIsmi);
        this.getFaturaOdemeleriObject().setFaturaTutari(faturaTutari);

        if (getFaturaOdemeleriObject().faturaOdendiMi()) {
            Dialogs.ozelMesajGoster(this, "Faturanız başarıyla ödenmiştir.");
            ActionAyarlari.setVisible(this, new HesapEkrani());
        } else {
            Dialogs.ozelMesajGoster(this, "Ödeme işlemi gerçekleştirilemedi!");
        }
    }

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
            java.util.logging.Logger.getLogger(OdemelerEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OdemelerEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OdemelerEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OdemelerEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OdemelerEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dogalgazBorcu;
    private javax.swing.JButton dogalgazOdeButton;
    private javax.swing.JLabel elektrikBorcu;
    private javax.swing.JButton elektrikOdeButton;
    private javax.swing.JLabel geriIcon;
    private javax.swing.JLabel internetBorcu;
    private javax.swing.JButton internetOdeButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel kullaniciAdiSoyadiLabel;
    private javax.swing.JPanel odemelerEkraniPanel;
    private javax.swing.JLabel suBorcu;
    private javax.swing.JButton suOdeButton;
    // End of variables declaration//GEN-END:variables
}
