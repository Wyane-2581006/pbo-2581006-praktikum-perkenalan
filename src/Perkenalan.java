import java.util.Scanner;

public class Perkenalan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama anda: ");
        String nama = scanner.nextLine();

        System.out.print("Silahkan Input NIM anda: ");
        int nim = scanner.nextInt();

        System.out.print("Silahkan Masukkan Umur anda: ");
        int umur = scanner.nextInt();

        System.out.print("Silahkan Masukkan Tinggi Badan anda: ");
        double tinggi = scanner.nextDouble();

        scanner.nextLine();

        System.out.print("Masukkan Asal Kota anda: ");
        String asalKota = scanner.nextLine();

        System.out.println("Halo! Nama Saya " + nama + "(NIM" + nim + "), " + "Umur saya " + umur + " tahun, " + "Tinggi Badan saya " + tinggi + " cm, " + "Saya berasal dari " + asalKota + ".");
    }
}
