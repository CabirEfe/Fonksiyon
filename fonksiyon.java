/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
import java.util.Scanner;
public class fonksiyon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Bir Tam Sayı Giriniz: ");
        int sayi = input.nextInt();
        int sonuc = (sayi * 2) - (5 * sayi + 3);
        
        if(sonuc < 0)
        {
        System.out.println("Fonksiyonun Değeri = -1");
        }
        else if(sonuc == 0)
        {
        System.out.println("Fonksiyonun Değeri = 0");
        }
        else
        {
        System.out.println("Fonksiyonun Değeri = 1");
        }
        
        
        
        
        
        
    }
    
}
