/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbaru;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO 110-14IAP
 */
public class utsfitri {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char jeniskelamin = 'w';
        //nested if
        if (jeniskelamin=='l')
         
        System.out.println("laki laki");
        else if (jeniskelamin=='w')
        System.out.println("wanita"); 
        else
        System.out.println("waria");
        //tenary
        System.out.println(jeniskelamin=='w'? "dia pasti laki laki.":"dia pasti wanita");
         // Deklarasi veriabel
      int jumlahmatakuliah, perulangan;
      String strJumlahmatakuliah, strNilai;
      double nilai, jumlah, rata2;
 
      // Memberi nilai awal ke variabel
      perulangan = 1;
      jumlah = 0;
 
      // Input jumlah mahasiswa
      strJumlahmatakuliah = JOptionPane.showInputDialog(null, "Masukkan jumlah mata kuliah!",
         "Jumlah matakuliah", JOptionPane.QUESTION_MESSAGE);
       
      // konversi ke integer
      jumlahmatakuliah = Integer.parseInt(strJumlahmatakuliah);
 
      if (jumlahmatakuliah < 1)
         System.exit(0);
       
      // Input nilai mahasiswa
      while (perulangan <= jumlahmatakuliah) {
       
         // Input nilai mahasiswa
         strNilai = JOptionPane.showInputDialog(null, "Masukkan nilai mata kuliah ke " +
            perulangan, "Nilai mata kuliah", JOptionPane.QUESTION_MESSAGE);
 
         // Konversi ke Integer
         nilai = Double.parseDouble(strNilai);
 
         jumlah = jumlah + nilai;
         perulangan = perulangan + 1;
 
      } // Akhir pernyataan while
 
      // Membuat obyek untuk memformat angka
      DecimalFormat duaAngka = new DecimalFormat("0.00");
 
      rata2 = jumlah / jumlahmatakuliah;
 
      JOptionPane.showMessageDialog(null, "Jumlah matakuliah : " + jumlahmatakuliah +
         "\nTotal nilai matakuliah : " + duaAngka.format(jumlah) + "\nNilai rata-rata : " +
         duaAngka.format(rata2), "Nilai Rata-Rata mahasiswa", JOptionPane.INFORMATION_MESSAGE);
 
      // Mengakhiri program GUI
      System.exit(0);
 
   } // Akhir metoda main
   } // Akhir kelas NilaiRata2
    
    
}
