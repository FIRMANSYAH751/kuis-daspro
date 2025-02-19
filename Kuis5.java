import java.util.Scanner;

public class Kuis5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] cabangOlahraga = {"Badminton", "Tenis Meja", "Basket", "Bola Voli"};
        int atletPerCabang = 5;
    
        String[][] atlet = new String[cabangOlahraga.length][atletPerCabang];
        
        for (int i = 0; i < cabangOlahraga.length; i++) {
            System.out.println("Masukkan nama atlet untuk cabang olahraga " + cabangOlahraga[i] + ":");
            for (int j = 0; j < atletPerCabang; j++) {
                System.out.print("Atlet ke-" + (j + 1) + ": ");
                atlet[i][j] = scanner.nextLine();
            }
        }

        System.out.println("\nInformasi Nama Atlet Porseni 2024:");
        for (int i = 0; i < cabangOlahraga.length; i++) {
            System.out.println("\nCabang Olahraga: " + cabangOlahraga[i]);
            for (int j = 0; j < atletPerCabang; j++) {
                System.out.println("Atlet " + (j + 1) + ": " + atlet[i][j]);
            }
        }
    }
}