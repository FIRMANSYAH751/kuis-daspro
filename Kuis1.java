import java.util.Scanner;

public class Kuis1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jenis kendaraan (mobil/motor): ");
        String jenisKendaraan = sc.nextLine().toLowerCase();

        System.out.print("masukkan lama parkir (dalam jam) : ");
        int LamaParkir = sc.nextInt();

        int biayaPerjaam = 0;
        String JenisKendaraanOutput = "";

        if (jenisKendaraan.equals("mobil")) {
            biayaPerjaam = 5000;
            JenisKendaraanOutput = "mobil";
        } else if (jenisKendaraan.equals("motor")) {
            biayaPerjaam = 3000;
            JenisKendaraanOutput = "motor";
        } else {
            System.out.println("jenis kendaraan tidak valid!");
            return;
        }

        int TotalBiaya = biayaPerjaam * LamaParkir;

        System.out.println("jenis kendaraan: " + JenisKendaraanOutput);
        System.out.println("Lama parkir : " + LamaParkir + "jam");
        System.out.println("Total biaya yang harus dibayar : Rp" + TotalBiaya);
        
    }
}