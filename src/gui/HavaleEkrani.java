package gui;

import database.IBilgiController;
import database.transactions.Havale;
import database.transactions.HesapBilgileri;
import gui.ayarlar.ActionAyarlari;
import gui.ayarlar.Dialogs;
import gui.ayarlar.IDuzenleyici;
import gui.ayarlar.TextAyarlari;
import javax.swing.JOptionPane;

public class HavaleEkrani extends javax.swing.JFrame implements IDuzenleyici, IBilgiController {

    private Havale havaleObject = null;

    public final String MUSTERI_NO_TEXT_ORIGIAL = "Müşteri No";
    private int gonderilecekMiktar = 0;

    public HavaleEkrani() {
        initComponents();
        getEdits();
    }

    @Override
    public void getEdits() {
        this.setLocationRelativeTo(null);
        havaleEkraniPanel.setFocusable(true);
        TextAyarlari.setOnlyNumber(gondereceginizMiktarText);
        TextAyarlari.setmaxLimit(gondereceginizMiktarText, 5);
        TextAyarlari.setOnlyNumber(musteriNoText);
        musteriNoText.setText(MUSTERI_NO_TEXT_ORIGIAL);
        this.kullaniciAdiSoyadiLabel.setText("Sayın " + getHesapBilgileri().getAdSoyad());
        this.bakiyeLabel.setText(String.valueOf(getHesapBilgileri().getBakiye()));
    }

    @Override
    public boolean bilgilerGecerliMi() {
        return !(this.gondereceginizMiktarText.getText().equals("")
                || this.musteriNoText.getText().equals(this.MUSTERI_NO_TEXT_ORIGIAL));
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        return HesapBilgileri.getInstance();
    }

