/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import static java.time.Clock.system;

/**
 *
 * @author LENOVO 110-14IAP
 */
public class contohBufferedReader {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        String nama = "";
        String alamat = "";
        String kelamin = "";
        String agama = "";
        String status = "";
        String nomor = "";
        
        //object InputStream
        InputStreamReader isr = new InputStreamReader(System.in);
        //object bufferedReader
        BufferedReader br = new BufferedReader (isr);
        
        //mengisi variabel nmama dengan bufferedReader
        System.out.println("siapa nama anda?");
        nama = br.readLine();
        
        System.out.println("dimana anda tinggal?");
        alamat = br.readLine();
        
        System.out.println("apa jenis kelamin anda?");
        kelamin = br.readLine();
        
        System.out.println("apa agama anda?");
        agama = br.readLine();
        
        System.out.println("bagaimana status anda saat ini?");
        status = br.readLine();
        
        System.out.println("berapa no sepatu anda?");
        nomor = br.readLine();
        //menampilkan nama
        System.out.println("nama anda adalah " + nama);
        System.out.println("alamat anda berada di " + alamat);
        System.out.println("kelamin anda adalah " + kelamin);
        System.out.println("agama anda adalah " + agama);
        System.out.println("status anda " + status);
        System.out.println("no sepatu anda " + nomor);



        
    }
    
}
