public class Days64 {
    public static void main(String[] args) {
        outerLoop: // Label untuk outer loop
        for (int a = 0; a < 3; a++) {
            System.out.println("Outer loop a: " + a);
            
            for (int b = 0; b < 3; b++) {
                if (a == 1 && b == 1) {
                    System.out.println("Break outerLoop at a=1, b=1");
                    break outerLoop; // Keluar dari outer loop
                }
                System.out.println("  Inner loop b: " + b);
            }
        }
    }
}

