public class Days72 {

    // Method rekursif untuk menghitung faktorial
    public static int factorial(int n) {
        // Basis kasus: jika n == 0 atau n == 1, faktorialnya adalah 1
        if (n == 0 || n == 1) {
            return 1;
        } else {
            // Memanggil metode factorial() lagi dengan n - 1
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int number = 5;
        int result = factorial(number);
        System.out.println("Faktorial dari " + number + " adalah " + result);
    }
}


