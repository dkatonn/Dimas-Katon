import java.util.Scanner;

public class AyamBakar {
    int hari;
    int harga;
    double jumlah;

    public AyamBakar(int harga) {
        this.harga = harga;
        System.out.println("Harga per potong: " + harga);
    }

    public AyamBakar(int jumlah, int hari) {
        this.jumlah = jumlah;
        this.hari = hari;
        int total = (int) (jumlah * hari);
        System.out.println("Total harga: " + total);
    }

    public static void pilihan() {
        Scanner input = new Scanner(System.in);
        System.out.println("1. Ayam Bakar Pedas");
        System.out.println("2. Ayam Bakar Manis");
        System.out.println("Silahkan pilih jenis ayam bakar: ");
        int pilih = input.nextInt();
        switch (pilih) {
            case 1 -> AyamBakar.pedas();
            case 2 -> AyamBakar.manis();
        }
    }

    public static void pedas() {
        Scanner input = new Scanner(System.in);
        System.out.println("====================");
        System.out.println("Pilih Jenis Ayam Bakar Pedas");
        System.out.println("====================");
        System.out.println("1. Ayam Bakar Pedas Biasa");
        System.out.println("2. Ayam Bakar Pedas Super");
        System.out.println("Masukkan Pilihan: ");
        int pilih1 = input.nextInt();
        switch (pilih1) {
            case 1 -> {
                AyamBakar biasa = new AyamBakar(15000);
                biasa.tampilAyamBakar();
            }
            case 2 -> {
                AyamBakar superPedas = new AyamBakar(20000);
                superPedas.tampilAyamBakar();
            }
        }
    }

    public static void manis() {
        Scanner input = new Scanner(System.in);
        System.out.println("====================");
        System.out.println("Pilih Jenis Ayam Bakar Manis");
        System.out.println("====================");
        System.out.println("1. Ayam Bakar Manis Biasa");
        System.out.println("2. Ayam Bakar Manis Super");
        System.out.println("Masukkan Pilihan: ");
        int pilih2 = input.nextInt();
        switch (pilih2) {
            case 1 -> {
                AyamBakar biasa = new AyamBakar(16000);
                biasa.tampilAyamBakar();
            }
            case 2 -> {
                AyamBakar superManis = new AyamBakar(21000);
                superManis.tampilAyamBakar();
            }
        }
    }

    void tampilAyamBakar() {
        Scanner input = new Scanner(System.in);
        System.out.print("Jumlah Potong yang dibeli: ");
        int jumlah = input.nextInt();
        int totalHarga = jumlah * harga;
        System.out.println("Anda memilih ayam bakar dengan total harga: " + totalHarga);
    }

    public static void main(String[] args) {
        AyamBakar.pilihan();
    }
}
