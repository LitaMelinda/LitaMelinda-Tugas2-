
package id.blits.litamelinda;

import java.util.Scanner;


public class TugasArrayLita {
 
  

    public static void main(String[] args) {
     Scanner input = new Scanner (System.in); 
        String[] nama = new String [25];
        int [] nilai = new int [5];
        int l;
       
        System.out.println("Masukkan Panjang Array :");
        l = new Scanner (System.in).nextInt();
        
        for (int x=0;x<l;x++){
        System.out.println("Masukkan Nama :");
        nama[x]= new Scanner(System.in).nextLine();
        System.out.println("Masukkan Nilai :");
        nilai[x]= new Scanner(System.in).nextInt();
        }
        
        for (int x=0;x<l;x++){
            
        System.out.println("nama ke="+nama[x]);
        System.out.println("dengan nilai="+nilai[x]);
        
     
        
        
        
        }
        
    }
    
    
}
