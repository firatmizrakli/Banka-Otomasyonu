package gui;

import gui.ayarlar.ActionAyarlari;
import gui.ayarlar.ButonAyarlari;
import gui.ayarlar.IDuzenleyici;
import gui.ayarlar.TextAyarlari;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

public class SifreYenilemeEkrani extends javax.swing.JFrame implements IDuzenleyici {

    public SifreYenilemeEkrani() {
        initComponents();
        getEdits();
    }

    @Override
    public void getEdits() {
        this.setLocationRelativeTo(null);
        sifreYenilemePanel.setFocusable(true);
        TextAyarlari.setOnlyNumber(tcNoText);
        TextAyarlari.setmaxLimit(tcNoText, 11);
        TextAyarlari.setOnlyNumber(telefonNotext);
        TextAyarlari.setmaxLimit(telefonNotext, 11);
    }

    public JPasswordField getEskiSifreText() {
        return eskiSifreText;
    }

    private boolean isEnabledEskiSifreText() {
        return this.getEskiSifreText().isEnabled();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sifreYenilemePanel = new javax.swing.JPanel();
        geriIcon = new javax.swing.JLabel();
        sifreYenilemeLabel = new javax.swing.JLabel();
        tcNoLabel = new javax.swing.JLabel();
        tcNoText = new javax.swing.JTextField();
        telefonNotext = new javax.swing.JTextField();
        telefonNoLabel = new javax.swing.JLabel();
        guvenlikCevapText = new javax.swing.JTextField();
        guvenlikCevapLabel = new javax.swing.JLabel();
        eskiSifreLabel = new javax.swing.JLabel();
        yeniSifreLabel = new javax.swing.JLabel();
        sifreTekrarLabel = new javax.swing.JLabel();
        eskiSifreText = new javax.swing.JPasswordField();
        sifreTekrarText = new javax.swing.JPasswordField();
        yeniSifreText = new javax.swing.JPasswordField();
        sifreyiYenileButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sifreYenilemePanel.setBackground(new java.awt.Color(0, 60, 104));

        geriIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/ayarlar/iconlar/previousIcon.png"))); // NOI18N
        geriIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        geriIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                geriIconMouseClicked(evt);
            }
        });

        sifreYenilemeLabel.setBackground(new java.awt.Color(153, 0, 153));
        sifreYenilemeLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        sifreYenilemeLabel.setForeground(new java.awt.Color(0, 0, 0));
        sifreYenilemeLabel.setText("Şifre Yenileme");

        tcNoLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        tcNoLabel.setForeground(new java.awt.Color(0, 0, 0));
        tcNoLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        tcNoLabel.setText("T.C. No :");

        tcNoText.setBackground(new java.awt.Color(204, 204, 204));
        tcNoText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tcNoTextActionPerformed(evt);
            }
        });

        telefonNotext.setBackground(new java.awt.Color(204, 204, 204));
        telefonNotext.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        telefonNotext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonNotextActionPerformed(evt);
            }
        });

        telefonNoLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        telefonNoLabel.setForeground(new java.awt.Color(0, 0, 0));
        telefonNoLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        telefonNoLabel.setText("Telefon No :");

        guvenlikCevapText.setBackground(new java.awt.Color(204, 204, 204));
        guvenlikCevapText.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        guvenlikCevapText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guvenlikCevapTextActionPerformed(evt);
            }
        });

        guvenlikCevapLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        guvenlikCevapLabel.setForeground(new java.awt.Color(0, 0, 0));
        guvenlikCevapLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        guvenlikCevapLabel.setText("Güvenlik Sorusu Cevabı :");

        eskiSifreLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        eskiSifreLabel.setForeground(new java.awt.Color(0, 0, 0));
        eskiSifreLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        eskiSifreLabel.setText("Eski Şifre :");

        yeniSifreLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        yeniSifreLabel.setForeground(new java.awt.Color(0, 0, 0));
        yeniSifreLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        yeniSifreLabel.setText("Yeni Şifre :");

        sifreTekrarLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        sifreTekrarLabel.setForeground(new java.awt.Color(0, 0, 0));
        sifreTekrarLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        sifreTekrarLabel.setText("Yeni Şifre Tekrar :");

        eskiSifreText.setBackground(new java.awt.Color(204, 204, 204));

        sifreTekrarText.setBackground(new java.awt.Color(204, 204, 204));

        yeniSifreText.setBackground(new java.awt.Color(204, 204, 204));

        sifreyiYenileButton.setBackground(new java.awt.Color(204, 204, 204));
        sifreyiYenileButton.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        sifreyiYenileButton.setForeground(new java.awt.Color(0, 0, 0));
        sifreyiYenileButton.setText("Şifreyi Yenile");
        sifreyiYenileButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sifreyiYenileButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sifreyiYenileButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sifreyiYenileButtonMouseExited(evt);
            }
        });
        sifreyiYenileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sifreyiYenileButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sifreYenilemePanelLayout = new javax.swing.GroupLayout(sifreYenilemePanel);
        sifreYenilemePanel.setLayout(sifreYenilemePanelLayout);
        sifreYenilemePanelLayout.setHorizontalGroup(
            sifreYenilemePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sifreYenilemePanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(sifreyiYenileButton)
                .addGap(189, 189, 189))
            .addGroup(sifreYenilemePanelLayout.createSequentialGroup()
                .addGroup(sifreYenilemePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sifreYenilemePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(sifreYenilemePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(guvenlikCevapLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(telefonNoLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tcNoLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eskiSifreLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yeniSifreLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sifreTekrarLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(sifreYenilemePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(guvenlikCevapText, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eskiSifreText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sifreTekrarText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yeniSifreText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(telefonNotext, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tcNoText, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(sifreYenilemePanelLayout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(sifreYenilemeLabel))
                    .addGroup(sifreYenilemePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(geriIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(168, Short.MAX_VALUE))
        );

        sifreYenilemePanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {eskiSifreText, guvenlikCevapText, sifreTekrarText, tcNoLabel, tcNoText, telefonNoLabel, telefonNotext, yeniSifreText});

        sifreYenilemePanelLayout.setVerticalGroup(
            sifreYenilemePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sifreYenilemePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(geriIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sifreYenilemeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(sifreYenilemePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tcNoLabel)
                    .addComponent(tcNoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(sifreYenilemePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefonNoLabel)
                    .addComponent(telefonNotext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(sifreYenilemePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(guvenlikCevapText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guvenlikCevapLabel))
                .addGap(29, 29, 29)
                .addGroup(sifreYenilemePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eskiSifreLabel)
                    .addComponent(eskiSifreText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(sifreYenilemePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yeniSifreLabel)
                    .addComponent(yeniSifreText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(sifreYenilemePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sifreTekrarText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sifreTekrarLabel))
                .addGap(18, 18, 18)
                .addComponent(sifreyiYenileButton)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        sifreYenilemePanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {sifreYenilemeLabel, tcNoLabel, tcNoText});

        sifreYenilemePanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {eskiSifreText, guvenlikCevapLabel, guvenlikCevapText, sifreTekrarText, sifreyiYenileButton, telefonNoLabel, telefonNotext, yeniSifreText});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sifreYenilemePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sifreYenilemePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void geriIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_geriIconMouseClicked
        if (isEnabledEskiSifreText()) {
            ActionAyarlari.setVisible(this, new AyarlarEkrani());

        }else{
            ActionAyarlari.setVisible(this, new GirisEkrani());
        }

    }//GEN-LAST:event_geriIconMouseClicked

    private void tcNoTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tcNoTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tcNoTextActionPerformed

    private void telefonNotextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonNotextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefonNotextActionPerformed

    private void guvenlikCevapTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guvenlikCevapTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_guvenlikCevapTextActionPerformed

    private void sifreyiYenileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sifreyiYenileButtonActionPerformed
        JOptionPane.showMessageDialog(this, "Şifre güncelleindi");
        if (isEnabledEskiSifreText()) {
            ActionAyarlari.setVisible(this, new HesapEkrani());

        }else{
            ActionAyarlari.setVisible(this, new GirisEkrani());
        }
    }//GEN-LAST:event_sifreyiYenileButtonActionPerformed

    private void sifreyiYenileButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sifreyiYenileButtonMouseEntered
        ButonAyarlari.setBgFg(sifreyiYenileButton, Color.cyan, Color.red);
    }//GEN-LAST:event_sifreyiYenileButtonMouseEntered

    private void sifreyiYenileButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sifreyiYenileButtonMouseExited
        ButonAyarlari.setOriginalBgFg(sifreyiYenileButton);
    }//GEN-LAST:event_sifreyiYenileButtonMouseExited

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
            java.util.logging.Logger.getLogger(SifreYenilemeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SifreYenilemeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SifreYenilemeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SifreYenilemeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SifreYenilemeEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel eskiSifreLabel;
    private javax.swing.JPasswordField eskiSifreText;
    private javax.swing.JLabel geriIcon;
    private javax.swing.JLabel guvenlikCevapLabel;
    private javax.swing.JTextField guvenlikCevapText;
    private javax.swing.JLabel sifreTekrarLabel;
    private javax.swing.JPasswordField sifreTekrarText;
    private javax.swing.JLabel sifreYenilemeLabel;
    private javax.swing.JPanel sifreYenilemePanel;
    private javax.swing.JButton sifreyiYenileButton;
    private javax.swing.JLabel tcNoLabel;
    private javax.swing.JTextField tcNoText;
    private javax.swing.JLabel telefonNoLabel;
    private javax.swing.JTextField telefonNotext;
    private javax.swing.JLabel yeniSifreLabel;
    private javax.swing.JPasswordField yeniSifreText;
    // End of variables declaration//GEN-END:variables
}
