public class Days92 {
public static void main(String[] args) {
int n = 10; 

        for (int i = 1; i <= n; i++) {
            
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }

            
            System.out.print("*");

         
            for (int j = 1; j <= (2 * (n - i) - 1); j++) {
                System.out.print(" ");
            }

           
            if (i != n) {
                System.out.print("*");
            }

            System.out.println();
        }
}
}
