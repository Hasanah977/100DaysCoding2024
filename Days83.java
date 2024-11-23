public class Days83 {
  public static void main(String args[]) {

      int[] angka; 

        
        angka = new int[5]; 

        
        angka[0] = 100;
        angka[1] = 200; 
        angka[2] = 300; 
        angka[3] = 400; 
        angka[4] = 500; 

        System.out.println("Elemen Array:");
        for (int a = 0; a < angka.length; a++) {
            System.out.println("angka[" + a + "] = " + angka[a]);
        }

        
        String[] nama = {"khazana", "prezekc", "zekc", "maco"};
        System.out.println("\nArray Nama:");
        for (int a = 0; a < nama.length; a++) {
            System.out.println("nama[" + a + "] = " + nama[a]);
        }

  }
    
} 
