/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author phucn
 */
public class DataMessageDialog {
        
    //  thông báo thông tin 
    public static void showMessageDialog(Component parent, String content, String title){
        JOptionPane.showMessageDialog(parent, content, title, JOptionPane.INFORMATION_MESSAGE);
    }
    // thông báo lỗi
    public static void showErrorDialog(Component parent, String content, String title){
        JOptionPane.showMessageDialog(parent, content, title, JOptionPane.ERROR_MESSAGE);
    }
    // thông báo xác nhận
    public static int showConfirmDialog(Component parent, String content, String title){
       int choose = JOptionPane.showConfirmDialog(parent, content, title,JOptionPane.YES_NO_OPTION ,JOptionPane.QUESTION_MESSAGE);
       return choose;
    }
}
