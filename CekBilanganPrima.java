import java.util.Scanner;

public class CekBilanganPrima {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int N = scanner.nextInt();

        if (isPrima(N)) {
            System.out.println("YA");
        } else {
            System.out.println("TIDAK");
        }
    }

    
    public static boolean isPrima(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) return false;
        }

        return true;
    }
}