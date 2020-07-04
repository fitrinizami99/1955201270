/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;

/**
 *
 * @author LENOVO 110-14IAP
 */
public class JOptionPane {
    public static void main(String[] args) {
        
        String question1 = "Siapa nama kucing Anda?";
        String nama = javax.swing.JOptionPane.showInputDialog(question1);
        
        
        String question2 = "Berapa Umur kucing Anda?";
        String umur = javax.swing.JOptionPane.showInputDialog(question2);
        
        String question3 = "apa makanan kesukaan kucing anda?";
        String makanan = javax.swing.JOptionPane.showInputDialog(question3);
        
        String question4 = "berapa kali anda memandikan kucing anda??";
        String memandikan = javax.swing.JOptionPane.showInputDialog(question4);
        
        
        String question5 = "memakai shampo apa?";
        String shampo = javax.swing.JOptionPane.showInputDialog(question5);
        
        // aoutput
        System.out.println("Datakucing Anda sebagai berikut:");
        System.out.println("Nama " + nama);
        System.out.println("Umur " + umur);
        System.out.println("makanan kesukaan kucing anda " + makanan);
        System.out.println("anda memandikan kucing " + memandikan);
        System.out.println("anda memakai " + shampo);
    }
}
