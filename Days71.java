public class Days71 {

    // Method static untuk menghitung pangkat
    public static int power(int base, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }

    // Main method untuk menjalankan program
    public static void main(String[] args) {
        int result = power(2, 3); // Memanggil method static power
        System.out.println("2^3 = " + result); // Output: 2^3 = 8
    }
}