    public Havale getHavaleObject() {
        if (this.havaleObject == null) {
            havaleObject = new Havale();
        }
        return havaleObject;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        havaleEkraniPanel = new javax.swing.JPanel();
        kullaniciAdiSoyadiLabel = new javax.swing.JLabel();
        toplamBakiyenizLabel = new javax.swing.JLabel();
        limitUyariLabel = new javax.swing.JLabel();
        bakiyeLabel = new javax.swing.JLabel();
        gondereceginizMiktarLabel = new javax.swing.JLabel();
        gondereceginizMiktarText = new javax.swing.JTextField();
        havaleButton = new javax.swing.JButton();
        geriIcon = new javax.swing.JLabel();
        musteriNoText = new javax.swing.JTextField();
        havaleAlacakKisiLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        havaleEkraniPanel.setBackground(new java.awt.Color(204, 204, 255));

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
        limitUyariLabel.setText("Tek seferde maksimum 20000 tl gönderebilirsiniz !");

        bakiyeLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        bakiyeLabel.setForeground(new java.awt.Color(0, 0, 0));
        bakiyeLabel.setText("[BAKİYE]");

        gondereceginizMiktarLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        gondereceginizMiktarLabel.setForeground(new java.awt.Color(0, 0, 0));
        gondereceginizMiktarLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        gondereceginizMiktarLabel.setText("Göndereceğiniz Miktar :");

        gondereceginizMiktarText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gondereceginizMiktarTextActionPerformed(evt);
            }
        });
        gondereceginizMiktarText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                gondereceginizMiktarTextKeyReleased(evt);
            }
        });

        havaleButton.setText("Havale Yap");
        havaleButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        havaleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                havaleButtonActionPerformed(evt);
            }
        });

        geriIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/ayarlar/iconlar/previousIcon.png"))); // NOI18N
        geriIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        geriIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                geriIconMouseClicked(evt);
            }
        });

        musteriNoText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                musteriNoTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                musteriNoTextFocusLost(evt);
            }
        });
        musteriNoText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                musteriNoTextActionPerformed(evt);
            }
        });
        musteriNoText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                musteriNoTextKeyReleased(evt);
            }
        });

        havaleAlacakKisiLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        havaleAlacakKisiLabel.setForeground(new java.awt.Color(0, 0, 0));
        havaleAlacakKisiLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        havaleAlacakKisiLabel.setText("Havale Alacak Kişi :");

        javax.swing.GroupLayout havaleEkraniPanelLayout = new javax.swing.GroupLayout(havaleEkraniPanel);
        havaleEkraniPanel.setLayout(havaleEkraniPanelLayout);
        havaleEkraniPanelLayout.setHorizontalGroup(
            havaleEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(havaleEkraniPanelLayout.createSequentialGroup()
                .addGroup(havaleEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(havaleEkraniPanelLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(kullaniciAdiSoyadiLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(havaleEkraniPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(geriIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(havaleEkraniPanelLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addGroup(havaleEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gondereceginizMiktarLabel)
                            .addComponent(toplamBakiyenizLabel))
                        .addGap(41, 41, 41)
                        .addComponent(havaleButton))
                    .addGroup(havaleEkraniPanelLayout.createSequentialGroup()
                        .addGap(327, 327, 327)
                        .addComponent(bakiyeLabel))
                    .addGroup(havaleEkraniPanelLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(havaleAlacakKisiLabel)
                        .addGap(49, 49, 49)
                        .addGroup(havaleEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(musteriNoText, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gondereceginizMiktarText, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(havaleEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(havaleEkraniPanelLayout.createSequentialGroup()
                    .addGap(129, 129, 129)
                    .addComponent(limitUyariLabel)
                    .addContainerGap(143, Short.MAX_VALUE)))
        );

        havaleEkraniPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {gondereceginizMiktarText, musteriNoText});

        havaleEkraniPanelLayout.setVerticalGroup(
            havaleEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(havaleEkraniPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(geriIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(kullaniciAdiSoyadiLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96)
                .addGroup(havaleEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(toplamBakiyenizLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bakiyeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(havaleEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gondereceginizMiktarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gondereceginizMiktarText, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(havaleEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(havaleAlacakKisiLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(musteriNoText, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(havaleButton)
                .addContainerGap(63, Short.MAX_VALUE))
            .addGroup(havaleEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(havaleEkraniPanelLayout.createSequentialGroup()
                    .addGap(143, 143, 143)
                    .addComponent(limitUyariLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(294, Short.MAX_VALUE)))
        );

        havaleEkraniPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {havaleButton, musteriNoText});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(havaleEkraniPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(havaleEkraniPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gondereceginizMiktarTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gondereceginizMiktarTextActionPerformed
    }//GEN-LAST:event_gondereceginizMiktarTextActionPerformed

    private void gondereceginizMiktarTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_gondereceginizMiktarTextKeyReleased
        this.gonderilecekMiktar = TextAyarlari.checkTheTextKeyReleased(gondereceginizMiktarText, 20000);
    }//GEN-LAST:event_gondereceginizMiktarTextKeyReleased

    private void havaleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_havaleButtonActionPerformed

        if (this.bilgilerGecerliMi()) {
            this.havaleYap();
        } else {
            Dialogs.bosOlamazMesajiGoster(this);
        }


    }//GEN-LAST:event_havaleButtonActionPerformed

    private void havaleYap() {
        getHavaleObject().setGonderilecekMiktar(this.gonderilecekMiktar);
        getHavaleObject().setHavaleAlacakKisi(this.musteriNoText.getText());

        if (getHavaleObject().havaleYapildiMi()) {
            Dialogs.ozelMesajGoster(this, "Havale işlemi başarıyla gerçekleşmiştir.\n"
                    + "Gönderilen müşteri numarası:" + this.musteriNoText.getText()
                    + "\nGönderilen Miktar:" + this.gonderilecekMiktar + " TL");
            ActionAyarlari.setVisible(this, new HesapEkrani());
        } else {
            Dialogs.ozelMesajGoster(this, "Havale işlemi gerçekleştirilemedi.\n"
                    + "Lütfen bilgilerinizi kontrol edin!");
        }
    }

    private void geriIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_geriIconMouseClicked
        ActionAyarlari.setVisible(this, new HesapEkrani());
    }//GEN-LAST:event_geriIconMouseClicked

    private void musteriNoTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_musteriNoTextActionPerformed
    }//GEN-LAST:event_musteriNoTextActionPerformed

    private void musteriNoTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_musteriNoTextKeyReleased
    }//GEN-LAST:event_musteriNoTextKeyReleased

    private void musteriNoTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_musteriNoTextFocusGained
        TextAyarlari.checkTheTextFocusGained(musteriNoText, MUSTERI_NO_TEXT_ORIGIAL);
    }//GEN-LAST:event_musteriNoTextFocusGained

    private void musteriNoTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_musteriNoTextFocusLost
        TextAyarlari.checkTheTextFocusLost(musteriNoText);
    }//GEN-LAST:event_musteriNoTextFocusLost

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
            java.util.logging.Logger.getLogger(HavaleEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HavaleEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HavaleEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HavaleEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HavaleEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bakiyeLabel;
    private javax.swing.JLabel geriIcon;
    private javax.swing.JLabel gondereceginizMiktarLabel;
    private javax.swing.JTextField gondereceginizMiktarText;
    private javax.swing.JLabel havaleAlacakKisiLabel;
    private javax.swing.JButton havaleButton;
    private javax.swing.JPanel havaleEkraniPanel;
    private javax.swing.JLabel kullaniciAdiSoyadiLabel;
    private javax.swing.JLabel limitUyariLabel;
    private javax.swing.JTextField musteriNoText;
    private javax.swing.JLabel toplamBakiyenizLabel;
    // End of variables declaration//GEN-END:variables
}
