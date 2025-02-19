import java.util.Scanner;

public class Kuis2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Jenis Kendaraan yang dapat diparkir:");
        System.out.println("1. Mobil");
        System.out.println("2. Motor");
        
        System.out.print("Masukkan jenis kendaraan (mobil/motor): ");
        String kendaraan = scanner.nextLine().toLowerCase();
        
        System.out.print("Masukkan lama parkir (dalam jam): ");
        int lamaParkir = scanner.nextInt();
        
        int biaya = 0;
        
        if (kendaraan.equals("mobil")) {
            biaya = 5000 * lamaParkir;
        } else if (kendaraan.equals("motor")) {
            biaya = 3000 * lamaParkir;
        } else {
            System.out.println("Jenis kendaraan tidak valid! Harus 'mobil' atau 'motor'.");
            return;
        }
        
        System.out.println("Jenis Kendaraan: " + kendaraan);
        System.out.println("Lama Parkir: " + lamaParkir + " jam");
        System.out.println("Total biaya parkir yang harus dibayar: Rp " + biaya);
    }
}