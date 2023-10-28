package si_regpagi_22166030_latihan19_saldotabungan;
import java.util.Scanner;
/**
 *
 * @author 
 * Nama     : Dwi Ayu Lestari
 * Prodi    : Sistem Informasi
 * NIM      : 22166030
 * Deskripsi program : Pembuatan program saldo tabungan dengan saldo awal Rp. 2.500.000, bunga per bulan 15%, dan lama 6 bulan
 */
public class SI_RegPagi_22166030_Latihan19_SaldoTabungan {
    public static void main(String[] args) {
        // Inisialisasi saldo awal dan bunga per bulan
        double saldoAwal = 2500000; // Saldo Awal
        double bungaPerBulan = 0.15; // Bunga per bulan (15%)
        int bulan = 1; // Mulai dari bulan pertama
        System.out.println("============Saldo Tabungan============");

        while (bulan <= 6) {
            // Menghitung bunga
            double bunga = saldoAwal * bungaPerBulan;

            // Menambahkan bunga ke saldo awal
            saldoAwal += bunga;
            
            // Menampilkan saldo setiap bulan
            System.out.println("Saldo di bulan ke- " + bulan + ": Rp. " + saldoAwal);

            bulan++; // Pindah ke bulan berikutnya
        }
    }
        
    
}
