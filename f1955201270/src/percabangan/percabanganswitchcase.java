/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percabangan;

/**
 *
 * @author LENOVO 110-14IAP
 */
public class percabanganswitchcase {
    public static void main(String[] args) {
        char grade = 'C';
              switch(grade) {
         case 'A' :
            System.out.println("istimewa!");
            break;
         case 'B' :
            System.out.println("terus tingkatkan!");
            break;
         case 'C' :
            System.out.println("yuk lebih giat belajarnya");
            break;
         case 'D' :
            System.out.println("waduh ayo semangat");
         case 'F' :
            System.out.println("hemmm  bagaimana in"
                    + "");
            break;
         default :
            System.out.println("Invalid grade");
      }
      System.out.println("Your grade is " + grade);

    }
  
         
}
