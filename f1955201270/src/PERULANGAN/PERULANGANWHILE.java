/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PERULANGAN;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO 110-14IAP
 */
public class PERULANGANWHILE {
    public static void main(String[] args) {
        
      // Deklarasi veriabel
      int jumlahsks, perulangan;
      String strJumlahsks, strNilai;
      double nilai, jumlah, rata2;
 
      // Memberi nilai awal ke variabel
      perulangan = 1;
      jumlah = 0;
 
      // Input jumlah mahasiswa unu
      strJumlahsks = JOptionPane.showInputDialog(null, "Masukkan jumlah sks!",
         "Jumlah sks", JOptionPane.QUESTION_MESSAGE);
       
      // konversi ke integer
      jumlahsks = Integer.parseInt(strJumlahsks);
 
      if (jumlahsks < 1)
         System.exit(0);
       
      // Input nilai mahasiswa unu
      while (perulangan <= jumlahsks) {
       
         // Input nilai mahasiswa unu
         strNilai = JOptionPane.showInputDialog(null, "Masukkan nilai sks ke " +
            perulangan, "Nilai sks", JOptionPane.QUESTION_MESSAGE);
 
         // Konversi ke Integer
         nilai = Double.parseDouble(strNilai);
 
         jumlah = jumlah + nilai;
         perulangan = perulangan + 1;
 
      } // Akhir pernyataan while
 
      // Membuat obyek untuk memformat angka
      DecimalFormat duaAngka = new DecimalFormat("0.00");
 
      rata2 = jumlah / jumlahsks;
 
      JOptionPane.showMessageDialog(null, "Jumlah sks : " + jumlahsks +
         "\nTotal nilai sks : " + duaAngka.format(jumlah) + "\nNilai rata-rata : " +
         duaAngka.format(rata2), "Nilai Rata-Rata mahasiswa", JOptionPane.INFORMATION_MESSAGE);
 
      // Mengakhiri program GUI
      System.exit(0);
 
   } // Akhir metoda main
} // Akhir kelas NilaiRata2

