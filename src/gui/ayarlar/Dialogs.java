
package gui.ayarlar;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Dialogs {
    
    public static void bosOlamazMesajiGoster(JFrame frame){
        JOptionPane.showMessageDialog(frame, "Tüm alanlar dolu olmalıdır!");
    }
    public static void ozelMesajGoster(JFrame frame, String message){
        JOptionPane.showMessageDialog(frame, message);
    }
}
