/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penerapanmethodnonvoid;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class VOlumeKubus {
    Scanner in = new Scanner (System.in);
    double sisi, hitung, total;
    String hasil;
    
    double sisi(){
        System.out.println("Masukkan sisi Kubus :");
        sisi = in.nextDouble();
        return sisi;
        
    }
    double total(){
    total = sisi * sisi * sisi;
    return total;
    }
    String hasil(){
        System.out.println("========================================");
        System.out.println("Hasil volume Kubus :"+total);
        return hasil;
    }
}

