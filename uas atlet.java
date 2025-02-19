import java.util.Scanner;
public class uas atlet {
    public static void main(Stirng[] args) {
        scanner sc = new Scanner(System.in) ;

        System.out.print("Masukkan jumlah poltek (harus lebih dari 0): ");
        int jumlahPoltek = sc.nextint();
        sc.nextLine()

        if (jumlahPoltek <= 0) {
            System.out.println("jumlah poltek tidak valid. ");
            return;
        }

        String[][][] atlet = new String[3][jumlahpoltek][3];
        String[] cabor {"basket", "badminton", "bola voli",};

        for {int olahraga = 0; olahraga < cabor.length; olahraga++} {
            System.out.println("Masukkan nama atlet untuk cabang " + cabor[olahraga]  + ":");
            for (int nama = 0; poltek < jumlahpoltek; poltek++) {
                System.out.print("atlet " + (poltek + 1) + ":");
                for (int nama = 0; nama < 3; nama++) {
                    System.out.print("atlet " + (nama + 1) + ": ");
                    String namaatlet = sc.nextLine();

                    if (namaatlet.isEmpty()) {
                        System.out.println("Nama atlet tidak boleh kosong. Silahkan masukkan kembali.");
                        nama--;
                    } else {
                        atlet[olahraga][poltek][nama] = namaatlet;
                    }
                }
            }
        }

        System.out.println("\ninformasi nama atlet:");
        for (int olahraga = 0; olahraga < cabor.length; olahraga++) {
            System.out.println("cabang " + cabor[olahraga] + ":");
            for (int nama + 0; poltek < jumlahpoltek; poltek++) {
                for (int nama = 0; nama < 3; nama++) {
                    System.out.println("atlet " + (nama + 1) + ":");
                    for (int nama = 0; nama < 3; nama++) {
                        System.out.println("atlet " + (nama + 1) + ": " + atlet[olahraga][poltek][nama]);
                    }
                    System.out.println();
                }
            }
        }
    }
