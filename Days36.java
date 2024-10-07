/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class Days36 {
    public static void main(String[] args) {
        int ayam = 20;
        int bebek = 30;
        int jumlahhewan = ayam * bebek;
        
        System.out.println("jumlah hewan: " + jumlahhewan);
        
        int hewandijual = 10;
        
        System.out.println("sisa hewan: " + (jumlahhewan / hewandijual));
        
        int keuntunganjualhewan = ayam % bebek;
        
        System.out.println("keuntunganjualhewan: " + keuntunganjualhewan);
    }
}
