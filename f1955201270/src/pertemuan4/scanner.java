/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;

import java.util.Scanner;

/**
 *
 * @author LENOVO 110-14IAP
 */
public class scanner {
    public static void main(String[] args) {
        int angka = 0;
        int umur = 0;
        int nomor = 0;
        int anak = 0;
        int saudara = 0;
        
        //membuat scanner
        System.out.println("angka berapa yang anda suka?");
        Scanner inputUser = new Scanner(System.in);
        angka = Integer.parseInt(inputUser.nextLine());
        
        System.out.println("berapa umur anda?");
        inputUser = new Scanner(System.in);
        umur = Integer.parseInt(inputUser.nextLine());
        
        System.out.println("berapa nomor handphone anda?");
        inputUser = new Scanner(System.in);
        nomor = Integer.parseInt(inputUser.nextLine());
        
        System.out.println("anda anak ke berapa?");
        inputUser = new Scanner(System.in);
        anak = Integer.parseInt(inputUser.nextLine());
        
        System.out.println("berapa saudara anda?");
        inputUser = new Scanner(System.in);
        saudara = Integer.parseInt(inputUser.nextLine());
        //output
        System.out.println("angka yang anda suka adalah " + angka);
        System.out.println("umur anda adalah " + umur);
        System.out.println("nomor handphone anda adalah " + nomor);
        System.out.println("anda adalah anak ke " + anak);
        System.out.println("saudara anda ada " + saudara);
        
        
        
    }
 
}
