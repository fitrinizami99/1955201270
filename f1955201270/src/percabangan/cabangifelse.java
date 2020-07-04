package percabangan;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO 110-14IAP
 */
public class cabangifelse {
    public static void main(String[] args) {
String tanggal1;
String Bulan1;
int tanggal;
int Bulan;
tanggal1 = JOptionPane.showInputDialog("inputkan Tanggal Lahir Anda : ");
tanggal = Integer.parseInt(tanggal1);
Bulan1 = JOptionPane.showInputDialog("Inputkan Bulan Lahir Anda :");
Bulan = Integer.parseInt(Bulan1);
if (tanggal >=21 && tanggal <=31 && Bulan ==1) {
JOptionPane.showMessageDialog(null,"Bintang Anda Aquarius"); }
else if (tanggal >=1 && tanggal <=19 && Bulan == 2) {
JOptionPane.showMessageDialog(null, "Bintang Anda adalah Aquarius"); }
else if (tanggal <=20 && tanggal <=29 && Bulan == 2) {
JOptionPane.showMessageDialog(null,"Bintang anda Adalah Pisces"); }
else if (tanggal >=1 && tanggal <=20 && Bulan == 3) {
JOptionPane.showMessageDialog(null, "Bintang Anda Adalah Pisces"); }
else if (tanggal >=21 && tanggal <=31 && Bulan == 3) {
JOptionPane.showMessageDialog(null, "Bintang Anda Adalah Aries"); }
else if (tanggal >=1 && tanggal <=20 && Bulan == 4) {
JOptionPane.showMessageDialog(null,"Bintang Anda Adalah Aries"); }
else if (tanggal >=21 && tanggal <=30 && Bulan == 4) {
JOptionPane.showMessageDialog(null, "Bintang Anda Adalah Taurus"); }
else if (tanggal >=1 && tanggal <=20 && Bulan == 5) {
JOptionPane.showMessageDialog(null, "Bintang Anda Adalah Taurus"); }
else if (tanggal >=21 && tanggal <=31 && Bulan == 5) {
JOptionPane.showMessageDialog(null, "Gemini"); }
else if (tanggal >=1 && tanggal <=20 && Bulan == 6) {
JOptionPane.showMessageDialog(null, "Bintang Anda Adalah Gemini"); }
else if (tanggal >=21 && tanggal <=30 && Bulan == 6) {
JOptionPane.showMessageDialog(null, "Bintang Anda Adalah Cancer"); }
else if (tanggal >=1 && tanggal <=22 && Bulan == 7) {
JOptionPane.showMessageDialog(null, "Bintang Anda Adalah Cancer"); }
else if (tanggal >=23 && tanggal <=31 && Bulan == 7) {
JOptionPane.showMessageDialog(null, "Bintang Anda adalah Leo"); }
else if (tanggal >=1 && tanggal <=22 && Bulan == 8) {
JOptionPane.showMessageDialog(null, "Bintang Anda Adalah Leo"); }
else if (tanggal >=23 && tanggal <=31 && Bulan == 8) {
JOptionPane.showMessageDialog(null, "Bintang Anda Adalah Virgo"); }
else if (tanggal >=1 && tanggal <=22 && Bulan == 9) {
JOptionPane.showMessageDialog(null, "Bintang Anda Adalah Virgo"); }
else if (tanggal >=23 && tanggal <=30 && Bulan == 9) {
JOptionPane.showMessageDialog(null, "Bintang Anda Adalah Libra"); }
else if (tanggal >=1 && tanggal <=22 && Bulan == 10) {
JOptionPane.showMessageDialog(null, "Bintang anda Adalah Libra"); }
else if (tanggal >=23 && tanggal <=31 && Bulan == 10) {
JOptionPane.showInternalMessageDialog(null, "Bintang Anda Adalah Scorpio"); }
else if (tanggal >=1 && tanggal <=22 && Bulan == 11) {
JOptionPane.showMessageDialog(null, "Bintang Anda Scorpio"); }
else if (tanggal >=23 && tanggal <=30 && Bulan == 11) {
JOptionPane.showInternalMessageDialog(null, "Bintang Anda Adalah Sagitarius"); }
else if (tanggal >=1 && tanggal <=22 && Bulan == 12) {
JOptionPane.showMessageDialog(null, "Bintang Anda Adalah Sagitarius"); }
else if (tanggal >=23 && tanggal <=31 && Bulan == 12) {
JOptionPane.showMessageDialog(null, "Bintang Anda Adalah Capicorn"); }
else if (tanggal >=1 && tanggal <=20 && Bulan == 1) {
JOptionPane.showMessageDialog(null, "Bintang Anda Adalah Capicorn"); }
else {
JOptionPane.showMessageDialog(null, "Data Yang Anda Masukkan Salah"); }
    }
}
