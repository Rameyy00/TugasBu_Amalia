import java.util.Scanner;

public class KonversiCelcius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        System.out.print("Masukkan suhu dalam Celcius: ");
        double celcius = scanner.nextDouble(); 
        double fahrenheit = (celcius * 9 / 5) + 32;
        System.out.println("Suhu dalam Fahrenheit: " + fahrenheit);
    }
}