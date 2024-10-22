
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class Days51 {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
          System.out.println("masukkan tanggal 10-15: ");
       int tanggal = c.nextInt();
       switch (tanggal) {
            case 10:
                System.out.println("SENIN");
                break;
            case 11:
                System.out.println("SELASA"); 
                break;
            case 12:
                System.out.println("RABU");
                break;
            case 13:
                System.out.println("KAMIS");
                break;
            case 14:
                System.out.println("JUMAT");
                break;
            case 15:
                System.out.println("SABTU");
            default:
                System.out.println("TANGGAL TIDAK VALID");
        }
    }
}
        
        
        
        
    
