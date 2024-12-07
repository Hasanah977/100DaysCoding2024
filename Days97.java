import java.util.Scanner;
public class Days97 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input angka : ");
        int n = sc.nextInt();

        System.out.print("bilangan prima dari 1 hingga " + n + " : ");
        for (int i = 2; i <= n; i++) {
            if (isPrima(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrima(int nn) {
        if (nn < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(nn); i++) {
            if (nn % i == 0) {
                return false;
            }
        }
        return true;
    }
}
