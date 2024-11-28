import java.util.Scanner;

public class AyamBakar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        AyamBakar.pilihan();
        System.out.print("\nTransaksi lagi? Ya=1, Tidak=2: ");
        int transaksiLagi = input.nextInt();
        if (transaksiLagi == 1) {
            AyamBakar.pilihan();
        }
    }
}