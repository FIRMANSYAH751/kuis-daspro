import java.util.Scanner;

public class Kuis4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan gaji pokok: Rp. ");
        double gajiPokok = scanner.nextDouble();
        
        System.out.print("Masukkan total jam kerja: ");
        int jamKerja = scanner.nextInt();
        
        double tunjangan = 0.20 * gajiPokok;
        
        double lembur = 0;
        if (jamKerja > 200) {
            lembur = (jamKerja - 200) * 2000;
        }
        
        double totalGaji = gajiPokok + tunjangan + lembur;
        
        double pajak = 0.10 * totalGaji;
        
        double gajiBersih = totalGaji - pajak;
        
        System.out.println("\nRincian Gaji Pegawai:");
        System.out.println("Gaji Pokok: Rp. " + gajiPokok);
        System.out.println("Tunjangan (20%): Rp. " + tunjangan);
        System.out.println("Lembur: Rp. " + lembur);
        System.out.println("Total Gaji Sebelum Pajak: Rp. " + totalGaji);
        System.out.println("Pajak (10%): Rp. " + pajak);
        System.out.println("Gaji Bersih: Rp. " + gajiBersih);
        
        scanner.close();
    }
}     