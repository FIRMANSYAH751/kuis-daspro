import java.util.Scanner;

public class Kuis3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Pilih jenis layanan:");
        System.out.println("1. Perjalanan Motor");
        System.out.println("2. Pemesanan Makanan");
        System.out.println("3. Pengiriman Barang");
        
        System.out.print("Masukkan pilihan layanan (1/2/3): ");
        int layanan = scanner.nextInt();
        
        System.out.print("Masukkan jarak (dalam km): ");
        double jarak = scanner.nextDouble();
        
        int tarif = 0;

        switch (layanan) {
            case 1:
                if (jarak <= 5) {
                    tarif = 7000;
                } else if (jarak <= 10) {
                    tarif = 10000;
                } else {
                    tarif = 15000;
                }
                break;
                
            case 2: 
                if (jarak <= 5) {
                    tarif = 10000;
                } else if (jarak <= 10) {
                    tarif = 13000;
                } else {
                    tarif = 20000;
                }
                break;
                
            case 3: 
                if (jarak <= 5) {
                    tarif = 12000;
                } else if (jarak <= 10) {
                    tarif = 17000;
                } else {
                    tarif = 25000;
                }
                break;
                
            default:
                System.out.println("Pilihan layanan tidak valid!");
                return;
        }
        
        System.out.println("Jenis Layanan: " + (layanan == 1 ? "Perjalanan Motor" : (layanan == 2 ? "Pemesanan Makanan" : "Pengiriman Barang")));
        System.out.println("Jarak: " + jarak + " km");
        System.out.println("Tarif: Rp " + tarif);
    }
}